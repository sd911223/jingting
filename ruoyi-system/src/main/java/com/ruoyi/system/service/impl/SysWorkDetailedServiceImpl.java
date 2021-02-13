package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.SysPoliceBooth;
import com.ruoyi.system.domain.SysPoliceWork;
import com.ruoyi.system.domain.SysWorkDetailed;
import com.ruoyi.system.mapper.SysPoliceBoothMapper;
import com.ruoyi.system.mapper.SysPoliceWorkMapper;
import com.ruoyi.system.mapper.SysWorkDetailedMapper;
import com.ruoyi.system.service.ISysWorkDetailedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 每日工作填写Service业务层处理
 *
 * @author ruoyi
 * @date 2021-02-08
 */
@Service
public class SysWorkDetailedServiceImpl implements ISysWorkDetailedService {
    public static final Logger log = LoggerFactory.getLogger(SysWorkDetailedServiceImpl.class);
    @Autowired
    private SysWorkDetailedMapper sysWorkDetailedMapper;
    @Autowired
    private SysPoliceBoothMapper sysPoliceBoothMapper;
    @Autowired
    private SysPoliceWorkMapper sysPoliceWorkMapper;

    /**
     * 查询每日工作填写
     *
     * @param id 每日工作填写ID
     * @return 每日工作填写
     */
    @Override
    public SysWorkDetailed selectSysWorkDetailedById(Long id) {
        return sysWorkDetailedMapper.selectSysWorkDetailedById(id);
    }

    /**
     * 查询每日工作填写列表
     *
     * @param sysWorkDetailed 每日工作填写
     * @return 每日工作填写
     */
    @Override
    public List<SysWorkDetailed> selectSysWorkDetailedList(SysWorkDetailed sysWorkDetailed) {
        return sysWorkDetailedMapper.selectSysWorkDetailedList(sysWorkDetailed);
    }

    /**
     * 新增每日工作填写
     *
     * @param sysWorkDetailed 每日工作填写
     * @return 结果
     */
    @Override
    @Transactional
    public int insertSysWorkDetailed(SysWorkDetailed sysWorkDetailed) {
        log.info("添加工作日志,手机号->{},图片1:{},图片2{},图片3{},图片4:{}", sysWorkDetailed.getPhone(), sysWorkDetailed.getImgUrl1(), sysWorkDetailed.getImgUrl2(), sysWorkDetailed.getImgUrl3(), sysWorkDetailed.getImgUrl4());
        if (sysWorkDetailed.getPhone().equals("")) {
            log.info("添加工作任务异常,手机号->{}", sysWorkDetailed.getPhone());
            throw new BusinessException("添加工作任务异常，手机号：" + sysWorkDetailed.getPhone());
        }
        SysPoliceBooth sysPoliceBooth = new SysPoliceBooth();
        sysPoliceBooth.setPhone(sysWorkDetailed.getPhone());
        List<SysPoliceBooth> sysPoliceBoothList = sysPoliceBoothMapper.selectSysPoliceBoothList(sysPoliceBooth);
        SysPoliceBooth policeBooth = sysPoliceBoothList.get(0);
        if (policeBooth == null) {
            log.info("根据手机号查询不到机构信息,手机号->{}", sysWorkDetailed.getPhone());
            throw new BusinessException("根据手机号查询不到机构信息:" + sysWorkDetailed.getPhone());
        }
//        Date date = new Date();
//        String dateTime = DateUtils.dateTime(date);
//        Date dateTime1 = DateUtils.dateTime("yyyy-MM-dd", dateTime);
//        SysWorkDetailed sysWorkDetailed1 = new SysWorkDetailed();
//        sysWorkDetailed1.setPhone(sysWorkDetailed.getPhone());
//        sysWorkDetailed1.setWriteTime(dateTime1);
//        List<SysWorkDetailed> sysWorkDetaileds = sysWorkDetailedMapper.selectSysWorkDetailedList(sysWorkDetailed1);
//        if (!sysWorkDetaileds.isEmpty()) {
//            log.info("=============================进入修改工作日志==========================");
//            SysWorkDetailed sysWorkDetailed2 = sysWorkDetaileds.get(0);
//            sysWorkDetailed.setId(sysWorkDetailed2.getId());
//            sysWorkDetailedMapper.updateSysWorkDetailed(sysWorkDetailed);
//            return 1;
//        }

        sysWorkDetailed.setWriteTime(new Date());
        int workDetailed = sysWorkDetailedMapper.insertSysWorkDetailed(sysWorkDetailed);
        if (sysWorkDetailed.getId() == null) {
            log.info("获取不到工作任务主键ID,手机号->{}", sysWorkDetailed.getPhone());
            throw new BusinessException("获取不到工作任务主键ID:,手机号->{}" + sysWorkDetailed.getPhone());
        }
        SysPoliceWork sysPoliceWork = new SysPoliceWork();
        if (!sysWorkDetailed.getExistIssue1().equals("") ||
                !sysWorkDetailed.getExistIssue2().equals("") ||
                !sysWorkDetailed.getExistIssue3().equals("") ||
                !sysWorkDetailed.getExistIssue4().equals("") ||
                !sysWorkDetailed.getExistIssue5().equals("") ||
                !sysWorkDetailed.getExistIssue6().equals("") ||
                !sysWorkDetailed.getExistIssue7().equals("") ||
                !sysWorkDetailed.getExistIssue8().equals("") ||
                !sysWorkDetailed.getExistIssue9().equals("") ||
                !sysWorkDetailed.getExistIssue10().equals("") ||
                !sysWorkDetailed.getExistIssue11().equals("")
        ) {
            sysPoliceWork.setIsQuestion("是");
        } else {
            sysPoliceWork.setIsQuestion("否");
        }
        if (!sysWorkDetailed.getImplementSituation().equals("") ||
                !sysWorkDetailed.getImplementSituation1().equals("") ||
                !sysWorkDetailed.getImplementSituation2().equals("") ||
                !sysWorkDetailed.getImplementSituation3().equals("") ||
                !sysWorkDetailed.getImplementSituation4().equals("") ||
                !sysWorkDetailed.getImplementSituation5().equals("") ||
                !sysWorkDetailed.getImplementSituation6().equals("") ||
                !sysWorkDetailed.getImplementSituation7().equals("") ||
                !sysWorkDetailed.getImplementSituation8().equals("") ||
                !sysWorkDetailed.getImplementSituation9().equals("") ||
                !sysWorkDetailed.getImplementSituation10().equals("") ||
                !sysWorkDetailed.getImplementSituation11().equals("")) {
            sysPoliceWork.setIsModify("是");
        } else {
            sysPoliceWork.setIsModify("否");
        }
        sysPoliceWork.setReserved3(sysWorkDetailed.getPhone());
        sysPoliceWork.setReserved1(sysWorkDetailed.getId());
        sysPoliceWork.setWriteName(policeBooth.getName());
        sysPoliceWork.setAgencyName(policeBooth.getPoliceBoothName());
        sysPoliceWork.setWriteTime(new Date());
        sysPoliceWorkMapper.insertSysPoliceWork(sysPoliceWork);
        return workDetailed;
    }

    /**
     * 修改每日工作填写
     *
     * @param sysWorkDetailed 每日工作填写
     * @return 结果
     */
    @Override
    public int updateSysWorkDetailed(SysWorkDetailed sysWorkDetailed) {
        return sysWorkDetailedMapper.updateSysWorkDetailed(sysWorkDetailed);
    }

    /**
     * 删除每日工作填写对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysWorkDetailedByIds(String ids) {
        return sysWorkDetailedMapper.deleteSysWorkDetailedByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除每日工作填写信息
     *
     * @param id 每日工作填写ID
     * @return 结果
     */
    @Override
    public int deleteSysWorkDetailedById(Long id) {
        return sysWorkDetailedMapper.deleteSysWorkDetailedById(id);
    }
}

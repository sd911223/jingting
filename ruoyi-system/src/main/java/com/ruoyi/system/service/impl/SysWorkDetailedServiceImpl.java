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
        log.info("添加工作日志,手机号->{}", sysWorkDetailed.getPhone());
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
        Date date = new Date();
        String dateTime = DateUtils.dateTime(date);
        Date dateTime1 = DateUtils.dateTime("yyyy-MM-dd", dateTime);
        SysWorkDetailed sysWorkDetailed1 = new SysWorkDetailed();
        sysWorkDetailed1.setPhone(sysWorkDetailed.getPhone());
        sysWorkDetailed1.setWriteTime(dateTime1);
        List<SysWorkDetailed> sysWorkDetaileds = sysWorkDetailedMapper.selectSysWorkDetailedList(sysWorkDetailed1);
        if (!sysWorkDetaileds.isEmpty()) {
            sysWorkDetailedMapper.updateSysWorkDetailed(sysWorkDetaileds.get(0));
            return 1;
        }

        sysWorkDetailed.setWriteTime(dateTime1);
        int workDetailed = sysWorkDetailedMapper.insertSysWorkDetailed(sysWorkDetailed);
        if (sysWorkDetailed.getId() == null) {
            log.info("获取不到工作任务主键ID,手机号->{}", sysWorkDetailed.getPhone());
            throw new BusinessException("获取不到工作任务主键ID:,手机号->{}" + sysWorkDetailed.getPhone());
        }
        SysPoliceWork sysPoliceWork = new SysPoliceWork();
        sysPoliceWork.setReserved1(sysWorkDetailed.getId());
        sysPoliceWork.setWriteName(policeBooth.getName());
        sysPoliceWork.setAgencyName(policeBooth.getPoliceBoothName());
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

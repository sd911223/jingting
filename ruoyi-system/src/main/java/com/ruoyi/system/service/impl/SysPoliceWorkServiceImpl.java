package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.SysPoliceWork;
import com.ruoyi.system.mapper.SysPoliceWorkMapper;
import com.ruoyi.system.mapper.SysWorkDetailedMapper;
import com.ruoyi.system.service.ISysPoliceWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 工作详细Service业务层处理
 *
 * @author ruoyi
 * @date 2021-02-08
 */
@Service
public class SysPoliceWorkServiceImpl implements ISysPoliceWorkService {
    @Autowired
    private SysPoliceWorkMapper sysPoliceWorkMapper;
    @Autowired
    private SysWorkDetailedMapper sysWorkDetailedMapper;

    /**
     * 查询工作详细
     *
     * @param id 工作详细ID
     * @return 工作详细
     */
    @Override
    public SysPoliceWork selectSysPoliceWorkById(Long id) {
        return sysPoliceWorkMapper.selectSysPoliceWorkById(id);
    }

    /**
     * 查询工作详细列表
     *
     * @param sysPoliceWork 工作详细
     * @return 工作详细
     */
    @Override
    public List<SysPoliceWork> selectSysPoliceWorkList(SysPoliceWork sysPoliceWork) {
        return sysPoliceWorkMapper.selectSysPoliceWorkList(sysPoliceWork);
    }

    /**
     * 新增工作详细
     *
     * @param sysPoliceWork 工作详细
     * @return 结果
     */
    @Override
    public int insertSysPoliceWork(SysPoliceWork sysPoliceWork) {
        sysPoliceWork.setCreateTime(DateUtils.getNowDate());
        return sysPoliceWorkMapper.insertSysPoliceWork(sysPoliceWork);
    }

    /**
     * 修改工作详细
     *
     * @param sysPoliceWork 工作详细
     * @return 结果
     */
    @Override
    public int updateSysPoliceWork(SysPoliceWork sysPoliceWork) {
        return sysPoliceWorkMapper.updateSysPoliceWork(sysPoliceWork);
    }

    /**
     * 删除工作详细对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysPoliceWorkByIds(String ids) {
        String[] strArray = Convert.toStrArray(ids);
        List<String> list = Arrays.asList(strArray);
        list.forEach(e->{
            SysPoliceWork sysPoliceWork = sysPoliceWorkMapper.selectSysPoliceWorkById(Long.valueOf(e));
            sysWorkDetailedMapper.deleteSysWorkDetailedById(sysPoliceWork.getReserved1());
        });
        return sysPoliceWorkMapper.deleteSysPoliceWorkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工作详细信息
     *
     * @param id 工作详细ID
     * @return 结果
     */
    @Override
    public int deleteSysPoliceWorkById(Long id) {
        SysPoliceWork sysPoliceWork = sysPoliceWorkMapper.selectSysPoliceWorkById(id);
        sysWorkDetailedMapper.deleteSysWorkDetailedById(sysPoliceWork.getReserved1());
        return sysPoliceWorkMapper.deleteSysPoliceWorkById(id);
    }
}

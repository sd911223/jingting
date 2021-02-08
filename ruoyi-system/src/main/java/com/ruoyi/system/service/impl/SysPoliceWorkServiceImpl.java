package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPoliceWorkMapper;
import com.ruoyi.system.domain.SysPoliceWork;
import com.ruoyi.system.service.ISysPoliceWorkService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作详细Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-02-08
 */
@Service
public class SysPoliceWorkServiceImpl implements ISysPoliceWorkService 
{
    @Autowired
    private SysPoliceWorkMapper sysPoliceWorkMapper;

    /**
     * 查询工作详细
     * 
     * @param id 工作详细ID
     * @return 工作详细
     */
    @Override
    public SysPoliceWork selectSysPoliceWorkById(Long id)
    {
        return sysPoliceWorkMapper.selectSysPoliceWorkById(id);
    }

    /**
     * 查询工作详细列表
     * 
     * @param sysPoliceWork 工作详细
     * @return 工作详细
     */
    @Override
    public List<SysPoliceWork> selectSysPoliceWorkList(SysPoliceWork sysPoliceWork)
    {
        return sysPoliceWorkMapper.selectSysPoliceWorkList(sysPoliceWork);
    }

    /**
     * 新增工作详细
     * 
     * @param sysPoliceWork 工作详细
     * @return 结果
     */
    @Override
    public int insertSysPoliceWork(SysPoliceWork sysPoliceWork)
    {
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
    public int updateSysPoliceWork(SysPoliceWork sysPoliceWork)
    {
        return sysPoliceWorkMapper.updateSysPoliceWork(sysPoliceWork);
    }

    /**
     * 删除工作详细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysPoliceWorkByIds(String ids)
    {
        return sysPoliceWorkMapper.deleteSysPoliceWorkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工作详细信息
     * 
     * @param id 工作详细ID
     * @return 结果
     */
    @Override
    public int deleteSysPoliceWorkById(Long id)
    {
        return sysPoliceWorkMapper.deleteSysPoliceWorkById(id);
    }
}

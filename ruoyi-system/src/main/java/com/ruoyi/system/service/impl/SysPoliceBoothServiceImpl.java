package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPoliceBoothMapper;
import com.ruoyi.system.domain.SysPoliceBooth;
import com.ruoyi.system.service.ISysPoliceBoothService;
import com.ruoyi.common.core.text.Convert;

/**
 * 警亭管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
@Service
public class SysPoliceBoothServiceImpl implements ISysPoliceBoothService 
{
    @Autowired
    private SysPoliceBoothMapper sysPoliceBoothMapper;

    /**
     * 查询警亭管理
     * 
     * @param id 警亭管理ID
     * @return 警亭管理
     */
    @Override
    public SysPoliceBooth selectSysPoliceBoothById(Long id)
    {
        return sysPoliceBoothMapper.selectSysPoliceBoothById(id);
    }

    /**
     * 查询警亭管理列表
     * 
     * @param sysPoliceBooth 警亭管理
     * @return 警亭管理
     */
    @Override
    public List<SysPoliceBooth> selectSysPoliceBoothList(SysPoliceBooth sysPoliceBooth)
    {
        return sysPoliceBoothMapper.selectSysPoliceBoothList(sysPoliceBooth);
    }

    /**
     * 新增警亭管理
     * 
     * @param sysPoliceBooth 警亭管理
     * @return 结果
     */
    @Override
    public int insertSysPoliceBooth(SysPoliceBooth sysPoliceBooth)
    {
        return sysPoliceBoothMapper.insertSysPoliceBooth(sysPoliceBooth);
    }

    /**
     * 修改警亭管理
     * 
     * @param sysPoliceBooth 警亭管理
     * @return 结果
     */
    @Override
    public int updateSysPoliceBooth(SysPoliceBooth sysPoliceBooth)
    {
        return sysPoliceBoothMapper.updateSysPoliceBooth(sysPoliceBooth);
    }

    /**
     * 删除警亭管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysPoliceBoothByIds(String ids)
    {
        return sysPoliceBoothMapper.deleteSysPoliceBoothByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除警亭管理信息
     * 
     * @param id 警亭管理ID
     * @return 结果
     */
    @Override
    public int deleteSysPoliceBoothById(Long id)
    {
        return sysPoliceBoothMapper.deleteSysPoliceBoothById(id);
    }
}

package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysPoliceBooth;

/**
 * 警亭管理Service接口
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
public interface ISysPoliceBoothService 
{
    /**
     * 查询警亭管理
     * 
     * @param id 警亭管理ID
     * @return 警亭管理
     */
    public SysPoliceBooth selectSysPoliceBoothById(Long id);

    /**
     * 查询警亭管理列表
     * 
     * @param sysPoliceBooth 警亭管理
     * @return 警亭管理集合
     */
    public List<SysPoliceBooth> selectSysPoliceBoothList(SysPoliceBooth sysPoliceBooth);

    /**
     * 新增警亭管理
     * 
     * @param sysPoliceBooth 警亭管理
     * @return 结果
     */
    public int insertSysPoliceBooth(SysPoliceBooth sysPoliceBooth);

    /**
     * 修改警亭管理
     * 
     * @param sysPoliceBooth 警亭管理
     * @return 结果
     */
    public int updateSysPoliceBooth(SysPoliceBooth sysPoliceBooth);

    /**
     * 批量删除警亭管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysPoliceBoothByIds(String ids);

    /**
     * 删除警亭管理信息
     * 
     * @param id 警亭管理ID
     * @return 结果
     */
    public int deleteSysPoliceBoothById(Long id);
}

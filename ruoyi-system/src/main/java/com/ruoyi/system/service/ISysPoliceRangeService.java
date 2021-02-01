package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysPoliceRange;

/**
 * 位置检测Service接口
 * 
 * @author ruoyi
 * @date 2021-02-01
 */
public interface ISysPoliceRangeService 
{
    /**
     * 查询位置检测
     * 
     * @param id 位置检测ID
     * @return 位置检测
     */
    public SysPoliceRange selectSysPoliceRangeById(Long id);

    /**
     * 查询位置检测列表
     * 
     * @param sysPoliceRange 位置检测
     * @return 位置检测集合
     */
    public List<SysPoliceRange> selectSysPoliceRangeList(SysPoliceRange sysPoliceRange);

    /**
     * 新增位置检测
     * 
     * @param sysPoliceRange 位置检测
     * @return 结果
     */
    public int insertSysPoliceRange(SysPoliceRange sysPoliceRange);

    /**
     * 修改位置检测
     * 
     * @param sysPoliceRange 位置检测
     * @return 结果
     */
    public int updateSysPoliceRange(SysPoliceRange sysPoliceRange);

    /**
     * 批量删除位置检测
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysPoliceRangeByIds(String ids);

    /**
     * 删除位置检测信息
     * 
     * @param id 位置检测ID
     * @return 结果
     */
    public int deleteSysPoliceRangeById(Long id);
}

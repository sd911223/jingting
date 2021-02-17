package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysTimingCount;

/**
 * 统计Service接口
 * 
 * @author ruoyi
 * @date 2021-02-15
 */
public interface ISysTimingCountService 
{
    /**
     * 查询统计
     * 
     * @param id 统计ID
     * @return 统计
     */
    public SysTimingCount selectSysTimingCountById(Integer id);

    /**
     * 查询统计列表
     * 
     * @param sysTimingCount 统计
     * @return 统计集合
     */
    public List<SysTimingCount> selectSysTimingCountList(SysTimingCount sysTimingCount);

    /**
     * 新增统计
     * 
     * @param sysTimingCount 统计
     * @return 结果
     */
    public int insertSysTimingCount(SysTimingCount sysTimingCount);

    /**
     * 修改统计
     * 
     * @param sysTimingCount 统计
     * @return 结果
     */
    public int updateSysTimingCount(SysTimingCount sysTimingCount);

    /**
     * 批量删除统计
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysTimingCountByIds(String ids);

    /**
     * 删除统计信息
     * 
     * @param id 统计ID
     * @return 结果
     */
    public int deleteSysTimingCountById(Integer id);
}

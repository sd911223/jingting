package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysTimingCountMapper;
import com.ruoyi.system.domain.SysTimingCount;
import com.ruoyi.system.service.ISysTimingCountService;
import com.ruoyi.common.core.text.Convert;

/**
 * 统计Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-02-15
 */
@Service
public class SysTimingCountServiceImpl implements ISysTimingCountService 
{
    @Autowired
    private SysTimingCountMapper sysTimingCountMapper;

    /**
     * 查询统计
     * 
     * @param id 统计ID
     * @return 统计
     */
    @Override
    public SysTimingCount selectSysTimingCountById(Integer id)
    {
        return sysTimingCountMapper.selectSysTimingCountById(id);
    }

    /**
     * 查询统计列表
     * 
     * @param sysTimingCount 统计
     * @return 统计
     */
    @Override
    public List<SysTimingCount> selectSysTimingCountList(SysTimingCount sysTimingCount)
    {
        return sysTimingCountMapper.selectSysTimingCountList(sysTimingCount);
    }

    /**
     * 新增统计
     * 
     * @param sysTimingCount 统计
     * @return 结果
     */
    @Override
    public int insertSysTimingCount(SysTimingCount sysTimingCount)
    {
        return sysTimingCountMapper.insertSysTimingCount(sysTimingCount);
    }

    /**
     * 修改统计
     * 
     * @param sysTimingCount 统计
     * @return 结果
     */
    @Override
    public int updateSysTimingCount(SysTimingCount sysTimingCount)
    {
        return sysTimingCountMapper.updateSysTimingCount(sysTimingCount);
    }

    /**
     * 删除统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysTimingCountByIds(String ids)
    {
        return sysTimingCountMapper.deleteSysTimingCountByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除统计信息
     * 
     * @param id 统计ID
     * @return 结果
     */
    @Override
    public int deleteSysTimingCountById(Integer id)
    {
        return sysTimingCountMapper.deleteSysTimingCountById(id);
    }
}

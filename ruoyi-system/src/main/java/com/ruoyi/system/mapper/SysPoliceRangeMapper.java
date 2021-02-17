package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysPoliceRange;

import java.util.List;

/**
 * 位置检测Mapper接口
 *
 * @author ruoyi
 * @date 2021-02-01
 */
public interface SysPoliceRangeMapper {
    /**
     * 查询位置检测
     *
     * @param id 位置检测ID
     * @return 位置检测
     */
    SysPoliceRange selectSysPoliceRangeById(Long id);

    /**
     * 查询位置检测列表
     *
     * @param sysPoliceRange 位置检测
     * @return 位置检测集合
     */
    List<SysPoliceRange> selectSysPoliceRangeList(SysPoliceRange sysPoliceRange);

    /**
     * 新增位置检测
     *
     * @param sysPoliceRange 位置检测
     * @return 结果
     */
    int insertSysPoliceRange(SysPoliceRange sysPoliceRange);

    /**
     * 修改位置检测
     *
     * @param sysPoliceRange 位置检测
     * @return 结果
     */
    int updateSysPoliceRange(SysPoliceRange sysPoliceRange);

    /**
     * 删除位置检测
     *
     * @param id 位置检测ID
     * @return 结果
     */
    int deleteSysPoliceRangeById(Long id);

    /**
     * 批量删除位置检测
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteSysPoliceRangeByIds(String[] ids);

    /**
     * 查询0点到23:59的条数
     *
     * @param sysPoliceRange
     * @return
     */
    int selectSysPoliceRangeCount(SysPoliceRange sysPoliceRange);
}

package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysPoliceWork;

import java.util.List;

/**
 * 工作详细Mapper接口
 *
 * @author ruoyi
 * @date 2021-02-08
 */
public interface SysPoliceWorkMapper {
    /**
     * 查询工作详细
     *
     * @param id 工作详细ID
     * @return 工作详细
     */
    public SysPoliceWork selectSysPoliceWorkById(Long id);

    /**
     *
     */
    List<SysPoliceWork> selectSysPoliceWorkCount(SysPoliceWork sysPoliceWork);

    /**
     * 查询工作详细列表
     *
     * @param sysPoliceWork 工作详细
     * @return 工作详细集合
     */
    public List<SysPoliceWork> selectSysPoliceWorkList(SysPoliceWork sysPoliceWork);

    /**
     * 新增工作详细
     *
     * @param sysPoliceWork 工作详细
     * @return 结果
     */
    public int insertSysPoliceWork(SysPoliceWork sysPoliceWork);

    /**
     * 修改工作详细
     *
     * @param sysPoliceWork 工作详细
     * @return 结果
     */
    public int updateSysPoliceWork(SysPoliceWork sysPoliceWork);

    /**
     * 删除工作详细
     *
     * @param id 工作详细ID
     * @return 结果
     */
    public int deleteSysPoliceWorkById(Long id);

    /**
     * 批量删除工作详细
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysPoliceWorkByIds(String[] ids);
}

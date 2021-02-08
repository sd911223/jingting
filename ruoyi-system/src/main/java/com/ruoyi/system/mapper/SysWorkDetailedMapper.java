package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysWorkDetailed;

/**
 * 每日工作填写Mapper接口
 * 
 * @author ruoyi
 * @date 2021-02-08
 */
public interface SysWorkDetailedMapper 
{
    /**
     * 查询每日工作填写
     * 
     * @param id 每日工作填写ID
     * @return 每日工作填写
     */
    public SysWorkDetailed selectSysWorkDetailedById(Long id);

    /**
     * 查询每日工作填写列表
     * 
     * @param sysWorkDetailed 每日工作填写
     * @return 每日工作填写集合
     */
    public List<SysWorkDetailed> selectSysWorkDetailedList(SysWorkDetailed sysWorkDetailed);

    /**
     * 新增每日工作填写
     * 
     * @param sysWorkDetailed 每日工作填写
     * @return 结果
     */
    public int insertSysWorkDetailed(SysWorkDetailed sysWorkDetailed);

    /**
     * 修改每日工作填写
     * 
     * @param sysWorkDetailed 每日工作填写
     * @return 结果
     */
    public int updateSysWorkDetailed(SysWorkDetailed sysWorkDetailed);

    /**
     * 删除每日工作填写
     * 
     * @param id 每日工作填写ID
     * @return 结果
     */
    public int deleteSysWorkDetailedById(Long id);

    /**
     * 批量删除每日工作填写
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysWorkDetailedByIds(String[] ids);
}

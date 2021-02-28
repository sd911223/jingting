package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Tttt;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-02-28
 */
public interface TtttMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Tttt selectTtttById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tttt 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Tttt> selectTtttList(Tttt tttt);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tttt 【请填写功能名称】
     * @return 结果
     */
    public int insertTttt(Tttt tttt);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tttt 【请填写功能名称】
     * @return 结果
     */
    public int updateTttt(Tttt tttt);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTtttById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTtttByIds(String[] ids);
}

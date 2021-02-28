package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TtttMapper;
import com.ruoyi.system.domain.Tttt;
import com.ruoyi.system.service.ITtttService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-02-28
 */
@Service
public class TtttServiceImpl implements ITtttService 
{
    @Autowired
    private TtttMapper ttttMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Tttt selectTtttById(Long id)
    {
        return ttttMapper.selectTtttById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tttt 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Tttt> selectTtttList(Tttt tttt)
    {
        return ttttMapper.selectTtttList(tttt);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tttt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTttt(Tttt tttt)
    {
        return ttttMapper.insertTttt(tttt);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tttt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTttt(Tttt tttt)
    {
        return ttttMapper.updateTttt(tttt);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTtttByIds(String ids)
    {
        return ttttMapper.deleteTtttByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTtttById(Long id)
    {
        return ttttMapper.deleteTtttById(id);
    }
}

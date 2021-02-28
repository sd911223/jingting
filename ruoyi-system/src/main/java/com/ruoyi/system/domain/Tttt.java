package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 tttt
 * 
 * @author ruoyi
 * @date 2021-02-28
 */
public class Tttt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 测试字段1 */
    @Excel(name = "测试字段1")
    private String test1;

    /** 测试字段2 */
    @Excel(name = "测试字段2")
    private String test2;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTest1(String test1) 
    {
        this.test1 = test1;
    }

    public String getTest1() 
    {
        return test1;
    }
    public void setTest2(String test2) 
    {
        this.test2 = test2;
    }

    public String getTest2() 
    {
        return test2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("test1", getTest1())
            .append("test2", getTest2())
            .toString();
    }
}

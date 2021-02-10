package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工作详细对象 sys_police_work
 *
 * @author ruoyi
 * @date 2021-02-10
 */
public class SysPoliceWork extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String agencyName;

    /** 填报人 */
    @Excel(name = "填报人")
    private String writeName;

    /** 填报时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "填报时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date writeTime;

    /** 是否存在问题 */
    @Excel(name = "是否存在问题")
    private String isQuestion;

    /** 是否整改 */
    @Excel(name = "是否整改")
    private String isModify;

    /** 工作ID */
    @Excel(name = "工作ID")
    private Long reserved1;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date reserved2;

    /**  */
    @Excel(name = "")
    private String reserved3;

    /**  */
    @Excel(name = "")
    private String reserved4;

    /**  */
    @Excel(name = "")
    private String reserved5;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setAgencyName(String agencyName)
    {
        this.agencyName = agencyName;
    }

    public String getAgencyName()
    {
        return agencyName;
    }
    public void setWriteName(String writeName)
    {
        this.writeName = writeName;
    }

    public String getWriteName()
    {
        return writeName;
    }
    public void setWriteTime(Date writeTime)
    {
        this.writeTime = writeTime;
    }

    public Date getWriteTime()
    {
        return writeTime;
    }
    public void setIsQuestion(String isQuestion)
    {
        this.isQuestion = isQuestion;
    }

    public String getIsQuestion()
    {
        return isQuestion;
    }
    public void setIsModify(String isModify)
    {
        this.isModify = isModify;
    }

    public String getIsModify()
    {
        return isModify;
    }
    public void setReserved1(Long reserved1)
    {
        this.reserved1 = reserved1;
    }

    public Long getReserved1()
    {
        return reserved1;
    }
    public void setReserved2(Date reserved2)
    {
        this.reserved2 = reserved2;
    }

    public Date getReserved2()
    {
        return reserved2;
    }
    public void setReserved3(String reserved3)
    {
        this.reserved3 = reserved3;
    }

    public String getReserved3()
    {
        return reserved3;
    }
    public void setReserved4(String reserved4)
    {
        this.reserved4 = reserved4;
    }

    public String getReserved4()
    {
        return reserved4;
    }
    public void setReserved5(String reserved5)
    {
        this.reserved5 = reserved5;
    }

    public String getReserved5()
    {
        return reserved5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("agencyName", getAgencyName())
                .append("writeName", getWriteName())
                .append("writeTime", getWriteTime())
                .append("isQuestion", getIsQuestion())
                .append("isModify", getIsModify())
                .append("reserved1", getReserved1())
                .append("reserved2", getReserved2())
                .append("reserved3", getReserved3())
                .append("reserved4", getReserved4())
                .append("reserved5", getReserved5())
                .toString();
    }
}

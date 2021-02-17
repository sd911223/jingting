package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 统计对象 sys_timing_count
 * 
 * @author ruoyi
 * @date 2021-02-15
 */
public class SysTimingCount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Integer id;

    /** 偏离位置人数 */
    @Excel(name = "偏离位置人数")
    private Integer deviateNumber;

    /** 填报人数 */
    @Excel(name = "填报人数")
    private Integer reportNumber;

    /** 存在问题个数 */
    @Excel(name = "存在问题个数")
    private Integer questionNumber;

    /** 整改问题个数 */
    @Excel(name = "整改问题个数")
    private Integer rectifyNumber;

    /** 记录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date recordTime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setDeviateNumber(Integer deviateNumber) 
    {
        this.deviateNumber = deviateNumber;
    }

    public Integer getDeviateNumber() 
    {
        return deviateNumber;
    }
    public void setReportNumber(Integer reportNumber) 
    {
        this.reportNumber = reportNumber;
    }

    public Integer getReportNumber() 
    {
        return reportNumber;
    }
    public void setQuestionNumber(Integer questionNumber) 
    {
        this.questionNumber = questionNumber;
    }

    public Integer getQuestionNumber() 
    {
        return questionNumber;
    }
    public void setRectifyNumber(Integer rectifyNumber) 
    {
        this.rectifyNumber = rectifyNumber;
    }

    public Integer getRectifyNumber() 
    {
        return rectifyNumber;
    }
    public void setRecordTime(Date recordTime) 
    {
        this.recordTime = recordTime;
    }

    public Date getRecordTime() 
    {
        return recordTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deviateNumber", getDeviateNumber())
            .append("reportNumber", getReportNumber())
            .append("questionNumber", getQuestionNumber())
            .append("rectifyNumber", getRectifyNumber())
            .append("recordTime", getRecordTime())
            .toString();
    }
}

package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 警亭管理对象 sys_police_booth
 *
 * @author ruoyi
 * @date 2021-01-28
 */
public class SysPoliceBooth extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 手机号
     */
    @Excel(name = "手机号")
    private String phone;
    /**
     * 姓名
     */
    @Excel(name = "姓名")
    private String name;

    /**
     * 警亭名称
     */
    @Excel(name = "警亭名称")
    private String policeBoothName;

    /**
     * 经度
     */
    @Excel(name = "经度")
    private Double longitude;

    /**
     * 纬度
     */
    @Excel(name = "纬度")
    private Double latitude;

    /**
     * 区域范围（米）
     */
    @Excel(name = "区域范围")
    private Integer rangeArea;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPoliceBoothName(String policeBoothName) {
        this.policeBoothName = policeBoothName;
    }

    public String getPoliceBoothName() {
        return policeBoothName;
    }


    public Integer getRangeArea() {
        return rangeArea;
    }

    public void setRangeArea(Integer rangeArea) {
        this.rangeArea = rangeArea;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getDelFlag() {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("phone", getPhone())
                .append("policeBoothName", getPoliceBoothName())
                .append("delFlag", getDelFlag())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}

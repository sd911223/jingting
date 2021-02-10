package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 位置检测对象 sys_police_range
 *
 * @author ruoyi
 * @date 2021-02-01
 */
public class SysPoliceRange extends BaseEntity {
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
    private String userName;

    /**
     * 机构名称
     */
    @Excel(name = "机构名称")
    private String agencyName;

    /**
     * 距离范围
     */
    @Excel(name = "距离范围")
    private Double rangeDistance;

    /**
     * 是否在范围内
     */
    @Excel(name = "是否在范围内")
    private String isDistance;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getUserName() {
        return userName;
    }

    public String getAgencyName() {
        return agencyName;
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

    public void setRangeDistance(Double rangeDistance) {
        this.rangeDistance = rangeDistance;
    }

    public Double getRangeDistance() {
        return rangeDistance;
    }

    public void setIsDistance(String isDistance) {
        this.isDistance = isDistance;
    }

    public String getIsDistance() {
        return isDistance;
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
                .append("rangeDistance", getRangeDistance())
                .append("isDistance", getIsDistance())
                .append("delFlag", getDelFlag())
                .append("createTime", getCreateTime())
                .toString();
    }
}

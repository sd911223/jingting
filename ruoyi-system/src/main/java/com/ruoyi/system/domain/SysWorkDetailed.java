package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 每日工作填写对象 sys_work_detailed
 *
 * @author ruoyi
 * @date 2021-02-08
 */
public class SysWorkDetailed extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;
    /**
     * 手机号
     */
    private String phone;


    /**
     * 图片url
     */
    private String imgUrl1;

    /**
     * 图片url
     */
    private String imgUrl2;
    /**
     * 图片url
     */
    private String imgUrl3;
    /**
     * 图片url
     */
    private String imgUrl4;
    /**
     * 机构名称
     */
    private String agencyName;

    /**
     * 在岗辅警（人数）
     */
    @Excel(name = "在岗辅警")
    private String jobNumber;

    /**
     * 值班站长（姓名）
     */
    @Excel(name = "值班站长")
    private String userName;

    /**
     * 值班人员是否在岗在位（0是 1否）
     */
    @Excel(name = "值班人员是否在岗在位", readConverterExp = "0=是,1=否")
    private String isJob;

    /**
     * 值班人员是否存在脱岗（0是 1否）
     */
    @Excel(name = "值班人员是否存在脱岗", readConverterExp = "0=是,1=否")
    private String isNotJob;

    /**
     * 在岗人员是否与值班表一致（0是 1否）
     */
    @Excel(name = "在岗人员是否与值班表一致", readConverterExp = "0=是,1=否")
    private String isIdentical;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation;

    /**
     * 装备及桌面物品摆放是否整齐（0是 1否）
     */
    @Excel(name = "装备及桌面物品摆放是否整齐", readConverterExp = "0=是,1=否")
    private String goodsIsTidy;

    /**
     * 备勤室床铺、被褥是否整齐干净（0是 1否）
     */
    @Excel(name = "备勤室床铺、被褥是否整齐干净", readConverterExp = "0=是,1=否")
    private String beddingIsTidy;

    /**
     * 厨房碗筷摆放、储物柜整洁度是否达标（0是 1否）
     */
    @Excel(name = "厨房碗筷摆放、储物柜整洁度是否达标", readConverterExp = "0=是,1=否")
    private String tablewareIsTidy;

    /**
     * 便民警务站周边卫生是否达标（0是 1否）
     */
    @Excel(name = "便民警务站周边卫生是否达标", readConverterExp = "0=是,1=否")
    private String healthIsStandard;

    /**
     * 便民警务站内部是否存在卫生死角（0是 1否）
     */
    @Excel(name = "便民警务站内部是否存在卫生死角", readConverterExp = "0=是,1=否")
    private String healthIsBlind;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue1;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation1;

    /**
     * 值班人员着装是否规范（0是 1否）
     */
    @Excel(name = "值班人员着装是否规范", readConverterExp = "0=是,1=否")
    private String clothesIsStandard;

    /**
     * 民辅警是否存在留指甲、染头发等情况（0是 1否）
     */
    @Excel(name = "民辅警是否存在留指甲、染头发等情况", readConverterExp = "0=是,1=否")
    private String nailsIsStandard;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue2;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation2;

    /**
     * 巡逻车整体卫生情况是否达标（0是 1否）
     */
    @Excel(name = "巡逻车整体卫生情况是否达标", readConverterExp = "0=是,1=否")
    private String cardIsHealth;

    /**
     * 巡逻车是否按照要求配备灭火器、阻车钉等必要装备（0是 1否）
     */
    @Excel(name = "巡逻车是否按照要求配备灭火器、阻车钉等必要装备", readConverterExp = "0=是,1=否")
    private String cardIsEquipment;

    /**
     * 巡逻车车况是否良好（0是 1否）
     */
    @Excel(name = "巡逻车车况是否良好", readConverterExp = "0=是,1=否")
    private String cardIsSituation;

    /**
     * 巡逻车是否存在损坏未修理的地方（0是 1否）
     */
    @Excel(name = "巡逻车是否存在损坏未修理的地方", readConverterExp = "0=是,1=否")
    private String cardIsRepair;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue3;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation3;

    /**
     * 视频会议室卫生及桌面摆放是否合格（0是 1否）
     */
    @Excel(name = "视频会议室卫生及桌面摆放是否合格", readConverterExp = "0=是,1=否")
    private String videoIsHealth;

    /**
     * 视频会议室值班人员是否在岗在位（0是 1否）
     */
    @Excel(name = "视频会议室值班人员是否在岗在位", readConverterExp = "0=是,1=否")
    private String videoIsJob;

    /**
     * 视频会议室是否存在将手机带入情况（0是 1否）
     */
    @Excel(name = "视频会议室是否存在将手机带入情况", readConverterExp = "0=是,1=否")
    private String videoIsPhone;

    /**
     * 视频会议室着装是否规范（0是 1否）
     */
    @Excel(name = "视频会议室着装是否规范", readConverterExp = "0=是,1=否")
    private String videoIsBedding;

    /**
     * 视频会议室带班领导汇报情况是否达标（0是 1否）
     */
    @Excel(name = "视频会议室带班领导汇报情况是否达标", readConverterExp = "0=是,1=否")
    private String videoIsLeader;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue4;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation4;

    /**
     * 是否严格落实每日召开晨会（0是 1否）
     */
    @Excel(name = "是否严格落实每日召开晨会", readConverterExp = "0=是,1=否")
    private String meetingIsMeeting;

    /**
     * 晨会是否传达近期重要工作安排（0是 1否）
     */
    @Excel(name = "晨会是否传达近期重要工作安排", readConverterExp = "0=是,1=否")
    private String meetingIsJob;

    /**
     * 晨会记录是否详实、无造假情况（0是 1否）
     */
    @Excel(name = "晨会记录是否详实、无造假情况", readConverterExp = "0=是,1=否")
    private String meetingIsFake;

    /**
     * 是否学习国家通用语言（0是 1否）
     */
    @Excel(name = "是否学习国家通用语言", readConverterExp = "0=是,1=否")
    private String meetingIsLanguage;

    /**
     * 是否落实学习会议及文件（0是 1否）
     */
    @Excel(name = "是否落实学习会议及文件", readConverterExp = "0=是,1=否")
    private String meetingIsFile;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue5;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation5;

    /**
     * 是否制定符合本站实际的推进表（0是 1否）
     */
    @Excel(name = "是否制定符合本站实际的推进表", readConverterExp = "0=是,1=否")
    private String allIsAdvance;

    /**
     * 站长是否能够熟练掌握授课内容（0是 1否）
     */
    @Excel(name = "站长是否能够熟练掌握授课内容", readConverterExp = "0=是,1=否")
    private String allIsContent;

    /**
     * 每日训练日志是否填写完整（0是 1否）
     */
    @Excel(name = "每日训练日志是否填写完整", readConverterExp = "0=是,1=否")
    private String allIsLog;

    /**
     * 民辅警是否对已训练内容掌握熟练（0是 1否）
     */
    @Excel(name = "民辅警是否对已训练内容掌握熟练", readConverterExp = "0=是,1=否")
    private String allIsGrasp;

    /**
     * 国语学习是否制定推进计划（0是 1否）
     */
    @Excel(name = "国语学习是否制定推进计划", readConverterExp = "0=是,1=否")
    private String allIsLanguage;

    /**
     * 国语学习笔记是否按照推进计划书写（0是 1否）
     */
    @Excel(name = "国语学习笔记是否按照推进计划书写", readConverterExp = "0=是,1=否")
    private String allIsWrite;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue6;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation6;

    /**
     * 站长及内勤是否熟练掌握电子台账录入（0是 1否）
     */
    @Excel(name = "站长及内勤是否熟练掌握电子台账录入", readConverterExp = "0=是,1=否")
    private String electronIsGrasp;

    /**
     * 各类电子台账是否做到及时录入（0是 1否）
     */
    @Excel(name = "各类电子台账是否做到及时录入", readConverterExp = "0=是,1=否")
    private String electronIsInput;

    /**
     * 各类电子台账是否存在录入数据错误（0是 1否）
     */
    @Excel(name = "各类电子台账是否存在录入数据错误", readConverterExp = "0=是,1=否")
    private String electronIsError;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue11;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation11;

    /**
     * 内勤是否能够较好完成简报情报撰写（0是 1否）
     */
    @Excel(name = "内勤是否能够较好完成简报情报撰写", readConverterExp = "0=是,1=否")
    private String briefingIsWrite;

    /**
     * 简报情报信息是否按照要求进行上报（0是 1否）
     */
    @Excel(name = "简报情报信息是否按照要求进行上报", readConverterExp = "0=是,1=否")
    private String briefingIsSign;

    /**
     * 本周简报上报情况
     */
    @Excel(name = "本周简报上报情况")
    private String briefingIsSituation;

    /**
     * 情报上报情况
     */
    @Excel(name = "情报上报情况")
    private String briefingIsIntelligence;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue7;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation7;

    /**
     * 消毒液、洗手液等防疫物资是否齐全（0是 1否）
     */
    @Excel(name = "消毒液、洗手液等防疫物资是否齐全", readConverterExp = "0=是,1=否")
    private String epidemicIsSupplies;

    /**
     * 是否严格落实进门查验核酸检测卡、健康码、消毒灯制度（0是 1否）
     */
    @Excel(name = "是否严格落实进门查验核酸检测卡、健康码、消毒灯制度", readConverterExp = "0=是,1=否")
    private String epidemicIsCode;

    /**
     * 是否熟练掌握消毒液配比比例及方法（0是 1否）
     */
    @Excel(name = "是否熟练掌握消毒液配比比例及方法", readConverterExp = "0=是,1=否")
    private String epidemicIsDisinfection;

    /**
     * 消毒台账是否正确填写（0是 1否）
     */
    @Excel(name = "消毒台账是否正确填写", readConverterExp = "0=是,1=否")
    private String epidemicIsLedger;

    /**
     * 通风台账是否正确填写（0是 1否）
     */
    @Excel(name = "通风台账是否正确填写", readConverterExp = "0=是,1=否")
    private String epidemicIsVentilation;

    /**
     * 站内体温检测台账是否正确填写（0是 1否）
     */
    @Excel(name = "站内体温检测台账是否正确填写", readConverterExp = "0=是,1=否")
    private String epidemicIsTemperature;

    /**
     * 车辆消毒通风台账是否正确填写（0是 1否）
     */
    @Excel(name = "车辆消毒通风台账是否正确填写", readConverterExp = "0=是,1=否")
    private String epidemicIsCard;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue8;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation8;

    /**
     * 站长、副站长是否熟练掌握“三站联动”处置流程（0是 1否）
     */
    @Excel(name = "站长、副站长是否熟练掌握“三站联动”处置流程", readConverterExp = "0=是,1=否")
    private String minuteIsCircuit;

    /**
     * 是否熟练掌握警棍、盾牌等警用装备（0是 1否）
     */
    @Excel(name = "是否熟练掌握警棍、盾牌等警用装备", readConverterExp = "0=是,1=否")
    private String minuteIsEquipment;

    /**
     * 处置小组是否紧密配合、快速处置（0是 1否）
     */
    @Excel(name = "处置小组是否紧密配合、快速处置", readConverterExp = "0=是,1=否")
    private String minuteIsHandle;

    /**
     * 现场处置是否符合规范（0是 1否）
     */
    @Excel(name = "现场处置是否符合规范", readConverterExp = "0=是,1=否")
    private String minuteIsSpecification;

    /**
     * 执法仪等装备携带是否齐全（0是 1否）
     */
    @Excel(name = "执法仪等装备携带是否齐全", readConverterExp = "0=是,1=否")
    private String minuteIsComplete;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue9;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation9;

    /**
     * 值班交接台账是否填写完整（0是 1否）
     */
    @Excel(name = "值班交接台账是否填写完整", readConverterExp = "0=是,1=否")
    private String basisIsJoin;

    /**
     * 盘查台账是否填写完整（0是 1否）
     */
    @Excel(name = "盘查台账是否填写完整", readConverterExp = "0=是,1=否")
    private String basisIsIntact;

    /**
     * 视频巡控调度台账是否填写完整（0是 1否）
     */
    @Excel(name = "视频巡控调度台账是否填写完整", readConverterExp = "0=是,1=否")
    private String basisIsVideo;

    /**
     * 单位场所检查台账是否填写完整（0是 1否）
     */
    @Excel(name = "单位场所检查台账是否填写完整", readConverterExp = "0=是,1=否")
    private String basisIsCheck;

    /**
     * “十户联防”演练台账是否填写完整（0是 1否）
     */
    @Excel(name = "“十户联防”演练台账是否填写完整", readConverterExp = "0=是,1=否")
    private String basisIsLedger;

    /**
     * 一键式报警器测试台账是否填写完整（0是 1否）
     */
    @Excel(name = "一键式报警器测试台账是否填写完整", readConverterExp = "0=是,1=否")
    private String basisIsAlarm;

    /**
     * 站内一键式报警器测试台账是否填写完整（0是 1否）
     */
    @Excel(name = "站内一键式报警器测试台账是否填写完整", readConverterExp = "0=是,1=否")
    private String basisIsTest;

    /**
     * 三方通话测试台账是否填写完整（0是 1否）
     */
    @Excel(name = "三方通话测试台账是否填写完整", readConverterExp = "0=是,1=否")
    private String basisIsCall;

    /**
     * 存在问题
     */
    @Excel(name = "存在问题")
    private String existIssue10;

    /**
     * 整改落实情况
     */
    @Excel(name = "整改落实情况")
    private String implementSituation10;

    /**
     * 填写时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "填写时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date writeTime;

    public void setImgUrl1(String imgUrl1) {
        this.imgUrl1 = imgUrl1;
    }

    public void setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2;
    }

    public void setImgUrl3(String imgUrl3) {
        this.imgUrl3 = imgUrl3;
    }

    public void setImgUrl4(String imgUrl4) {
        this.imgUrl4 = imgUrl4;
    }

    public String getImgUrl1() {
        return imgUrl1;
    }

    public String getImgUrl2() {
        return imgUrl2;
    }

    public String getImgUrl3() {
        return imgUrl3;
    }

    public String getImgUrl4() {
        return imgUrl4;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setIsJob(String isJob) {
        this.isJob = isJob;
    }

    public String getIsJob() {
        return isJob;
    }

    public void setIsNotJob(String isNotJob) {
        this.isNotJob = isNotJob;
    }

    public String getIsNotJob() {
        return isNotJob;
    }

    public void setIsIdentical(String isIdentical) {
        this.isIdentical = isIdentical;
    }

    public String getIsIdentical() {
        return isIdentical;
    }

    public void setExistIssue(String existIssue) {
        this.existIssue = existIssue;
    }

    public String getExistIssue() {
        return existIssue;
    }

    public void setImplementSituation(String implementSituation) {
        this.implementSituation = implementSituation;
    }

    public String getImplementSituation() {
        return implementSituation;
    }

    public void setGoodsIsTidy(String goodsIsTidy) {
        this.goodsIsTidy = goodsIsTidy;
    }

    public String getGoodsIsTidy() {
        return goodsIsTidy;
    }

    public void setBeddingIsTidy(String beddingIsTidy) {
        this.beddingIsTidy = beddingIsTidy;
    }

    public String getBeddingIsTidy() {
        return beddingIsTidy;
    }

    public void setTablewareIsTidy(String tablewareIsTidy) {
        this.tablewareIsTidy = tablewareIsTidy;
    }

    public String getTablewareIsTidy() {
        return tablewareIsTidy;
    }

    public void setHealthIsStandard(String healthIsStandard) {
        this.healthIsStandard = healthIsStandard;
    }

    public String getHealthIsStandard() {
        return healthIsStandard;
    }

    public void setHealthIsBlind(String healthIsBlind) {
        this.healthIsBlind = healthIsBlind;
    }

    public String getHealthIsBlind() {
        return healthIsBlind;
    }

    public void setExistIssue1(String existIssue1) {
        this.existIssue1 = existIssue1;
    }

    public String getExistIssue1() {
        return existIssue1;
    }

    public void setImplementSituation1(String implementSituation1) {
        this.implementSituation1 = implementSituation1;
    }

    public String getImplementSituation1() {
        return implementSituation1;
    }

    public void setClothesIsStandard(String clothesIsStandard) {
        this.clothesIsStandard = clothesIsStandard;
    }

    public String getClothesIsStandard() {
        return clothesIsStandard;
    }

    public void setNailsIsStandard(String nailsIsStandard) {
        this.nailsIsStandard = nailsIsStandard;
    }

    public String getNailsIsStandard() {
        return nailsIsStandard;
    }

    public void setExistIssue2(String existIssue2) {
        this.existIssue2 = existIssue2;
    }

    public String getExistIssue2() {
        return existIssue2;
    }

    public void setImplementSituation2(String implementSituation2) {
        this.implementSituation2 = implementSituation2;
    }

    public String getImplementSituation2() {
        return implementSituation2;
    }

    public void setCardIsHealth(String cardIsHealth) {
        this.cardIsHealth = cardIsHealth;
    }

    public String getCardIsHealth() {
        return cardIsHealth;
    }

    public void setCardIsEquipment(String cardIsEquipment) {
        this.cardIsEquipment = cardIsEquipment;
    }

    public String getCardIsEquipment() {
        return cardIsEquipment;
    }

    public void setCardIsSituation(String cardIsSituation) {
        this.cardIsSituation = cardIsSituation;
    }

    public String getCardIsSituation() {
        return cardIsSituation;
    }

    public void setCardIsRepair(String cardIsRepair) {
        this.cardIsRepair = cardIsRepair;
    }

    public String getCardIsRepair() {
        return cardIsRepair;
    }

    public void setExistIssue3(String existIssue3) {
        this.existIssue3 = existIssue3;
    }

    public String getExistIssue3() {
        return existIssue3;
    }

    public void setImplementSituation3(String implementSituation3) {
        this.implementSituation3 = implementSituation3;
    }

    public String getImplementSituation3() {
        return implementSituation3;
    }

    public void setVideoIsHealth(String videoIsHealth) {
        this.videoIsHealth = videoIsHealth;
    }

    public String getVideoIsHealth() {
        return videoIsHealth;
    }

    public void setVideoIsJob(String videoIsJob) {
        this.videoIsJob = videoIsJob;
    }

    public String getVideoIsJob() {
        return videoIsJob;
    }

    public void setVideoIsPhone(String videoIsPhone) {
        this.videoIsPhone = videoIsPhone;
    }

    public String getVideoIsPhone() {
        return videoIsPhone;
    }

    public void setVideoIsBedding(String videoIsBedding) {
        this.videoIsBedding = videoIsBedding;
    }

    public String getVideoIsBedding() {
        return videoIsBedding;
    }

    public void setVideoIsLeader(String videoIsLeader) {
        this.videoIsLeader = videoIsLeader;
    }

    public String getVideoIsLeader() {
        return videoIsLeader;
    }

    public void setExistIssue4(String existIssue4) {
        this.existIssue4 = existIssue4;
    }

    public String getExistIssue4() {
        return existIssue4;
    }

    public void setImplementSituation4(String implementSituation4) {
        this.implementSituation4 = implementSituation4;
    }

    public String getImplementSituation4() {
        return implementSituation4;
    }

    public void setMeetingIsMeeting(String meetingIsMeeting) {
        this.meetingIsMeeting = meetingIsMeeting;
    }

    public String getMeetingIsMeeting() {
        return meetingIsMeeting;
    }

    public void setMeetingIsJob(String meetingIsJob) {
        this.meetingIsJob = meetingIsJob;
    }

    public String getMeetingIsJob() {
        return meetingIsJob;
    }

    public void setMeetingIsFake(String meetingIsFake) {
        this.meetingIsFake = meetingIsFake;
    }

    public String getMeetingIsFake() {
        return meetingIsFake;
    }

    public void setMeetingIsLanguage(String meetingIsLanguage) {
        this.meetingIsLanguage = meetingIsLanguage;
    }

    public String getMeetingIsLanguage() {
        return meetingIsLanguage;
    }

    public void setMeetingIsFile(String meetingIsFile) {
        this.meetingIsFile = meetingIsFile;
    }

    public String getMeetingIsFile() {
        return meetingIsFile;
    }

    public void setExistIssue5(String existIssue5) {
        this.existIssue5 = existIssue5;
    }

    public String getExistIssue5() {
        return existIssue5;
    }

    public void setImplementSituation5(String implementSituation5) {
        this.implementSituation5 = implementSituation5;
    }

    public String getImplementSituation5() {
        return implementSituation5;
    }

    public void setAllIsAdvance(String allIsAdvance) {
        this.allIsAdvance = allIsAdvance;
    }

    public String getAllIsAdvance() {
        return allIsAdvance;
    }

    public void setAllIsContent(String allIsContent) {
        this.allIsContent = allIsContent;
    }

    public String getAllIsContent() {
        return allIsContent;
    }

    public void setAllIsLog(String allIsLog) {
        this.allIsLog = allIsLog;
    }

    public String getAllIsLog() {
        return allIsLog;
    }

    public void setAllIsGrasp(String allIsGrasp) {
        this.allIsGrasp = allIsGrasp;
    }

    public String getAllIsGrasp() {
        return allIsGrasp;
    }

    public void setAllIsLanguage(String allIsLanguage) {
        this.allIsLanguage = allIsLanguage;
    }

    public String getAllIsLanguage() {
        return allIsLanguage;
    }

    public void setAllIsWrite(String allIsWrite) {
        this.allIsWrite = allIsWrite;
    }

    public String getAllIsWrite() {
        return allIsWrite;
    }

    public void setExistIssue6(String existIssue6) {
        this.existIssue6 = existIssue6;
    }

    public String getExistIssue6() {
        return existIssue6;
    }

    public void setImplementSituation6(String implementSituation6) {
        this.implementSituation6 = implementSituation6;
    }

    public String getImplementSituation6() {
        return implementSituation6;
    }

    public void setElectronIsGrasp(String electronIsGrasp) {
        this.electronIsGrasp = electronIsGrasp;
    }

    public String getElectronIsGrasp() {
        return electronIsGrasp;
    }

    public void setElectronIsInput(String electronIsInput) {
        this.electronIsInput = electronIsInput;
    }

    public String getElectronIsInput() {
        return electronIsInput;
    }

    public void setElectronIsError(String electronIsError) {
        this.electronIsError = electronIsError;
    }

    public String getElectronIsError() {
        return electronIsError;
    }

    public void setExistIssue11(String existIssue11) {
        this.existIssue11 = existIssue11;
    }

    public String getExistIssue11() {
        return existIssue11;
    }

    public void setImplementSituation11(String implementSituation11) {
        this.implementSituation11 = implementSituation11;
    }

    public String getImplementSituation11() {
        return implementSituation11;
    }

    public void setBriefingIsWrite(String briefingIsWrite) {
        this.briefingIsWrite = briefingIsWrite;
    }

    public String getBriefingIsWrite() {
        return briefingIsWrite;
    }

    public void setBriefingIsSign(String briefingIsSign) {
        this.briefingIsSign = briefingIsSign;
    }

    public String getBriefingIsSign() {
        return briefingIsSign;
    }

    public void setBriefingIsSituation(String briefingIsSituation) {
        this.briefingIsSituation = briefingIsSituation;
    }

    public String getBriefingIsSituation() {
        return briefingIsSituation;
    }

    public void setBriefingIsIntelligence(String briefingIsIntelligence) {
        this.briefingIsIntelligence = briefingIsIntelligence;
    }

    public String getBriefingIsIntelligence() {
        return briefingIsIntelligence;
    }

    public void setExistIssue7(String existIssue7) {
        this.existIssue7 = existIssue7;
    }

    public String getExistIssue7() {
        return existIssue7;
    }

    public void setImplementSituation7(String implementSituation7) {
        this.implementSituation7 = implementSituation7;
    }

    public String getImplementSituation7() {
        return implementSituation7;
    }

    public void setEpidemicIsSupplies(String epidemicIsSupplies) {
        this.epidemicIsSupplies = epidemicIsSupplies;
    }

    public String getEpidemicIsSupplies() {
        return epidemicIsSupplies;
    }

    public void setEpidemicIsCode(String epidemicIsCode) {
        this.epidemicIsCode = epidemicIsCode;
    }

    public String getEpidemicIsCode() {
        return epidemicIsCode;
    }

    public void setEpidemicIsDisinfection(String epidemicIsDisinfection) {
        this.epidemicIsDisinfection = epidemicIsDisinfection;
    }

    public String getEpidemicIsDisinfection() {
        return epidemicIsDisinfection;
    }

    public void setEpidemicIsLedger(String epidemicIsLedger) {
        this.epidemicIsLedger = epidemicIsLedger;
    }

    public String getEpidemicIsLedger() {
        return epidemicIsLedger;
    }

    public void setEpidemicIsVentilation(String epidemicIsVentilation) {
        this.epidemicIsVentilation = epidemicIsVentilation;
    }

    public String getEpidemicIsVentilation() {
        return epidemicIsVentilation;
    }

    public void setEpidemicIsTemperature(String epidemicIsTemperature) {
        this.epidemicIsTemperature = epidemicIsTemperature;
    }

    public String getEpidemicIsTemperature() {
        return epidemicIsTemperature;
    }

    public void setEpidemicIsCard(String epidemicIsCard) {
        this.epidemicIsCard = epidemicIsCard;
    }

    public String getEpidemicIsCard() {
        return epidemicIsCard;
    }

    public void setExistIssue8(String existIssue8) {
        this.existIssue8 = existIssue8;
    }

    public String getExistIssue8() {
        return existIssue8;
    }

    public void setImplementSituation8(String implementSituation8) {
        this.implementSituation8 = implementSituation8;
    }

    public String getImplementSituation8() {
        return implementSituation8;
    }

    public void setMinuteIsCircuit(String minuteIsCircuit) {
        this.minuteIsCircuit = minuteIsCircuit;
    }

    public String getMinuteIsCircuit() {
        return minuteIsCircuit;
    }

    public void setMinuteIsEquipment(String minuteIsEquipment) {
        this.minuteIsEquipment = minuteIsEquipment;
    }

    public String getMinuteIsEquipment() {
        return minuteIsEquipment;
    }

    public void setMinuteIsHandle(String minuteIsHandle) {
        this.minuteIsHandle = minuteIsHandle;
    }

    public String getMinuteIsHandle() {
        return minuteIsHandle;
    }

    public void setMinuteIsSpecification(String minuteIsSpecification) {
        this.minuteIsSpecification = minuteIsSpecification;
    }

    public String getMinuteIsSpecification() {
        return minuteIsSpecification;
    }

    public void setMinuteIsComplete(String minuteIsComplete) {
        this.minuteIsComplete = minuteIsComplete;
    }

    public String getMinuteIsComplete() {
        return minuteIsComplete;
    }

    public void setExistIssue9(String existIssue9) {
        this.existIssue9 = existIssue9;
    }

    public String getExistIssue9() {
        return existIssue9;
    }

    public void setImplementSituation9(String implementSituation9) {
        this.implementSituation9 = implementSituation9;
    }

    public String getImplementSituation9() {
        return implementSituation9;
    }

    public void setBasisIsJoin(String basisIsJoin) {
        this.basisIsJoin = basisIsJoin;
    }

    public String getBasisIsJoin() {
        return basisIsJoin;
    }

    public void setBasisIsIntact(String basisIsIntact) {
        this.basisIsIntact = basisIsIntact;
    }

    public String getBasisIsIntact() {
        return basisIsIntact;
    }

    public void setBasisIsVideo(String basisIsVideo) {
        this.basisIsVideo = basisIsVideo;
    }

    public String getBasisIsVideo() {
        return basisIsVideo;
    }

    public void setBasisIsCheck(String basisIsCheck) {
        this.basisIsCheck = basisIsCheck;
    }

    public String getBasisIsCheck() {
        return basisIsCheck;
    }

    public void setBasisIsLedger(String basisIsLedger) {
        this.basisIsLedger = basisIsLedger;
    }

    public String getBasisIsLedger() {
        return basisIsLedger;
    }

    public void setBasisIsAlarm(String basisIsAlarm) {
        this.basisIsAlarm = basisIsAlarm;
    }

    public String getBasisIsAlarm() {
        return basisIsAlarm;
    }

    public void setBasisIsTest(String basisIsTest) {
        this.basisIsTest = basisIsTest;
    }

    public String getBasisIsTest() {
        return basisIsTest;
    }

    public void setBasisIsCall(String basisIsCall) {
        this.basisIsCall = basisIsCall;
    }

    public String getBasisIsCall() {
        return basisIsCall;
    }

    public void setExistIssue10(String existIssue10) {
        this.existIssue10 = existIssue10;
    }

    public String getExistIssue10() {
        return existIssue10;
    }

    public void setImplementSituation10(String implementSituation10) {
        this.implementSituation10 = implementSituation10;
    }

    public String getImplementSituation10() {
        return implementSituation10;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public Date getWriteTime() {
        return writeTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("jobNumber", getJobNumber())
                .append("userName", getUserName())
                .append("isJob", getIsJob())
                .append("isNotJob", getIsNotJob())
                .append("isIdentical", getIsIdentical())
                .append("existIssue", getExistIssue())
                .append("implementSituation", getImplementSituation())
                .append("goodsIsTidy", getGoodsIsTidy())
                .append("beddingIsTidy", getBeddingIsTidy())
                .append("tablewareIsTidy", getTablewareIsTidy())
                .append("healthIsStandard", getHealthIsStandard())
                .append("healthIsBlind", getHealthIsBlind())
                .append("existIssue1", getExistIssue1())
                .append("implementSituation1", getImplementSituation1())
                .append("clothesIsStandard", getClothesIsStandard())
                .append("nailsIsStandard", getNailsIsStandard())
                .append("existIssue2", getExistIssue2())
                .append("implementSituation2", getImplementSituation2())
                .append("cardIsHealth", getCardIsHealth())
                .append("cardIsEquipment", getCardIsEquipment())
                .append("cardIsSituation", getCardIsSituation())
                .append("cardIsRepair", getCardIsRepair())
                .append("existIssue3", getExistIssue3())
                .append("implementSituation3", getImplementSituation3())
                .append("videoIsHealth", getVideoIsHealth())
                .append("videoIsJob", getVideoIsJob())
                .append("videoIsPhone", getVideoIsPhone())
                .append("videoIsBedding", getVideoIsBedding())
                .append("videoIsLeader", getVideoIsLeader())
                .append("existIssue4", getExistIssue4())
                .append("implementSituation4", getImplementSituation4())
                .append("meetingIsMeeting", getMeetingIsMeeting())
                .append("meetingIsJob", getMeetingIsJob())
                .append("meetingIsFake", getMeetingIsFake())
                .append("meetingIsLanguage", getMeetingIsLanguage())
                .append("meetingIsFile", getMeetingIsFile())
                .append("existIssue5", getExistIssue5())
                .append("implementSituation5", getImplementSituation5())
                .append("allIsAdvance", getAllIsAdvance())
                .append("allIsContent", getAllIsContent())
                .append("allIsLog", getAllIsLog())
                .append("allIsGrasp", getAllIsGrasp())
                .append("allIsLanguage", getAllIsLanguage())
                .append("allIsWrite", getAllIsWrite())
                .append("existIssue6", getExistIssue6())
                .append("implementSituation6", getImplementSituation6())
                .append("electronIsGrasp", getElectronIsGrasp())
                .append("electronIsInput", getElectronIsInput())
                .append("electronIsError", getElectronIsError())
                .append("existIssue11", getExistIssue11())
                .append("implementSituation11", getImplementSituation11())
                .append("briefingIsWrite", getBriefingIsWrite())
                .append("briefingIsSign", getBriefingIsSign())
                .append("briefingIsSituation", getBriefingIsSituation())
                .append("briefingIsIntelligence", getBriefingIsIntelligence())
                .append("existIssue7", getExistIssue7())
                .append("implementSituation7", getImplementSituation7())
                .append("epidemicIsSupplies", getEpidemicIsSupplies())
                .append("epidemicIsCode", getEpidemicIsCode())
                .append("epidemicIsDisinfection", getEpidemicIsDisinfection())
                .append("epidemicIsLedger", getEpidemicIsLedger())
                .append("epidemicIsVentilation", getEpidemicIsVentilation())
                .append("epidemicIsTemperature", getEpidemicIsTemperature())
                .append("epidemicIsCard", getEpidemicIsCard())
                .append("existIssue8", getExistIssue8())
                .append("implementSituation8", getImplementSituation8())
                .append("minuteIsCircuit", getMinuteIsCircuit())
                .append("minuteIsEquipment", getMinuteIsEquipment())
                .append("minuteIsHandle", getMinuteIsHandle())
                .append("minuteIsSpecification", getMinuteIsSpecification())
                .append("minuteIsComplete", getMinuteIsComplete())
                .append("existIssue9", getExistIssue9())
                .append("implementSituation9", getImplementSituation9())
                .append("basisIsJoin", getBasisIsJoin())
                .append("basisIsIntact", getBasisIsIntact())
                .append("basisIsVideo", getBasisIsVideo())
                .append("basisIsCheck", getBasisIsCheck())
                .append("basisIsLedger", getBasisIsLedger())
                .append("basisIsAlarm", getBasisIsAlarm())
                .append("basisIsTest", getBasisIsTest())
                .append("basisIsCall", getBasisIsCall())
                .append("existIssue10", getExistIssue10())
                .append("implementSituation10", getImplementSituation10())
                .append("writeTime", getWriteTime())
                .toString();
    }
}

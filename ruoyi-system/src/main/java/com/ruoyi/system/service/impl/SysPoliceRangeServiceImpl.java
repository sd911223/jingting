package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.MapUtils;
import com.ruoyi.system.domain.SysPoliceBooth;
import com.ruoyi.system.domain.SysPoliceRange;
import com.ruoyi.system.mapper.SysPoliceBoothMapper;
import com.ruoyi.system.mapper.SysPoliceRangeMapper;
import com.ruoyi.system.service.ISysPoliceRangeService;
import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticCurve;
import org.gavaghan.geodesy.GlobalCoordinates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 位置检测Service业务层处理
 *
 * @author ruoyi
 * @date 2021-02-01
 */
@Service
public class SysPoliceRangeServiceImpl implements ISysPoliceRangeService {
    private static final Logger log = LoggerFactory.getLogger(SysPoliceRangeServiceImpl.class);
    @Autowired
    private SysPoliceRangeMapper sysPoliceRangeMapper;
    @Autowired
    private SysPoliceBoothMapper sysPoliceBoothMapper;

    /**
     * 查询位置检测
     *
     * @param id 位置检测ID
     * @return 位置检测
     */
    @Override
    public SysPoliceRange selectSysPoliceRangeById(Long id) {
        return sysPoliceRangeMapper.selectSysPoliceRangeById(id);
    }

    /**
     * 查询位置检测列表
     *
     * @param sysPoliceRange 位置检测
     * @return 位置检测
     */
    @Override
    public List<SysPoliceRange> selectSysPoliceRangeList(SysPoliceRange sysPoliceRange) {
        return sysPoliceRangeMapper.selectSysPoliceRangeList(sysPoliceRange);
    }

    /**
     * 新增位置检测
     *
     * @param sysPoliceRange 位置检测
     * @return 结果
     */
    @Override
    public int insertSysPoliceRange(SysPoliceRange sysPoliceRange) {
        log.info("上报位置,手机号{},经度:{},纬度:{}", sysPoliceRange.getPhone(), sysPoliceRange.getLongitude(), sysPoliceRange.getLatitude());
        SysPoliceBooth sysPoliceBooth = new SysPoliceBooth();
        sysPoliceBooth.setPhone(sysPoliceRange.getPhone());
        List<SysPoliceBooth> boothList = sysPoliceBoothMapper.selectSysPoliceBoothList(sysPoliceBooth);
        if (!boothList.isEmpty()) {
            SysPoliceBooth policeBooth = boothList.get(0);
            sysPoliceRange.setAgencyName(policeBooth.getPoliceBoothName());
            sysPoliceRange.setUserName(policeBooth.getName());
            log.info("设置区域,手机号{},经度:{},纬度:{}", policeBooth.getPhone(), policeBooth.getLongitude(), policeBooth.getLatitude());
            GlobalCoordinates source = new GlobalCoordinates(policeBooth.getLatitude(), policeBooth.getLongitude());
            GlobalCoordinates target = new GlobalCoordinates(sysPoliceRange.getLatitude(), sysPoliceRange.getLongitude());
            double meter2 = getDistanceMeter(source, target, Ellipsoid.WGS84);
            log.info("WGS84=============距离================={}", meter2);
            double getDistance = MapUtils.GetDistance(sysPoliceRange.getLatitude(), sysPoliceRange.getLongitude(), policeBooth.getLatitude(), policeBooth.getLongitude());
            BigDecimal b = new BigDecimal(meter2);
            double doubleValue = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            log.info("距离=======,手机号{},距离:{}", policeBooth.getPhone(), getDistance);
            sysPoliceRange.setRangeDistance(doubleValue);
            if (doubleValue > policeBooth.getRangeArea()) {
                sysPoliceRange.setIsDistance("否");
                return sysPoliceRangeMapper.insertSysPoliceRange(sysPoliceRange);
            } else {
                sysPoliceRange.setIsDistance("是");
                return sysPoliceRangeMapper.insertSysPoliceRange(sysPoliceRange);
            }
        } else {
            log.info("根据手机号查询不到机构信息,手机号->{}", sysPoliceRange.getPhone());
            throw new BusinessException("根据手机号查询不到机构信息:" + sysPoliceRange.getPhone());
        }
//        return 1;
    }

    /**
     * 修改位置检测
     *
     * @param sysPoliceRange 位置检测
     * @return 结果
     */
    @Override
    public int updateSysPoliceRange(SysPoliceRange sysPoliceRange) {
        return sysPoliceRangeMapper.updateSysPoliceRange(sysPoliceRange);
    }

    /**
     * 删除位置检测对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysPoliceRangeByIds(String ids) {
        return sysPoliceRangeMapper.deleteSysPoliceRangeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除位置检测信息
     *
     * @param id 位置检测ID
     * @return 结果
     */
    @Override
    public int deleteSysPoliceRangeById(Long id) {
        return sysPoliceRangeMapper.deleteSysPoliceRangeById(id);
    }

    /**
     * 计算距离
     *
     * @param gpsFrom
     * @param gpsTo
     * @param ellipsoid
     * @return
     */
    public static double getDistanceMeter(GlobalCoordinates gpsFrom, GlobalCoordinates gpsTo, Ellipsoid ellipsoid) {

        //创建GeodeticCalculator，调用计算方法，传入坐标系、经纬度用于计算距离

        GeodeticCurve geoCurve = new GeodeticCalculator().calculateGeodeticCurve(ellipsoid, gpsFrom, gpsTo);


        return geoCurve.getEllipsoidalDistance();

    }
}

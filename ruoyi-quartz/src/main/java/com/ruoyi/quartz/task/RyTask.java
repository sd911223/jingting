package com.ruoyi.quartz.task;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.SysPoliceRange;
import com.ruoyi.system.domain.SysPoliceWork;
import com.ruoyi.system.domain.SysTimingCount;
import com.ruoyi.system.domain.SysWorkDetailed;
import com.ruoyi.system.mapper.SysPoliceRangeMapper;
import com.ruoyi.system.mapper.SysPoliceWorkMapper;
import com.ruoyi.system.mapper.SysWorkDetailedMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * 定时任务调度测试
 *
 * @author ruoyi
 */
@Component("ryTask")
public class RyTask {
    private static final Logger log = LoggerFactory.getLogger(RyTask.class);
    @Autowired
    private SysPoliceRangeMapper sysPoliceRangeMapper;
    @Autowired
    private SysPoliceWorkMapper sysPoliceWorkMapper;
    @Autowired
    private SysWorkDetailedMapper sysWorkDetailedMapper;

    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void ryParams(String params) {
        System.out.println("执行有参方法：" + params);
    }

    public void ryNoParams() {
        System.out.println("执行无参方法");
    }


    public void ryStatistical() {
        SysTimingCount sysTimingCount = new SysTimingCount();
        LocalDate localDate = LocalDate.now().minusDays(1);
        Date date2Date = DateUtils.localDate2Date(localDate);

        String date = DateUtils.dateTime(date2Date);
        log.info("转换过的时间String:{}", date);
        StringBuffer dateStart = new StringBuffer();
        dateStart.append(date);
        dateStart.append(" ");
        dateStart.append("00:00:00");
        log.info("转换过的开始时间:{}", dateStart.toString());
        StringBuffer dateEnd = new StringBuffer();
        dateEnd.append(date);
        dateEnd.append(" ");
        dateEnd.append("23:59:59");
        log.info("转换过的结束时间:{}", dateEnd.toString());
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("beginTime", dateStart.toString());
        hashMap.put("endTime", dateEnd.toString());
        SysPoliceRange sysPoliceRange = new SysPoliceRange();
        sysPoliceRange.setParams(hashMap);
        int rangeCount = sysPoliceRangeMapper.selectSysPoliceRangeCount(sysPoliceRange);
        log.info("走出范围人数:{}", rangeCount);
        SysPoliceWork sysPoliceWork = new SysPoliceWork();
        sysPoliceWork.setParams(hashMap);
        int workCount = sysPoliceWorkMapper.selectSysPoliceWorkCount(sysPoliceWork);
        log.info("工作记录人数:{}", workCount);

        SysWorkDetailed sysWorkDetailed = new SysWorkDetailed();
        sysWorkDetailed.setParams(hashMap);
        List<SysWorkDetailed> list = sysWorkDetailedMapper.selectSysWorkDetailedList(sysWorkDetailed);
        List<SysWorkDetailed> sysWorkDetailedList = sysWorkDetailedMapper.selectSysWorkDetailedList(sysWorkDetailed);

        Iterator<SysWorkDetailed> detailedIterator = sysWorkDetailedList.iterator();
        while (detailedIterator.hasNext()) {
            SysWorkDetailed sysWorkDetailed1 = detailedIterator.next();
            if ("无".equals(sysWorkDetailed1.getImplementSituation()) || "".equals(sysWorkDetailed1.getImplementSituation())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation1()) || "".equals(sysWorkDetailed1.getImplementSituation1())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation2()) || "".equals(sysWorkDetailed1.getImplementSituation2())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation3()) || "".equals(sysWorkDetailed1.getImplementSituation3())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation4()) || "".equals(sysWorkDetailed1.getImplementSituation4())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation5()) || "".equals(sysWorkDetailed1.getImplementSituation5())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation6()) || "".equals(sysWorkDetailed1.getImplementSituation6())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation7()) || "".equals(sysWorkDetailed1.getImplementSituation7())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation8()) || "".equals(sysWorkDetailed1.getImplementSituation8())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation9()) || "".equals(sysWorkDetailed1.getImplementSituation9())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation10()) || "".equals(sysWorkDetailed1.getImplementSituation10())) {
                detailedIterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getImplementSituation11()) || "".equals(sysWorkDetailed1.getImplementSituation11())) {
                detailedIterator.remove();
            }
        }

        //遍历删除,除去没有问题的
        Iterator<SysWorkDetailed> iterator = list.iterator();
        while (iterator.hasNext()) {
            SysWorkDetailed sysWorkDetailed1 = iterator.next();
            if ("无".equals(sysWorkDetailed1.getExistIssue()) || "".equals(sysWorkDetailed1.getExistIssue())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue1()) || "".equals(sysWorkDetailed1.getExistIssue1())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue2()) || "".equals(sysWorkDetailed1.getExistIssue2())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue3()) || "".equals(sysWorkDetailed1.getExistIssue3())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue4()) || "".equals(sysWorkDetailed1.getExistIssue4())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue5()) || "".equals(sysWorkDetailed1.getExistIssue5())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue6()) || "".equals(sysWorkDetailed1.getExistIssue6())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue7()) || "".equals(sysWorkDetailed1.getExistIssue7())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue8()) || "".equals(sysWorkDetailed1.getExistIssue8())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue9()) || "".equals(sysWorkDetailed1.getExistIssue9())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue10()) || "".equals(sysWorkDetailed1.getExistIssue10())) {
                iterator.remove();
            }
            if ("无".equals(sysWorkDetailed1.getExistIssue11()) || "".equals(sysWorkDetailed1.getExistIssue11())) {
                iterator.remove();
            }
        }
        log.info("存在问题个数:{}", list.size());

        log.info("整改问题个数:{}", sysWorkDetailedList.size());

        sysTimingCount.setDeviateNumber(rangeCount);
        sysTimingCount.setRectifyNumber(workCount);
        sysTimingCount.setQuestionNumber(list.size());
        sysTimingCount.setRectifyNumber(sysWorkDetailedList.size());
        sysTimingCount.setRecordTime(new Date());
    }
}

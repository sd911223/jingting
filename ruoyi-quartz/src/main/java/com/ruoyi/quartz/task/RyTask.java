package com.ruoyi.quartz.task;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.SysPoliceRange;
import com.ruoyi.system.domain.SysPoliceWork;
import com.ruoyi.system.domain.SysTimingCount;
import com.ruoyi.system.domain.SysWorkDetailed;
import com.ruoyi.system.mapper.SysPoliceRangeMapper;
import com.ruoyi.system.mapper.SysPoliceWorkMapper;
import com.ruoyi.system.mapper.SysTimingCountMapper;
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
    @Autowired
    private SysTimingCountMapper sysTimingCountMapper;

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
        int i = 0;
        Iterator<SysWorkDetailed> detailedIterator = sysWorkDetailedList.iterator();
        while (detailedIterator.hasNext()) {
            SysWorkDetailed sysWorkDetailed1 = detailedIterator.next();
            if (!"无".equals(sysWorkDetailed1.getImplementSituation())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation1())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation2())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation3())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation4())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation5())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation6())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation7())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation8())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation9())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation10())) {
                i++;
            }
            if (!"无".equals(sysWorkDetailed1.getImplementSituation11())) {
                i++;
            }
        }
        int j = 0;
        //遍历删除,除去没有问题的
        Iterator<SysWorkDetailed> iterator = list.iterator();
        while (iterator.hasNext()) {
            SysWorkDetailed sysWorkDetailed1 = iterator.next();
            if (!"无".equals(sysWorkDetailed1.getExistIssue())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue1())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue2())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue3())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue4())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue5())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue6())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue7())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue8())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue9())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue10())) {
                j++;
            }
            if (!"无".equals(sysWorkDetailed1.getExistIssue11())) {
                j++;
            }
        }
        log.info("存在问题个数:{}", i);

        log.info("整改问题个数:{}", j);

        sysTimingCount.setDeviateNumber(rangeCount);
        sysTimingCount.setReportNumber(workCount);
        sysTimingCount.setRectifyNumber(j);
        sysTimingCount.setQuestionNumber(i);

        sysTimingCount.setRecordTime(new Date());
        sysTimingCountMapper.insertSysTimingCount(sysTimingCount);
    }
}

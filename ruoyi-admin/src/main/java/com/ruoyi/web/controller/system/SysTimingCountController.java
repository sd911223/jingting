package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysTimingCount;
import com.ruoyi.system.service.ISysTimingCountService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 统计Controller
 * 
 * @author ruoyi
 * @date 2021-02-15
 */
@Controller
@RequestMapping("/system/count")
public class SysTimingCountController extends BaseController
{
    private String prefix = "system/count";

    @Autowired
    private ISysTimingCountService sysTimingCountService;

    @RequiresPermissions("system:count:view")
    @GetMapping()
    public String count()
    {
        return prefix + "/count";
    }

    /**
     * 查询统计列表
     */
    @RequiresPermissions("system:count:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysTimingCount sysTimingCount)
    {
        startPage();
        List<SysTimingCount> list = sysTimingCountService.selectSysTimingCountList(sysTimingCount);
        return getDataTable(list);
    }

    /**
     * 导出统计列表
     */
    @RequiresPermissions("system:count:export")
    @Log(title = "统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysTimingCount sysTimingCount)
    {
        List<SysTimingCount> list = sysTimingCountService.selectSysTimingCountList(sysTimingCount);
        ExcelUtil<SysTimingCount> util = new ExcelUtil<SysTimingCount>(SysTimingCount.class);
        return util.exportExcel(list, "count");
    }

    /**
     * 新增统计
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存统计
     */
    @RequiresPermissions("system:count:add")
    @Log(title = "统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysTimingCount sysTimingCount)
    {
        return toAjax(sysTimingCountService.insertSysTimingCount(sysTimingCount));
    }

    /**
     * 修改统计
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        SysTimingCount sysTimingCount = sysTimingCountService.selectSysTimingCountById(id);
        mmap.put("sysTimingCount", sysTimingCount);
        return prefix + "/edit";
    }

    /**
     * 修改保存统计
     */
    @RequiresPermissions("system:count:edit")
    @Log(title = "统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysTimingCount sysTimingCount)
    {
        return toAjax(sysTimingCountService.updateSysTimingCount(sysTimingCount));
    }

    /**
     * 删除统计
     */
    @RequiresPermissions("system:count:remove")
    @Log(title = "统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysTimingCountService.deleteSysTimingCountByIds(ids));
    }
}

package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysPoliceRange;
import com.ruoyi.system.service.ISysPoliceRangeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 位置检测Controller
 * 
 * @author ruoyi
 * @date 2021-02-01
 */
@Controller
@RequestMapping("/system/range")
public class SysPoliceRangeController extends BaseController
{
    private String prefix = "system/range";

    @Autowired
    private ISysPoliceRangeService sysPoliceRangeService;

    @RequiresPermissions("system:range:view")
    @GetMapping()
    public String range()
    {
        return prefix + "/range";
    }

    /**
     * 查询位置检测列表
     */
    @RequiresPermissions("system:range:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysPoliceRange sysPoliceRange)
    {
        startPage();
        List<SysPoliceRange> list = sysPoliceRangeService.selectSysPoliceRangeList(sysPoliceRange);
        return getDataTable(list);
    }

    /**
     * 导出位置检测列表
     */
    @RequiresPermissions("system:range:export")
    @Log(title = "位置检测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysPoliceRange sysPoliceRange)
    {
        List<SysPoliceRange> list = sysPoliceRangeService.selectSysPoliceRangeList(sysPoliceRange);
        ExcelUtil<SysPoliceRange> util = new ExcelUtil<SysPoliceRange>(SysPoliceRange.class);
        return util.exportExcel(list, "range");
    }

    /**
     * 新增位置检测
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存位置检测
     */
    @Log(title = "位置检测", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody SysPoliceRange sysPoliceRange)
    {
        return toAjax(sysPoliceRangeService.insertSysPoliceRange(sysPoliceRange));
    }

    /**
     * 修改位置检测
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SysPoliceRange sysPoliceRange = sysPoliceRangeService.selectSysPoliceRangeById(id);
        mmap.put("sysPoliceRange", sysPoliceRange);
        return prefix + "/edit";
    }

    /**
     * 修改保存位置检测
     */
    @RequiresPermissions("system:range:edit")
    @Log(title = "位置检测", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysPoliceRange sysPoliceRange)
    {
        return toAjax(sysPoliceRangeService.updateSysPoliceRange(sysPoliceRange));
    }

    /**
     * 删除位置检测
     */
    @RequiresPermissions("system:range:remove")
    @Log(title = "位置检测", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysPoliceRangeService.deleteSysPoliceRangeByIds(ids));
    }
}

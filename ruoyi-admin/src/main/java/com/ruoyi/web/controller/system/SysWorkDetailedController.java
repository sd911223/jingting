package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.annotation.RepeatSubmit;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysWorkDetailed;
import com.ruoyi.system.service.ISysWorkDetailedService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 每日工作填写Controller
 *
 * @author ruoyi
 * @date 2021-02-08
 */
@Controller
@RequestMapping("/system/detailed")
public class SysWorkDetailedController extends BaseController {
    private String prefix = "system/detailed";

    @Autowired
    private ISysWorkDetailedService sysWorkDetailedService;

    @RequiresPermissions("system:detailed:view")
    @GetMapping()
    public String detailed() {
        return prefix + "/detailed";
    }

    /**
     * 查询每日工作填写列表
     */
    @RequiresPermissions("system:detailed:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysWorkDetailed sysWorkDetailed) {
        startPage();
        List<SysWorkDetailed> list = sysWorkDetailedService.selectSysWorkDetailedList(sysWorkDetailed);
        return getDataTable(list);
    }

    /**
     * 导出每日工作填写列表
     */
    @RequiresPermissions("system:detailed:export")
    @Log(title = "每日工作填写", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysWorkDetailed sysWorkDetailed) {
        List<SysWorkDetailed> list = sysWorkDetailedService.selectSysWorkDetailedList(sysWorkDetailed);
        ExcelUtil<SysWorkDetailed> util = new ExcelUtil<SysWorkDetailed>(SysWorkDetailed.class);
        return util.exportExcel(list, "detailed");
    }

    /**
     * 新增每日工作填写
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存每日工作填写
     */
    @Log(title = "每日工作填写", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    @RepeatSubmit
    public AjaxResult addSave(@RequestBody SysWorkDetailed sysWorkDetailed) {
        return toAjax(sysWorkDetailedService.insertSysWorkDetailed(sysWorkDetailed));
    }

    /**
     * 修改每日工作填写
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        SysWorkDetailed sysWorkDetailed = sysWorkDetailedService.selectSysWorkDetailedById(id);
        mmap.put("sysWorkDetailed", sysWorkDetailed);
        return prefix + "/edit";
    }

    /**
     * 修改保存每日工作填写
     */
    @RequiresPermissions("system:detailed:edit")
    @Log(title = "每日工作填写", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysWorkDetailed sysWorkDetailed) {
        return toAjax(sysWorkDetailedService.updateSysWorkDetailed(sysWorkDetailed));
    }

    /**
     * 删除每日工作填写
     */
    @RequiresPermissions("system:detailed:remove")
    @Log(title = "每日工作填写", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(sysWorkDetailedService.deleteSysWorkDetailedByIds(ids));
    }
}

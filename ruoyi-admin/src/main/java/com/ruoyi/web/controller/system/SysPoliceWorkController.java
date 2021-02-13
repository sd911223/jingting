package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysPoliceRange;
import com.ruoyi.system.domain.SysPoliceWork;
import com.ruoyi.system.service.ISysPoliceWorkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 工作详细Controller
 *
 * @author ruoyi
 * @date 2021-02-08
 */
@Controller
@RequestMapping("/system/work")
public class SysPoliceWorkController extends BaseController {
    private String prefix = "system/work";

    @Autowired
    private ISysPoliceWorkService sysPoliceWorkService;

    @RequiresPermissions("system:work:view")
    @GetMapping()
    public String work() {
        return prefix + "/work";
    }

    /**
     * 查询工作详细列表
     */
    @RequiresPermissions("system:work:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysPoliceWork sysPoliceWork) {
        startPage();
        List<SysPoliceWork> list = sysPoliceWorkService.selectSysPoliceWorkList(sysPoliceWork);
        return getDataTable(list);
    }

    /**
     * 导出工作详细列表
     */
    @RequiresPermissions("system:work:export")
    @Log(title = "工作详细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysPoliceWork sysPoliceWork) {
        List<SysPoliceWork> list = sysPoliceWorkService.selectSysPoliceWorkList(sysPoliceWork);
        ExcelUtil<SysPoliceWork> util = new ExcelUtil<SysPoliceWork>(SysPoliceWork.class);
        return util.exportExcel(list, "work");
    }

    /**
     * 新增工作详细
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存工作详细
     */
    @RequiresPermissions("system:work:add")
    @Log(title = "工作详细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysPoliceWork sysPoliceWork) {
        return toAjax(sysPoliceWorkService.insertSysPoliceWork(sysPoliceWork));
    }

    /**
     * 工作结束
     */
    @Log(title = "工作结束", businessType = BusinessType.UPDATE)
    @PostMapping("/finish")
    @ResponseBody
    public AjaxResult edit(@RequestBody SysPoliceRange sysPoliceRange) {
        logger.info("进入-----结束工作=======手机号:{}", sysPoliceRange.getPhone());
        SysPoliceWork sysPoliceWork = new SysPoliceWork();
        sysPoliceWork.setReserved3(sysPoliceRange.getPhone());
        List<SysPoliceWork> policeWorkList = sysPoliceWorkService.selectSysPoliceWorkList(sysPoliceWork);
        if (policeWorkList.isEmpty()) {
            return toAjax(0);
        }
        logger.info("进入-----结束工作=======条数:{}", policeWorkList.size());
        SysPoliceWork policeWork = policeWorkList.get(0);
        policeWork.setReserved2(new Date());
        return toAjax(sysPoliceWorkService.updateSysPoliceWork(policeWork));
    }

    /**
     * 修改工作详细
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        SysPoliceWork sysPoliceWork = sysPoliceWorkService.selectSysPoliceWorkById(id);
        mmap.put("sysPoliceWork", sysPoliceWork);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作详细
     */
    @RequiresPermissions("system:work:edit")
    @Log(title = "工作详细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysPoliceWork sysPoliceWork) {
        return toAjax(sysPoliceWorkService.updateSysPoliceWork(sysPoliceWork));
    }

    /**
     * 删除工作详细
     */
    @RequiresPermissions("system:work:remove")
    @Log(title = "工作详细", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(sysPoliceWorkService.deleteSysPoliceWorkByIds(ids));
    }
}

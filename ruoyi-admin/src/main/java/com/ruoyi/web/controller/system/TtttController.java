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
import com.ruoyi.system.domain.Tttt;
import com.ruoyi.system.service.ITtttService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-02-28
 */
@Controller
@RequestMapping("/system/tttt")
public class TtttController extends BaseController
{
    private String prefix = "system/tttt";

    @Autowired
    private ITtttService ttttService;

    @RequiresPermissions("system:tttt:view")
    @GetMapping()
    public String tttt()
    {
        return prefix + "/tttt";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:tttt:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Tttt tttt)
    {
        startPage();
        List<Tttt> list = ttttService.selectTtttList(tttt);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:tttt:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Tttt tttt)
    {
        List<Tttt> list = ttttService.selectTtttList(tttt);
        ExcelUtil<Tttt> util = new ExcelUtil<Tttt>(Tttt.class);
        return util.exportExcel(list, "tttt");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:tttt:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Tttt tttt)
    {
        return toAjax(ttttService.insertTttt(tttt));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Tttt tttt = ttttService.selectTtttById(id);
        mmap.put("tttt", tttt);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:tttt:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Tttt tttt)
    {
        return toAjax(ttttService.updateTttt(tttt));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:tttt:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ttttService.deleteTtttByIds(ids));
    }
}

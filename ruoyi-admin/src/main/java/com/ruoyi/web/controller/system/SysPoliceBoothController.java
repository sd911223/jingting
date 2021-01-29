package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysPoliceBooth;
import com.ruoyi.system.service.ISysPoliceBoothService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticCurve;
import org.gavaghan.geodesy.GlobalCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 警亭管理Controller
 *
 * @author ruoyi
 * @date 2021-01-28
 */
@Controller
@RequestMapping("/system/booth")
public class SysPoliceBoothController extends BaseController {
    private String prefix = "system/booth";

    @Autowired
    private ISysPoliceBoothService sysPoliceBoothService;

    @RequiresPermissions("system:booth:view")
    @GetMapping()
    public String booth() {
        return prefix + "/booth";
    }

    /**
     * 查询警亭管理列表
     */
    @RequiresPermissions("system:booth:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysPoliceBooth sysPoliceBooth) {
        startPage();
        List<SysPoliceBooth> list = sysPoliceBoothService.selectSysPoliceBoothList(sysPoliceBooth);
        return getDataTable(list);
    }

    /**
     * 导出警亭管理列表
     */
    @RequiresPermissions("system:booth:export")
    @Log(title = "警亭管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysPoliceBooth sysPoliceBooth) {
        List<SysPoliceBooth> list = sysPoliceBoothService.selectSysPoliceBoothList(sysPoliceBooth);
        ExcelUtil<SysPoliceBooth> util = new ExcelUtil<SysPoliceBooth>(SysPoliceBooth.class);
        return util.exportExcel(list, "booth");
    }

    /**
     * 新增警亭管理
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存警亭管理
     */
    @RequiresPermissions("system:booth:add")
    @Log(title = "警亭管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysPoliceBooth sysPoliceBooth) {
        sysPoliceBooth.setCreateBy(ShiroUtils.getLoginName());
        return toAjax(sysPoliceBoothService.insertSysPoliceBooth(sysPoliceBooth));
    }

    /**
     * 修改警亭管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        SysPoliceBooth sysPoliceBooth = sysPoliceBoothService.selectSysPoliceBoothById(id);
        mmap.put("sysPoliceBooth", sysPoliceBooth);
        return prefix + "/edit";
    }

    /**
     * 修改保存警亭管理
     */
    @RequiresPermissions("system:booth:edit")
    @Log(title = "警亭管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysPoliceBooth sysPoliceBooth) {
        sysPoliceBooth.setUpdateBy(ShiroUtils.getLoginName());
        return toAjax(sysPoliceBoothService.updateSysPoliceBooth(sysPoliceBooth));
    }

    /**
     * 删除警亭管理
     */
    @RequiresPermissions("system:booth:remove")
    @Log(title = "警亭管理", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(sysPoliceBoothService.deleteSysPoliceBoothByIds(ids));
    }

    public static void main(String[] args)

    {

        GlobalCoordinates source = new GlobalCoordinates(30.537311740, 104.0563604058);

        GlobalCoordinates target = new GlobalCoordinates(30.537422, 104.0562760);



        double meter1 = getDistanceMeter(source, target, Ellipsoid.Sphere);

        double meter2 = getDistanceMeter(source, target, Ellipsoid.WGS84);



        System.out.println("Sphere坐标系计算结果："+meter1 + "米");

        System.out.println("WGS84坐标系计算结果："+meter2 + "米");

    }



    public static double getDistanceMeter(GlobalCoordinates gpsFrom, GlobalCoordinates gpsTo, Ellipsoid ellipsoid)

    {

        //创建GeodeticCalculator，调用计算方法，传入坐标系、经纬度用于计算距离

        GeodeticCurve geoCurve = new GeodeticCalculator().calculateGeodeticCurve(ellipsoid, gpsFrom, gpsTo);



        return geoCurve.getEllipsoidalDistance();

    }
}

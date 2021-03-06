package com.xzgl.www.myrecord.controller;

import com.xzgl.www.myrecord.service.ServiceBiz;
import com.xzgl.www.entity.Serviceinformation;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by haining
 */

//用户点击业务管理，跳转到业务管理，新增业务，修改、删除业务界面
@Controller
@RequestMapping("service.do")
public class ServiceController {
    @Resource(name="serviceBizImpl")
    private ServiceBiz ServiceBiz;

    @RequiresRoles("admin")
    @RequestMapping("service.view")
    public String serviceView(Model m, String type) {
        m.addAttribute("serviceList", ServiceBiz.findByType(type));
        m.addAttribute("type", type);
        return "/admin/record/serviceinfo";
    }

    @RequiresRoles("admin")
    @RequestMapping("service_add.view")
    public String serviceAddView(Model m, String type) {
        m.addAttribute("type", type);
        return "/admin/record/serviceinfo_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("service_update.view")
    public String serviceUpdateView(Model m, String bunumber) {
        m.addAttribute("service", ServiceBiz.findById(bunumber));
        return "/admin/record/serviceinfo_update";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Serviceinformation serviceinformation) {
        ServiceBiz.createService(serviceinformation);
        return "redirect:/service.do/service.view?type=" + serviceinformation.getType();
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Serviceinformation serviceinformation) {
        ServiceBiz.updateService(serviceinformation);
        return "redirect:/service.do/service.view?type=" + serviceinformation.getType();
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(String bunumber) {
        ServiceBiz.deleteService(bunumber);
        Serviceinformation tmp = ServiceBiz.findById(bunumber);
        return "redirect:/service.do/service.view?type=" + tmp.getType();
    }

    @RequestMapping("search")
    public String search(Model m, String bunumber, String type) {
        if (bunumber.equals("")) {
            return "redirect:/service.do/service.view?type=" + type;
        }
        Serviceinformation r = ServiceBiz.findById(bunumber);
        List<Serviceinformation> ret = new ArrayList<>();
        ret.add(r);
        m.addAttribute("serviceList", ret);
        m.addAttribute("type", type);
        return "/admin/record/serviceinfo";
    }



}


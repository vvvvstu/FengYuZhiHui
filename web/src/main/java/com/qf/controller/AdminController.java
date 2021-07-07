package com.qf.controller;

import com.qf.pojo.AdminDto;
import com.qf.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author zzz
 * @Date 2021/7/6 21:27
 */
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("admin/login")
    public String adminLogin(AdminDto adminDto, HttpSession session){
        return adminService.adminLogin(adminDto, session);
    }
}

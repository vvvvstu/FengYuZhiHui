package com.qf.service;

import com.qf.pojo.AdminDto;

import javax.servlet.http.HttpSession;

/**
 * @Author zzz
 * @Date 2021/7/6 21:41
 */
public interface AdminService {

    String adminLogin(AdminDto adminDto, HttpSession session);
}
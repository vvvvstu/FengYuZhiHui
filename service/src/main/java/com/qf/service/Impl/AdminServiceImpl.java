package com.qf.service.Impl;

import com.qf.dao.AdminMapper;
import com.qf.pojo.Admin;
import com.qf.pojo.AdminDto;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @Author zzz
 * @Date 2021/7/6 21:42
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public String adminLogin(AdminDto adminDto, HttpSession session) {
        if(adminDto!=null && adminDto.getUsername()!=null){//判断是否输入了东西
            if (adminDto.getCaptcha().equals(session.getAttribute("code"))){//判断验证码
                    Admin adminByName = adminMapper.findAdminByName(adminDto.getUsername());
                    if(adminByName!=null){//判断是否有这个名字
                        if (adminByName.getPassword().equals(adminDto.getPassword())){//判断密码正确吗
                            return "success";
                        }else return "密码错误";
                    }else return "姓名错误";
            }else return "验证码错误";
        }else return "请输入全部项目";
    }
}

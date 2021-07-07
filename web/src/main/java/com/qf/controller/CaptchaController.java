package com.qf.controller;
import com.qf.service.CaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author zzz
 * @Date 2021/7/6 20:57
 */
@Controller
public class CaptchaController {

    @Autowired
    private CaptchaService captchaService;

    @RequestMapping("captcha/getImage")
    public void create(HttpSession session, HttpServletResponse response){
        try {
            captchaService.createImg(session, response);
        } catch (IOException e) {
            System.err.println("WRONG!!");
        }
    }

}

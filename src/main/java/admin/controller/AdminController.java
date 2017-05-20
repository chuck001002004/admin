package admin.controller;

import admin.service.AdminService;
import admin.vo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Boqi-Hu on 2017/5/18.
 * 管理员的登录、日志记录等操作
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    /**
     * 管理员登录操作
     * @param userName 用户名
     * @param password 密码
     * @param rememberMe 是否记住账号
     * @param request HttpServletRequest对象
     * @param response HttpServletResponse对象
     * @param map
     * @return 成功转到index.jsp，否则返回登录页面
     */
    @RequestMapping(value = "/login")
    public String adminLogin(String userName, String password, boolean rememberMe,
                             HttpServletRequest request, HttpServletResponse response, Map<String, Object> map){
        Admin admin = adminService.adminLogin(userName, password);
        if(admin == null){
            map.put("error", 1);
            return "login";
        }
        //设置Cookie
        if(rememberMe){
            Cookie[] cookies = request.getCookies();
            Cookie uN = null;
            Cookie pw = null;
            if(cookies == null){
                uN = new Cookie("userName", userName);
                pw = new Cookie("password", password);
            }else{
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("userName")){
                        uN = cookie;
                        System.out.println(uN.getValue());
                        cookie.setValue(userName);
                    }
                    if(cookie.getName().equals("password")){
                        pw = cookie;
                        System.out.println(pw.getValue());
                        cookie.setValue(password);
                    }
                }
            }
            uN.setMaxAge(60 * 60 * 24 * 7);
            pw.setMaxAge(60 * 60 * 24 * 7);
            uN.setPath("/");
            pw.setPath("/");
            response.addCookie(uN);
            response.addCookie(pw);
        }
        map.put("admin", admin);
        return "index";
    }

    /**
     * 加载登录页面获取cookie中的username和password
     * @param request HttpServletRequest对象
     * @return 将username和password封装在Map中
     */
    @RequestMapping(value = "/getCookie")
    @ResponseBody
    public Map<String, Object> getCookie(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("userName")){
                map.put("userName", cookie.getValue());
            }
            if(cookie.getName().equals("password")){
                map.put("password", cookie.getValue());
            }
        }
        return map;
    }

}

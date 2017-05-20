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
 * ����Ա�ĵ�¼����־��¼�Ȳ���
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    /**
     * ����Ա��¼����
     * @param userName �û���
     * @param password ����
     * @param rememberMe �Ƿ��ס�˺�
     * @param request HttpServletRequest����
     * @param response HttpServletResponse����
     * @param map
     * @return �ɹ�ת��index.jsp�����򷵻ص�¼ҳ��
     */
    @RequestMapping(value = "/login")
    public String adminLogin(String userName, String password, boolean rememberMe,
                             HttpServletRequest request, HttpServletResponse response, Map<String, Object> map){
        Admin admin = adminService.adminLogin(userName, password);
        if(admin == null){
            map.put("error", 1);
            return "login";
        }
        //����Cookie
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
     * ���ص�¼ҳ���ȡcookie�е�username��password
     * @param request HttpServletRequest����
     * @return ��username��password��װ��Map��
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

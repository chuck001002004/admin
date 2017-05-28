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
import javax.servlet.http.HttpSession;
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
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        adminService.addLog(admin.getId(), ip);
        //����Cookie
        if(rememberMe){
            Cookie[] cookies = request.getCookies();
            Cookie uN = null;
            Cookie pw = null;
            uN = new Cookie("userName", userName);
            pw = new Cookie("password", password);
            uN.setMaxAge(60 * 60 * 24 * 7);
            pw.setMaxAge(60 * 60 * 24 * 7);
            uN.setPath("/");
            pw.setPath("/");
            response.addCookie(uN);
            response.addCookie(pw);
            for(Cookie c : cookies){
                System.out.println(c.getName() + " : " + c.getValue());
            }
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

    /**
     * �˳�
     * @param session
     * @param response
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session, HttpServletResponse response){
        session.invalidate();
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        return "login";
    }

    /**
     * ��������ǰȷ�����
     * @param id ����Աid
     * @param password ԭ������
     * @return
     */
    @RequestMapping(value = "/checkBeforeUpdate", produces = {"plain/html;charset=UTF-8"})
    @ResponseBody
    public String checkBeforeUpdate(String id, String password){
//        System.out.println(adminService.checkBeforeUpdate(id, password));
        if(adminService.checkBeforeUpdate(id, password) > 0){
            return "1";
        }
        return "0";
    }

    /**
     * ���¹���Ա��Ϣ
     * @param id ����Աid
     * @param username ����Ա����
     * @param password ������
     * @return
     */
    @RequestMapping(value = "/updateAdminInfo")
    public String updateAdminInfo(String id, String username, String password, Map<String, Object> map){
//        System.out.println(id + "  " + username + "  " + password);
        if(password != null && !password.equals("")){
            adminService.updateAdminInfo(id, username, password);
        }
        Admin admin = new Admin();
        admin.setId(Integer.parseInt(id));
        admin.setName(username);
        map.put("admin", admin);
        return "index";
    }

}

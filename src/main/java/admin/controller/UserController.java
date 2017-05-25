package admin.controller;

import admin.service.BadmintonService;
import admin.service.BasketballService;
import admin.service.PingpangService;
import admin.service.UserService;
import admin.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by Boqi-Hu on 2017/5/22.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    BasketballService basketballService;
    @Autowired
    BadmintonService badmintonService;
    @Autowired
    UserService userService;
    @Autowired
    PingpangService pingpangService;

    final int PAGE_SIZE = 10;

    /**
     * ��ȡ�����������û�
     * @param stadium ��������
     * @param userName �û���
     * @param phone �Ļ�
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return �����������û�
     */
    @RequestMapping(value = "/getAllUser")
    public String getAllUser(int stadium, String userName, String phone, int week, double start_time,
                             double end_time, int start, Map<String, Object> map){
//        System.out.println(stadium + "  " + userName + "  " + phone + "  " + week + "  " + start_time + "  " + end_time);
        map.put("stadium", stadium);
        map.put("userName", (userName == null || userName.equals("")) ? "" : userName);
        map.put("phone", (phone == null || phone.equals("")) ? "" : phone);
        map.put("week", week);
        map.put("start_time", start_time);
        map.put("end_time", end_time);
        map.put("start", start);
        int order_count = 0;
        start = (start - 1) * PAGE_SIZE;
        List<User> list = null;
        if(stadium == 0){
            order_count = userService.getAllUserCount(userName, phone, week, start_time, end_time);
            list = userService.getAllUser(userName, phone, week, start_time, end_time, start, PAGE_SIZE);
        }else if(stadium == 1){
            order_count = basketballService.getAllUserCount(userName, phone, week, start_time, end_time);
            list = basketballService.getAllUser(userName, phone, week, start_time, end_time, start, PAGE_SIZE);
        }else{
            order_count = badmintonService.getAllUserCount(userName, phone, week, start_time, end_time);
            list = badmintonService.getAllUser(userName, phone, week, start_time, end_time, start, PAGE_SIZE);
        }
        int count = (int) Math.ceil((double)order_count / (double)PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("cnt", list == null ? 0 : list.size());
//        for(User o : list){
//            System.out.println(o);
//        }
        return "checkuser";
    }

    /**
     * ���ӳ�פ�û�
     * @param item ����
     * @param userName �û���
     * @param phone �绰
     * @param emergencycall ������ϵ��ʽ
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param address ��ϵ��ַ
     * @param money ���
     * @param stadium ���򳡳��غ�
     * @param badminton ��ë�򳡵غ�
     * @param remark ��ע
     * @return
     */
    @RequestMapping(value = "/addUser")
    public String addUser(int item, String userName, String phone, String emergencycall,
                          int week, double start_time, double end_time, String address,
                          String money, @RequestParam(required = false) String stadium,
                          @RequestParam(required = false) String badminton, String remark){
        if(item == 0){
            basketballService.addUser(userName, phone, emergencycall, week, start_time, end_time, address, money, stadium, remark);
        }else if(item == 1){
            badmintonService.addUser(userName, phone, emergencycall, week, start_time, end_time, address, money, badminton, remark);
        }
        return "adduser";
    }

    /**
     * ����id�����û�׼���༭
     * @param id �û�id
     * @param type ��������
     * @param map
     * @return
     */
    @RequestMapping(value = "/getUserById")
    public String getUserById(int id, int type, Map<String, Object> map){
//        System.out.println(id + "  " + type);
        if(type == 1){
            map.put("user", basketballService.getUserById(id));
            System.out.println(basketballService.getUserById(id));
        }else{
            map.put("user", badmintonService.getUserById(id));
            System.out.println(badmintonService.getUserById(id));
        }
        return "edituser";
    }

    /**
     * ɾ����פ�û�
     * @param id �û�id
     * @param type �û����ͣ�����/��ë��
     * @return
     */
    @RequestMapping(value = "/deleteUserById")
    public String deleteUserById(int id, int type){
//        System.out.println(id + "  " + type);
        if(type == 1){
            System.out.println("delete basketball");
            basketballService.deleteUserById(id);
        }else{
            System.out.println("delete badminton");
            badmintonService.deleteUserById(id);
        }
        return "redirect:/user/getAllUser?stadium=0&week=7&start_time=0&end_time=0&start=1";
    }

    /**
     * ���³�פ�û���Ϣ
     * @param id �û�id
     * @param item ��������
     * @param userName �û���
     * @param phone �绰
     * @param emergencycall ������ϵ��ʽ
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param address ��ϵ��ַ
     * @param money ���
     * @param stadium ���򳡵غ�
     * @param badminton ��ë�򳡵غ�
     * @param remark ��ע
     * @return
     */
    @RequestMapping(value = "/updateUser")
    public String updateUser(int id, int item, String userName, String phone, String emergencycall,
                             int week, double start_time, double end_time, String address,
                             String money, @RequestParam(required = false) String stadium,
                             @RequestParam(required = false) String badminton, String remark){
        System.out.println(id + "  " + item + "  " + userName + "  " + phone + "  " + emergencycall + "  "
                + week + "  " + start_time + "  " + end_time + "  " + address + "  " + money + "  " + stadium + "  " + badminton
                + "  " + remark);
        if(item == 0){
            basketballService.updateUser(id, userName, phone, emergencycall, week, start_time, end_time, address, money, stadium,remark);
        }else{
            badmintonService.updateUser(id, userName, phone, emergencycall, week, start_time, end_time, address, money, badminton, remark);
        }
        return "redirect:/user/getAllUser?stadium=0&week=7&start_time=0&end_time=0&start=1";
    }

}

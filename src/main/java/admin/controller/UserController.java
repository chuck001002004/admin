package admin.controller;

import admin.service.BadmintonService;
import admin.service.BasketballService;
import admin.service.UserService;
import admin.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<User> list = null;
        if(stadium == 0){
            list = userService.getAllUser(userName, phone, week, start_time, end_time, start, PAGE_SIZE);
        }else if(stadium == 1){
            list = basketballService.getAllUser(userName, phone, week, start_time, end_time, start, PAGE_SIZE);
        }else{
            list = badmintonService.getAllUser(userName, phone, week, start_time, end_time, start, PAGE_SIZE);
        }
        int order_count = list == null ? 0 : list.size();
        int count = (int) Math.ceil(order_count / PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("order_count", order_count);
//        for(User o : list){
//            System.out.println(o);
//        }
        return "checkuser";
    }

    /**
     * ���ӳ�פ�û�
     * @param stadium ����
     * @param userName �û���
     * @param phone �绰
     * @param emergencycall ������ϵ��ʽ
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param address ��ϵ��ַ
     * @param money ���
     * @param site_no ���غ�
     * @param remark ��ע
     * @return
     */
    @RequestMapping(value = "/addUser")
    public String addUser(int stadium, String userName, String phone, String emergencycall,
                          int week, double start_time, double end_time, String address,
                          String money, String site_no, String remark){
        if(stadium == 0){
            basketballService.addUser(userName, phone, emergencycall, week, start_time, end_time, address, money, site_no, remark);
        }else{
            badmintonService.addUser(userName, phone, emergencycall, week, start_time, end_time, address, money, site_no, remark);
        }
        return "adduser";
    }

}

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
     * 获取符合条件的用户
     * @param stadium 场地类型
     * @param userName 用户名
     * @param phone 的话
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 符合条件的用户
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
     * 增加常驻用户
     * @param stadium 类型
     * @param userName 用户名
     * @param phone 电话
     * @param emergencycall 紧急联系方式
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param address 联系地址
     * @param money 金额
     * @param site_no 场地号
     * @param remark 备注
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

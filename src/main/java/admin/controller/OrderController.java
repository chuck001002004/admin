package admin.controller;

import admin.service.BadmintonService;
import admin.service.BasketballService;
import admin.service.OrderService;
import admin.service.PingpangService;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by Boqi-Hu on 2017/5/20.
 * 订单管理Controller
 */
@Controller
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;
    @Autowired
    BasketballService basketballService;
    @Autowired
    BadmintonService badmintonService;
    @Autowired
    PingpangService pingpangService;

    final int PAGE_SIZE = 20;

    /**
     * 无条件条件筛选订单记录
     * @param start 开始页数
     * @param map
     * @return 所有的订单
     */
    @RequestMapping(value = "/getAllOrder")
    public String getAllOrder(int start, Map<String, Object> map){
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = orderService.getAllOrder(start, PAGE_SIZE);
        map.put("list", list);
        int count = (int) Math.ceil(list.size() / PAGE_SIZE);
        map.put("page_count", count);
        return "home";
    }

    /**
     * 根据条件获取已完成订单
     * @param stadium 场地类型
     * @param start 开始页数
     * @param stadium 场地类型
     * @param userName 预约人
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param map
     * @return
     */
    @RequestMapping(value = "/getAllCompleteOrder")
    public String getAllCompelteOrder(int stadium, String userName, String phone, String date,
                                      double start_time, double end_time, int start, Map<String, Object> map){
        System.out.println(stadium + "  " + userName + "  " + phone + "  " + date + "  " + start_time + "  " + end_time + "  " + start);
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            list = orderService.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else if(stadium == 1){
            list = basketballService.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else if(stadium == 2){
            list = badmintonService.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else{
            list = pingpangService.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }
        int count = (int) Math.ceil(list.size() / PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        for(Order o : list){
            System.out.println(o);
        }
        return "finished";
    }

}

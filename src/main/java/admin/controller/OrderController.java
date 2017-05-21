package admin.controller;

import admin.service.BadmintonService;
import admin.service.BasketballService;
import admin.service.OrderService;
import admin.service.PingpangService;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        for(Order o : list){
            System.out.println(o);
        }
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
     * @return 已完成订单
     */
    @RequestMapping(value = "/getAllCompleteOrder")
    public String getAllCompelteOrder(int stadium, String userName, String phone, String date,
                                      double start_time, double end_time, int start, Map<String, Object> map){
//        System.out.println(stadium + "  " + userName + "  " + phone + "  " + date + "  " + start_time + "  " + end_time + "  " + start);
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
        int order_count = list == null ? 0 : list.size();
        int count = (int) Math.ceil(order_count / PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("order_count", order_count);
//        for(Order o : list){
//            System.out.println(o);
//        }
        return "finished";
    }

    /**
     * 根据条件获取未完成订单
     * @param stadium 场地类型
     * @param start 开始页数
     * @param stadium 场地类型
     * @param userName 预约人
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param map
     * @return 未完成订单
     */
    @RequestMapping(value = "/getAllIncompleteOrder")
    public String getAllIncompleteOrder(int stadium, String userName, String phone, String date,
                                        double start_time, double end_time, int start, Map<String, Object> map){
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            list = orderService.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else if(stadium == 1){
            list = basketballService.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else if(stadium == 2){
            list = badmintonService.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else{
            list = pingpangService.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }
        int order_count = list == null ? 0 : list.size();
        int count = (int) Math.ceil(order_count / PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("order_count", order_count);
        for(Order o : list){
            System.out.println(o);
        }
        return "nofinished";
    }

    /**
     * 根据条件获取未支付订单
     * @param stadium 场地类型
     * @param start 开始页数
     * @param stadium 场地类型
     * @param userName 预约人
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param map
     * @return 未支付订单
     */
    @RequestMapping(value = "/getAllUnpayOrder")
    public String getAllUnpayOrder(int stadium, String userName, String phone, String date,
                                   double start_time, double end_time, int start, Map<String, Object> map){
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            list = orderService.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else if(stadium == 1){
            list = basketballService.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else if(stadium == 2){
            list = badmintonService.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }else{
            list = pingpangService.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
        }
        int order_count = list == null ? 0 : list.size();
        int count = (int) Math.ceil(order_count / PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("order_count", order_count);
        for(Order o : list){
            System.out.println(o);
        }
        return "nopay";
    }

    /**
     * 增加订单
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param item 场地类型
     * @param stadium 场地号
     * @return 转到未支付订单页等待确认
     */
    @RequestMapping(value = "/addOrder")
    public String addOrder(String userName, String phone, String date, double start_time,
                           double end_time, int item, @RequestParam(required = false) String stadium,
                           @RequestParam(required = false) String site_no){
        System.out.println(userName + "  " + phone + "  " + date + "  " + start_time + "  "
                + end_time + "  " + item + "  " + stadium);
        if(item == 0){
            basketballService.addOrder(userName, phone, date, start_time, end_time, stadium.length() == 1 ? "0" : "1", stadium);
        }else if(item == 1){
            badmintonService.addOrder(userName, phone, date, start_time, end_time, site_no);
        }else{
            pingpangService.addOrder(userName, phone, date, start_time, end_time);
        }
        return "additem";
    }

}

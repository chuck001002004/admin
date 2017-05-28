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
     * 根据条件获取所有订单
     * @param wechat 是否微信预约
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
    @RequestMapping(value = "/getAllOrder")
    public String getAllOrder(int stadium, int wechat, String userName, String phone, String date,
                              double start_time, double end_time, int start, Map<String, Object> map){
//        System.out.println(stadium + "  " + wechat + "  " + userName + "  " + phone + "  " + date + "  " + start_time +
//                "  " + end_time + "  " + start);
        map.put("stadium", stadium);
        map.put("wechat", wechat);
        map.put("userName", (userName == null || userName.equals("")) ? "" : userName);
        map.put("phone", (phone == null || phone.equals("")) ? "" : phone);
        map.put("date", (date == null || date.equals("")) ? "" : date);
        map.put("start_time", start_time);
        map.put("end_time", end_time);
        map.put("start", start);
        int order_count = 0;
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            if(wechat == 0){    //非微信预约
                order_count = orderService.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){  //微信预约
                order_count = orderService.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{  //显示所有
                order_count = orderService.getAllOrderCount();
                list = orderService.getAllOrder(start, PAGE_SIZE);
            }
        }else if(stadium == 1){
            if(wechat == 0){
                order_count = basketballService.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = basketballService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = basketballService.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = basketballService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 2){
            if(wechat == 0){
                order_count = badmintonService.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = badmintonService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = badmintonService.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = badmintonService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else{
            if(wechat == 0){
                order_count = pingpangService.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = pingpangService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = pingpangService.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = pingpangService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }
        int count = (int) Math.ceil((double)order_count / (double)PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("cnt", list == null ? 0 : list.size());
        return "home";
    }

    /**
     * 根据条件获取已完成订单
     * @param wechat 是否微信预约
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
    public String getAllCompelteOrder(int stadium, int wechat, String userName, String phone, String date,
                                      double start_time, double end_time, int start, Map<String, Object> map){
        map.put("stadium", stadium);
        map.put("wechat", wechat);
        map.put("userName", (userName == null || userName.equals("")) ? "" : userName);
        map.put("phone", (phone == null || phone.equals("")) ? "" : phone);
        map.put("date", (date == null || date.equals("")) ? "" : date);
        map.put("start_time", start_time);
        map.put("end_time", end_time);
        map.put("start", start);
        int order_count = 0;
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            if(wechat == 0){    //非微信预约
                order_count = orderService.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){  //微信预约
                order_count = orderService.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{  //全部
                order_count = orderService.getAllCompleteOrderCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 1){
            if(wechat == 0){
                order_count = basketballService.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = basketballService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = basketballService.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = basketballService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 2){
            if(wechat == 0){
                order_count = badmintonService.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = badmintonService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = badmintonService.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = badmintonService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else{
            if(wechat == 0){
                order_count = pingpangService.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = pingpangService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = pingpangService.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = pingpangService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }
        int count = (int) Math.ceil((double)order_count / (double)PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("cnt", list == null ? 0 : list.size());
        return "finished";
    }

    /**
     * 根据条件获取未完成订单
     * @param wechat 是否微信预约
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
    public String getAllIncompleteOrder(int stadium, int wechat, String userName, String phone, String date,
                                        double start_time, double end_time, int start, Map<String, Object> map){
        map.put("stadium", stadium);
        map.put("wechat", wechat);
        map.put("userName", (userName == null || userName.equals("")) ? "" : userName);
        map.put("phone", (phone == null || phone.equals("")) ? "" : phone);
        map.put("date", (date == null || date.equals("")) ? "" : date);
        map.put("start_time", start_time);
        map.put("end_time", end_time);
        map.put("start", start);
        int order_count = 0;
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            if(wechat == 0){
                order_count = orderService.getAllIncompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllIncompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){
                order_count = orderService.getAllIncompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllIncompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = orderService.getAllIncompleteOrderCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 1){
            if(wechat == 0){
                order_count = basketballService.getAllIncompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = basketballService.getAllIncompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = basketballService.getAllIncompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = basketballService.getAllIncompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 2){
            if(wechat == 0){
                order_count = badmintonService.getAllIncompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = badmintonService.getAllIncompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = badmintonService.getAllIncompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = badmintonService.getAllIncompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else{
            if(wechat == 0){
                order_count = pingpangService.getAllIncompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = pingpangService.getAllIncompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = pingpangService.getAllIncompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = pingpangService.getAllIncompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }
        int count = (int) Math.ceil((double)order_count / (double)PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("cnt", list == null ? 0 : list.size());
        return "nofinished";
    }

    /**
     * 根据条件获取未支付订单
     * @param wechat 是否微信预约
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
    public String getAllUnpayOrder(int stadium, int wechat, String userName, String phone, String date,
                                   double start_time, double end_time, int start, Map<String, Object> map){
        map.put("stadium", stadium);
        map.put("wechat", wechat);
        map.put("userName", (userName == null || userName.equals("")) ? "" : userName);
        map.put("phone", (phone == null || phone.equals("")) ? "" : phone);
        map.put("date", (date == null || date.equals("")) ? "" : date);
        map.put("start_time", start_time);
        map.put("end_time", end_time);
        map.put("start", start);
        int order_count = 0;
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            if(wechat == 0){
                order_count = orderService.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){
                order_count = orderService.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = orderService.getAllUnpayOrderCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 1){
            if(wechat == 0){
                order_count = basketballService.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = basketballService.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = basketballService.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = basketballService.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 2){
            if(wechat == 0){
                order_count = badmintonService.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = badmintonService.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = badmintonService.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = badmintonService.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else{
            if(wechat == 0){
                order_count = pingpangService.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = pingpangService.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                order_count = pingpangService.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = pingpangService.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }
        int count = (int) Math.ceil((double)order_count / (double)PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("cnt", list == null ? 0 : list.size());
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
                           double end_time, int item, @RequestParam(required = false) String stadium){
        if(item == 0){
            basketballService.addOrder(userName, phone, date, start_time, end_time, stadium.length() == 1 ? "0" : "1", stadium);
        }else if(item == 1){
            badmintonService.addOrder(userName, phone, date, start_time, end_time, stadium);
        }else{
            pingpangService.addOrder(userName, phone, date, start_time, end_time);
        }
        return "additem";
    }

}

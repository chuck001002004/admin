package admin.controller;

import admin.service.BasketballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Controller
@RequestMapping(value = "/basketball")
public class BasketballController {

    @Autowired
    BasketballService basketballService;

    /**
     * 实时查看篮球场剩余情况
     * @param date 日期
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 被占用的场地号
     */
    @RequestMapping(value = "/getUnbookedSite", produces = {"plain/html;charset=UTF-8"})
    @ResponseBody
    public String getUnbookedSite(String date, int week, double start_time, double end_time){
        return basketballService.getUnbookedSite(date, week, start_time, end_time);
    }

    /**
     * 实时查看篮球场剩余情况(针对长期用户预约功能)
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 同时段被其他长期用户占用的场地号
     */
    @RequestMapping(value = "/getUnbookedSiteByLong")
    @ResponseBody
    public String getUnbookedSiteByLong(int week, double start_time, double end_time){
//        System.out.println(basketballService.getUnbookedSiteByLong(week, start_time, end_time));
        return basketballService.getUnbookedSiteByLong(week, start_time, end_time);
    }

    /**
     * 删除订单
     * @param id 订单id
     * @param from 来自页面
     * @param stadium 场地类型
     * @param wechat 是否微信
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    @RequestMapping(value = "/deleteOrder")
    public String deleteOrder(int id, String from, int stadium, int wechat, String userName, String phone,
                              String date, double start_time, double end_time, int start){
//        System.out.println(id + "  " + from + "  " + stadium + "  " + wechat + " " + userName + "  " +
//        "  " + phone + "  " + date + "  " + start_time + "  " + end_time + " " + start);
        basketballService.deleteOrder(id);
        return from.equals("home") ? "redirect:/order/getAllOrder?stadium=" + stadium + "&wechat=" + wechat + "&userName=" + userName +
                "&phone=" + phone + "&date=" + date + "&start_time=" + start_time + "&end_time=" + end_time + "&start=" + start :
                from.equals("finish") ? "redirect:/order/getAllCompleteOrder?stadium=" + stadium + "&wechat=" + wechat + "&userName=" + userName +
                        "&phone=" + phone + "&date=" + date + "&start_time=" + start_time + "&end_time=" + end_time + "&start=" + start :
                from.equals("nofinish") ? "redirect:/order/getAllIncompleteOrder?stadium=" + stadium + "&wechat=" + wechat + "&userName=" + userName +
                        "&phone=" + phone + "&date=" + date + "&start_time=" + start_time + "&end_time=" + end_time + "&start=" + start :
                "redirect:/order/getAllUnpayOrder?stadium=" + stadium + "&wechat=" + wechat + "&userName=" + userName +
                        "&phone=" + phone + "&date=" + date + "&start_time=" + start_time + "&end_time=" + end_time + "&start=" + start;
    }

    /**
     * 未完成订单确认完成
     * @param id 订单id
     * @param stadium 订单类型
     * @param wechat 是否微信预约
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始页
     * @return
     */
    @RequestMapping(value = "/completeOrder")
    public String completeOrder(int id, int stadium, int wechat, String userName, String phone,
                                String date, double start_time, double end_time, int start){
        basketballService.completeOrder(id);
        return "redirect:/order/getAllIncompleteOrder?stadium=" + stadium + "&wechat=" + wechat + "&userName=" + userName +
                "&phone=" + phone + "&date=" + date + "&start_time=" + start_time + "&end_time=" + end_time + "&start=" + start;
    }

    /**
     * 未支付订单确认支付
     * @param id 订单id
     * @param stadium 订单类型
     * @param wechat 是否微信预约
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始页
     * @return
     */
    @RequestMapping(value = "/payOrder")
    public String payOrder(int id, int stadium, int wechat, String userName, String phone,
                           String date, double start_time, double end_time, int start){
        basketballService.payOrder(id);
        return "redirect:/order/getAllUnpayOrder?stadium=" + stadium + "&wechat=" + wechat + "&userName=" + userName +
                "&phone=" + phone + "&date=" + date + "&start_time=" + start_time + "&end_time=" + end_time + "&start=" + start;
    }

}

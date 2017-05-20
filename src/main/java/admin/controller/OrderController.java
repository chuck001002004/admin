package admin.controller;

import admin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Boqi-Hu on 2017/5/20.
 * 订单管理Controller
 */
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * 根据条件筛选订单记录
     * @param stadium 场地类型
     * @param userName 预约人
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param type 类型   0——所有，1——已完成，2——未完成，3——未支付
     * @param map
     * @return 所有符合条件的订单
     */
    @RequestMapping(value = "/getAllOrder")
    public String getAllOrder(int stadium, String userName, String phone, String date, String start_time,
                              String end_time, int type, Map<String, Object> map){

        return null;
    }

}

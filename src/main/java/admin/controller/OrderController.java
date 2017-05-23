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
 * ��������Controller
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
     * ����������ȡ���ж���
     * @param wechat �Ƿ�΢��ԤԼ
     * @param stadium ��������
     * @param start ��ʼҳ��
     * @param stadium ��������
     * @param userName ԤԼ��
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param map
     * @return
     */
    @RequestMapping(value = "/getAllOrder")
    public String getAllOrder(int stadium, int wechat, String userName, String phone, String date,
                              double start_time, double end_time, int start, Map<String, Object> map){
//        System.out.println(stadium + "  " + wechat + "  " + userName + "  " + phone + "  " + date + "  " + start_time +
//                "  " + end_time + "  " + start);
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            if(wechat == 0){    //��΢��ԤԼ
                list = orderService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){  //΢��ԤԼ
                list = orderService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{  //��ʾ����
                list = orderService.getAllOrder(start, PAGE_SIZE);
            }
        }else if(stadium == 1){
            if(wechat == 0){
                list = basketballService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = basketballService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 2){
            if(wechat == 0){
                list = badmintonService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = badmintonService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else{
            if(wechat == 0){
                list = pingpangService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = pingpangService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }
        int order_count = list == null ? 0 : list.size();
        int count = (int) Math.ceil(order_count / PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("order_count", order_count);
//        for(Order o : list){
//            System.out.println(o);
//        }
        return "home";
    }

    /**
     * ����������ȡ����ɶ���
     * @param wechat �Ƿ�΢��ԤԼ
     * @param stadium ��������
     * @param start ��ʼҳ��
     * @param stadium ��������
     * @param userName ԤԼ��
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param map
     * @return ����ɶ���
     */
    @RequestMapping(value = "/getAllCompleteOrder")
    public String getAllCompelteOrder(int stadium, int wechat, String userName, String phone, String date,
                                      double start_time, double end_time, int start, Map<String, Object> map){
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            if(wechat == 0){    //��΢��ԤԼ
                list = orderService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){  //΢��ԤԼ
                list = orderService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{  //ȫ��
                list = orderService.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 1){
            if(wechat == 0){
                list = basketballService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = basketballService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 2){
            if(wechat == 0){
                list = badmintonService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = badmintonService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else{
            if(wechat == 0){
                list = pingpangService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = pingpangService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
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
     * ����������ȡδ��ɶ���
     * @param wechat �Ƿ�΢��ԤԼ
     * @param stadium ��������
     * @param start ��ʼҳ��
     * @param stadium ��������
     * @param userName ԤԼ��
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param map
     * @return δ��ɶ���
     */
    @RequestMapping(value = "/getAllIncompleteOrder")
    public String getAllIncompleteOrder(int stadium, int wechat, String userName, String phone, String date,
                                        double start_time, double end_time, int start, Map<String, Object> map){
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            if(wechat == 0){
                list = orderService.getAllIncompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){
                list = orderService.getAllIncompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = orderService.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 1){
            if(wechat == 0){
                list = basketballService.getAllIncompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = basketballService.getAllIncompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 2){
            if(wechat == 0){
                list = badmintonService.getAllIncompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = badmintonService.getAllIncompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else{
            if(wechat == 0){
                list = pingpangService.getAllIncompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = pingpangService.getAllIncompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }
        int order_count = list == null ? 0 : list.size();
        int count = (int) Math.ceil(order_count / PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("order_count", order_count);
//        for(Order o : list){
//            System.out.println(o);
//        }
        return "nofinished";
    }

    /**
     * ����������ȡδ֧������
     * @param wechat �Ƿ�΢��ԤԼ
     * @param stadium ��������
     * @param start ��ʼҳ��
     * @param stadium ��������
     * @param userName ԤԼ��
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param map
     * @return δ֧������
     */
    @RequestMapping(value = "/getAllUnpayOrder")
    public String getAllUnpayOrder(int stadium, int wechat, String userName, String phone, String date,
                                   double start_time, double end_time, int start, Map<String, Object> map){
//        System.out.println(stadium + "  " + wechat + "  " + userName + "  " + phone + "  " + date + "  " + start_time +
//                "  " + end_time + "  " + start);
        map.put("start", start);
        start = (start - 1) * PAGE_SIZE;
        List<Order> list = null;
        if(stadium == 0){
            if(wechat == 0){
                list = orderService.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){
                list = orderService.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = orderService.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 1){
            if(wechat == 0){
                list = basketballService.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = basketballService.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else if(stadium == 2){
            if(wechat == 0){
                list = badmintonService.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = badmintonService.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }else{
            if(wechat == 0){
                list = pingpangService.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{
                list = pingpangService.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }
        }
        int order_count = list == null ? 0 : list.size();
        int count = (int) Math.ceil(order_count / PAGE_SIZE);
        map.put("list", list);
        map.put("page_count", count);
        map.put("order_count", order_count);
//        for(Order o : list){
//            System.out.println(o);
//        }
        return "nopay";
    }

    /**
     * ���Ӷ���
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param item ��������
     * @param stadium ���غ�
     * @return ת��δ֧������ҳ�ȴ�ȷ��
     */
    @RequestMapping(value = "/addOrder")
    public String addOrder(String userName, String phone, String date, double start_time,
                           double end_time, int item, @RequestParam(required = false) String stadium){
//        System.out.println(userName + "  " + phone + "  " + date + "  " + start_time + "  "
//                + end_time + "  " + item + "  " + stadium);
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

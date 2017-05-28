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
            if(wechat == 0){    //��΢��ԤԼ
                order_count = orderService.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){  //΢��ԤԼ
                order_count = orderService.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{  //��ʾ����
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
            if(wechat == 0){    //��΢��ԤԼ
                order_count = orderService.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else if(wechat == 1){  //΢��ԤԼ
                order_count = orderService.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
                list = orderService.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, PAGE_SIZE);
            }else{  //ȫ��
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

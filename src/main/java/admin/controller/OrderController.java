package admin.controller;

import admin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Boqi-Hu on 2017/5/20.
 * ��������Controller
 */
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * ��������ɸѡ������¼
     * @param stadium ��������
     * @param userName ԤԼ��
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param type ����   0�������У�1��������ɣ�2����δ��ɣ�3����δ֧��
     * @param map
     * @return ���з��������Ķ���
     */
    @RequestMapping(value = "/getAllOrder")
    public String getAllOrder(int stadium, String userName, String phone, String date, String start_time,
                              String end_time, int type, Map<String, Object> map){

        return null;
    }

}

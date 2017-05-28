package admin.controller;

import admin.service.BadmintonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Controller
@RequestMapping(value = "/badminton")
public class BadmintonController {

    @Autowired
    BadmintonService badmintonService;

    /**
     * ʵʱ�鿴��ë��ʣ�����
     * @param date ԤԼ����
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ��ռ�õĳ��غ�
     */
    @RequestMapping(value = "/getUnbookedSite")
    @ResponseBody
    public String getUnbookedSite(String date, int week, double start_time, double end_time){
        return badmintonService.getUnbookedSite(date, week, start_time, end_time);
    }

    /**
     * ʵʱ�鿴��ë��ʣ�����(��Գ����û�ԤԼ����)
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ͬʱ�α����������û�ռ�õĳ��غ�
     */
    @RequestMapping(value = "/getUnbookedSiteByLong")
    @ResponseBody
    public String getUnbookedSiteByLong(int week, double start_time, double end_time){
        return badmintonService.getUnbookedSiteByLong(week, start_time, end_time);
    }

    /**
     * ɾ������
     * @param id ����id
     * @param from ����ҳ��
     * @param stadium ��������
     * @param wechat �Ƿ�΢��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    @RequestMapping(value = "/deleteOrder")
    public String deleteOrder(int id, String from, int stadium, int wechat, String userName, String phone,
                              String date, double start_time, double end_time, int start){
        badmintonService.deleteOrder(id);
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
     * δ��ɶ���ȷ�����
     * @param id ����id
     * @param stadium ��������
     * @param wechat �Ƿ�΢��ԤԼ
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼҳ
     * @return
     */
    @RequestMapping(value = "/completeOrder")
    public String completeOrder(int id, int stadium, int wechat, String userName, String phone,
                                String date, double start_time, double end_time, int start){
        badmintonService.completeOrder(id);
        return "redirect:/order/getAllIncompleteOrder?stadium=" + stadium + "&wechat=" + wechat + "&userName=" + userName +
                "&phone=" + phone + "&date=" + date + "&start_time=" + start_time + "&end_time=" + end_time + "&start=" + start;
    }

    /**
     * δ֧������ȷ��֧��
     * @param id ����id
     * @param stadium ��������
     * @param wechat �Ƿ�΢��ԤԼ
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼҳ
     * @return
     */
    @RequestMapping(value = "/payOrder")
    public String payOrder(int id, int stadium, int wechat, String userName, String phone,
                           String date, double start_time, double end_time, int start){
        badmintonService.payOrder(id);
        return "redirect:/order/getAllUnpayOrder?stadium=" + stadium + "&wechat=" + wechat + "&userName=" + userName +
                "&phone=" + phone + "&date=" + date + "&start_time=" + start_time + "&end_time=" + end_time + "&start=" + start;
    }

}

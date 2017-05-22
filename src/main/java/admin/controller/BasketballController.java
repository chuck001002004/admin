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
     * ʵʱ�鿴����ʣ�����
     * @param date ����
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ��ռ�õĳ��غ�
     */
    @RequestMapping(value = "/getUnbookedSite", produces = {"plain/html;charset=UTF-8"})
    @ResponseBody
    public String getUnbookedSite(String date, int week, double start_time, double end_time){
        return basketballService.getUnbookedSite(date, week, start_time, end_time);
    }

}

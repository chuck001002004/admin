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

}

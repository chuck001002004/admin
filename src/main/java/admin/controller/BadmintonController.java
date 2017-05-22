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
     * 实时查看羽毛球场剩余情况
     * @param date 预约日期
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 被占用的场地号
     */
    @RequestMapping(value = "/getUnbookedSite")
    @ResponseBody
    public String getUnbookedSite(String date, int week, double start_time, double end_time){
        return badmintonService.getUnbookedSite(date, week, start_time, end_time);
    }

}

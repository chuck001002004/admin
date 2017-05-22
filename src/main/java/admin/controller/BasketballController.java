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

}

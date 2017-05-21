package admin.service;

import admin.dao.BadmintonDao;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Service
public class BadmintonService {

    @Autowired
    BadmintonDao badmintonDao;

    /**
     * 获取所有已完成订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return 所有已完成的订单
     */
    public List<Order> getAllCompleteOrder(String userName, String phone, String date, double start_time,
                                    double end_time, int start, int page_size){
        return badmintonDao.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

}

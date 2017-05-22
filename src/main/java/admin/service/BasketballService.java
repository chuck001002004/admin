package admin.service;

import admin.dao.BasketballDao;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Service
public class BasketballService {

    @Autowired
    BasketballDao basketballDao;

    /**
     * 获取所有已完成的篮球订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return 所有已完成的篮球订单
     */
    public List<Order> getAllCompleteOrder(String userName, String phone, String date, double start_time,
                                      double end_time, int start, int page_size){
        return basketballDao.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有未完成订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return 所有未完成的订单
     */
    public List<Order> getAllIncompleteOrder(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return basketballDao.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有未完成订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return 所有未完成的订单
     */
    public List<Order> getAllUnpayOrder(String userName, String phone, String date, double start_time,
                                        double end_time, int start, int page_size){
        return basketballDao.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 添加订单
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param site_type 场地类型
     * @param site_no 场地号
     */
    public void addOrder(String userName, String phone, String date, double start_time,
                         double end_time, String site_type, String site_no){
        basketballDao.addOrder(userName, phone, date, start_time, end_time, site_type, site_no);
    }

    /**
     * 实时查看篮球场剩余情况
     * @param date 日期
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 被占用的场地号
     */
    public String getUnbookedSite(String date, int week, double start_time, double end_time){
        String res = "";
        //查询被普通用户预约的场地
        List<String> list1 = basketballDao.getUnbookedSite(date, start_time, end_time);
        for(String s : list1){
            res += s + ",";
        }
        //查询被常驻用户预约的场地
        list1 = basketballDao.getUnbookedSiteByLong(week, start_time, end_time);
        for(String s : list1){
            res += s + ",";
        }
        res = res.lastIndexOf(',') == -1 ? res : res.substring(0, res.lastIndexOf(','));
        return res;
    }

}

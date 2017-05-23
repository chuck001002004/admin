package admin.service;

import admin.dao.OrderDao;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/20.
 */
@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    /**
     * 获取所有订单记录
     * @param start 开始条数
     * @param page_size 总条数
     * @return 所有的订单
     */
    public List<Order> getAllOrder(int start, int page_size){
        return orderDao.getAllOrder(start, page_size);
    }

    /**
     * 获取所有订单记录数
     * @return 所有的订单
     */
    public int getAllOrderCount(){
        return orderDao.getAllOrderCount();
    }

    /**
     * 获取微信预约的所有订单
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllOrderByWechat(String userName, String phone, String date,
                                           double start_time, double end_time, int start, int page_size){
        return orderDao.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取微信预约的所有订单数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllOrderByWechatCount(String userName, String phone, String date,
                                           double start_time, double end_time){
        return orderDao.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取非微信预约的所有订单
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllOrderUnwechat(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return orderDao.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取非微信预约的所有订单数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return orderDao.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
    }

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
        return orderDao.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有已完成订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有已完成的订单
     */
    public int getAllCompleteOrderCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return orderDao.getAllCompleteOrderCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有已完成微信预约订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllCompleteOrderByWechat(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return orderDao.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有已完成微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllCompleteOrderByWechatCount(String userName, String phone, String date, double start_time,
                                                   double end_time){
        return orderDao.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有已完成非微信预约订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllCompleteOrderUnwechat(String userName, String phone, String date, double start_time,
                                                   double end_time, int start, int page_size){
        return orderDao.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有已完成非微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllCompleteOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                                   double end_time){
        return orderDao.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
        return orderDao.getAllInCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有未完成订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有未完成的订单
     */
    public int getAllIncompleteOrderCount(String userName, String phone, String date, double start_time,
                                             double end_time){
        return orderDao.getAllIncompleteOrderCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有未完成微信预约订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllIncompleteOrderByWechat(String userName, String phone, String date, double start_time,
                                             double end_time, int start, int page_size){
        return orderDao.getAllInCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有未完成微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllIncompleteOrderByWechatCount(String userName, String phone, String date, double start_time,
                                                     double end_time){
        return orderDao.getAllIncompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有未完成非微信预约订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllIncompleteOrderUnwechat(String userName, String phone, String date, double start_time,
                                             double end_time, int start, int page_size){
        return orderDao.getAllInCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有未完成非微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllIncompleteOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                                     double end_time){
        return orderDao.getAllIncompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有未支付订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllUnpayOrder(String userName, String phone, String date, double start_time,
                                             double end_time, int start, int page_size){
        return orderDao.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有未支付订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllUnpayOrderCount(String userName, String phone, String date, double start_time,
                                        double end_time){
        return orderDao.getAllUnpayOrderCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有未支付微信支付订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllUnpayOrderByWechat(String userName, String phone, String date, double start_time,
                                        double end_time, int start, int page_size){
        return orderDao.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有未支付微信支付订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllUnpayOrderByWechatCount(String userName, String phone, String date, double start_time,
                                                double end_time){
        return orderDao.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有未支付非微信支付订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllUnpayOrderUnwechat(String userName, String phone, String date, double start_time,
                                                double end_time, int start, int page_size){
        return orderDao.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有未支付非微信支付订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllUnpayOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                                double end_time){
        return orderDao.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
    }

}

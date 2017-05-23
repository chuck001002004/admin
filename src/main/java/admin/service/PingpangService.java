package admin.service;

import admin.dao.PingpangDao;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Service
public class PingpangService {

    @Autowired
    PingpangDao pingpangDao;

    /**
     * 获取所有微信预约的乒乓球订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    public List<Order> getAllOrderByWechat(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return pingpangDao.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有微信预约的乒乓球订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllOrderByWechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return pingpangDao.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有非微信预约的乒乓球订单记录
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
        return pingpangDao.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有非微信预约的乒乓球订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return pingpangDao.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//    public List<Order> getAllCompleteOrder(String userName, String phone, String date, double start_time,
//                                           double end_time, int start, int page_size){
//        return pingpangDao.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
//    }

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
        return pingpangDao.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return pingpangDao.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return pingpangDao.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return pingpangDao.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//    public List<Order> getAllIncompleteOrder(String userName, String phone, String date, double start_time,
//                                             double end_time, int start, int page_size){
//        return pingpangDao.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
//    }

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
        return pingpangDao.getAllInCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return pingpangDao.getAllInCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return pingpangDao.getAllInCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return pingpangDao.getAllInCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//    public List<Order> getAllUnpayOrder(String userName, String phone, String date, double start_time,
//                                        double end_time, int start, int page_size){
//        return pingpangDao.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, page_size);
//    }

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
        return pingpangDao.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return pingpangDao.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return pingpangDao.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return pingpangDao.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 添加订单
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     */
    public void addOrder(String userName, String phone, String date, double start_time,
                         double end_time){
        System.out.println(userName + "  " + phone + "  " + date + "  " + start_time + "  "
                + end_time);
        pingpangDao.addOrder(userName, phone, date, start_time, end_time);
    }

}

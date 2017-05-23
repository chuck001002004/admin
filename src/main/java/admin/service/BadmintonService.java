package admin.service;

import admin.dao.BadmintonDao;
import admin.vo.Order;
import admin.vo.User;
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
     * 获取所有微信预约的羽毛球订单记录
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
        return badmintonDao.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有微信预约的羽毛球订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllOrderByWechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return badmintonDao.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有非微信预约的羽毛球订单记录
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
        return badmintonDao.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有非微信预约的羽毛球订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return badmintonDao.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//                                    double end_time, int start, int page_size){
//        return badmintonDao.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return badmintonDao.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//                                           double end_time, int start, int page_size){
//        return badmintonDao.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllInCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllInCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return badmintonDao.getAllInCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllInCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//        return badmintonDao.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return badmintonDao.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return badmintonDao.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 添加订单
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param site_no 场地号
     */
    public void addOrder(String userName, String phone, String date, double start_time,
                         double end_time, String site_no){
        System.out.println(userName + "  " + phone + "  " + date + "  " + start_time + "  "
                + end_time + "  " + site_no);
        badmintonDao.addOrder(userName, phone, date, start_time, end_time, site_no);
    }

    /**
     * 实时查看羽毛球场剩余情况
     * @param date 预约日期
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 被占用的场地号
     */
    public String getUnbookedSite(String date, int week, double start_time, double end_time){
        String res = "";
        List<String> list1 = badmintonDao.getBookedSite(date, start_time, end_time);
        for(String s : list1){
            res += s + ",";
        }
        list1 = badmintonDao.getBookedSiteByLong(week, start_time, end_time);
        for(String s : list1){
            res += s + ",";
        }
        res = res.lastIndexOf(',') == -1 ? res : res.substring(0, res.lastIndexOf(','));
        return res;
    }

    /**
     * 获取符合条件的用户
     * @param userName 用户名
     * @param phone 的话
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 记录开始条数
     * @param page_size 最大记录条数
     * @return 符合条件的用户
     */
    public List<User> getAllUser(String userName, String phone, int week, double start_time,
                                 double end_time, int start, int page_size){
        return badmintonDao.getAllUser(userName, phone, week, start_time, end_time, start, page_size);
    }

    /**
     * 增加常驻用户
     * @param userName 用户名
     * @param phone 联系方式
     * @param emergencycall 紧急联系方式
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param address 联系地址
     * @param money 金额
     * @param site_no 场地号
     * @param remark 备注
     */
    public void addUser(String userName, String phone, String emergencycall, int week,
                        double start_time, double end_time, String address, String money,
                        String site_no, String remark){
        badmintonDao.addUser(userName, phone, emergencycall, week, start_time, end_time,
                address, money, site_no, remark);
    }

    /**
     * 根据id查找用户
     * @param id 用户id
     * @return 对应用户
     */
    public User getUserById(int id){
        return badmintonDao.getUserById(id);
    }

    /**
     * 删除用户
     * @param id 用户id
     */
    public void deleteUserById(int id){
        badmintonDao.deleteUserById(id);
    }

    /**
     * 删除订单
     * @param id 订单id
     * @return
     */
    public void deleteOrder(int id){
        badmintonDao.deleteOrder(id);
    }

}

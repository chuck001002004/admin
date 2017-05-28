package admin.service;

import admin.dao.BasketballDao;
import admin.vo.Order;
import admin.vo.User;
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
     * 获取所有微信预约的篮球订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return 所有的篮球订单
     */
    public List<Order> getAllOrderByWechat(String userName, String phone, String date, double start_time,
                                   double end_time, int start, int page_size){
        return basketballDao.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有微信预约的篮球订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有的篮球订单
     */
    public int getAllOrderByWechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return basketballDao.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有非微信预约的篮球订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return 所有的篮球订单
     */
    public List<Order> getAllOrderUnwechat(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return basketballDao.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有非微信预约的篮球订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有的篮球订单
     */
    public int getAllOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return basketballDao.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有已完成的篮球微信预约订单记录
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
        return basketballDao.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有已完成的篮球微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllCompleteOrderByWechatCount(String userName, String phone, String date, double start_time,
                                                   double end_time){
        return basketballDao.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * 获取所有已完成的篮球非微信预约订单记录
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
        return basketballDao.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * 获取所有已完成的篮球非微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllCompleteOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                                   double end_time){
        return basketballDao.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
        return basketballDao.getAllInCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return basketballDao.getAllInCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return basketballDao.getAllInCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return basketballDao.getAllInCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
        return basketballDao.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return basketballDao.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return basketballDao.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return basketballDao.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
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

    /**
     * 实时查看篮球场剩余情况(针对长期用户预约功能)
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 同时段被其他长期用户占用的场地号
     */
    public String getUnbookedSiteByLong(int week, double start_time, double end_time){
        List<String> list = basketballDao.getUnbookedSiteByLong(week, start_time, end_time);
        String res = "";
        for(String s : list){
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
        return basketballDao.getAllUser(userName, phone, week, start_time, end_time, start, page_size);
    }

    /**
     * 获取符合条件的用户数
     * @param userName 用户名
     * @param phone 的话
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllUserCount(String userName, String phone, int week, double start_time,
                                 double end_time){
        return basketballDao.getAllUserCount(userName, phone, week, start_time, end_time);
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
        basketballDao.addUser(userName, phone, emergencycall, week, start_time, end_time,
                address, money, site_no, site_no.length() == 1 ? "0" : "1", remark);
    }

    /**
     * 根据id查找用户
     * @param id 用户id
     * @return 对应用户
     */
    public User getUserById(int id){
        return basketballDao.getUserById(id);
    }

    /**
     * 删除用户
     * @param id 用户id
     */
    public void deleteUserById(int id){
        basketballDao.deleteUserById(id);
    }

    /**
     * 删除订单
     * @param id 订单id
     * @return
     */
    public void deleteOrder(int id){
        basketballDao.deleteOrder(id);
    }

    /**
     * 未完成订单确认完成
     * @param id 订单id
     */
    public void completeOrder(int id){
        basketballDao.completeOrder(id);
    }

    /**
     * 未支付订单确认支付
     * @param id 订单id
     */
    public void payOrder(int id){
        basketballDao.payOrder(id);
    }

    /**
     * 更新常驻用户
     * @param id 用户id
     * @param userName 用户名
     * @param phone 电话
     * @param emergencycall 紧急联系方式
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param address 联系地址
     * @param money 金额
     * @param stadium 场地号
     * @param remark 备注
     */
    public void updateUser(int id, String userName, String phone, String emergencycall,
                           int week, double start_time, double end_time, String address,
                           String money, String stadium, String remark){
        basketballDao.updateUser(id, userName, phone, emergencycall, week, start_time,
                end_time, address, money, stadium, stadium.length() == 1 ? "0" : "1", remark);
    }

}

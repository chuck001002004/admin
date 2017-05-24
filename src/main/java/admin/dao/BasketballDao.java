package admin.dao;

import admin.vo.Order;
import admin.vo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Repository
public interface BasketballDao {

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
    List<Order> getAllOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                            @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                            @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                            @Param(value = "page_size") int page_size);

    /**
     * 获取所有微信预约的篮球订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有的篮球订单
     */
    public int getAllOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                                        @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                        @Param(value = "end_time") double end_time);

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
    List<Order> getAllOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

    /**
     * 获取所有非微信预约的篮球订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有的篮球订单
     */
    public int getAllOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
                                        @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                        @Param(value = "end_time") double end_time);

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
//    List<Order> getAllCompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
//                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
//                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

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
    List<Order> getAllCompleteOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有已完成的篮球微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    public int getAllCompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    List<Order> getAllCompleteOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                            @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                            @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有已完成的篮球非微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllCompleteOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
//    List<Order> getAllIncompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
//                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
//                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

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
    List<Order> getAllInCompleteOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                              @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                              @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有未完成微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllInCompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                           @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    List<Order> getAllInCompleteOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                              @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                              @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有未完成非微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllInCompleteOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                  @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
//    List<Order> getAllUnpayOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
//                                 @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
//                                 @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有未支付微信预约订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    List<Order> getAllUnpayOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                         @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                         @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有未支付微信支付订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllUnpayOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                             @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

    /**
     * 获取所有未支付非微信预约订单记录
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return
     */
    List<Order> getAllUnpayOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                         @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                         @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有未支付非微信支付订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllUnpayOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                      @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    void addOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                  @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                  @Param(value = "end_time") double end_time, @Param(value = "site_type")String site_type,
                  @Param(value = "site_no") String site_no);

    /**
     * 实时查看篮球场剩余情况（普通用户预订）
     * @param date 日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 被占用的场地号
     */
    List<String> getUnbookedSite(@Param("date") String date, @Param("start_time") double start_time,
                                   @Param("end_time") double end_time);

    /**
     * 实时查看篮球场剩余情况（常驻用户预订）
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 被占用的场地号
     */
    List<String> getUnbookedSiteByLong(@Param("week") int week, @Param("start_time") double start_time,
                                       @Param("end_time") double end_time);

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
    List<User> getAllUser(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                          @Param(value = "week")int week, @Param(value = "start_time")double start_time,
                          @Param(value = "end_time") double end_time, @Param(value = "start") int start,
                          @Param(value = "page_size") int page_size);

    /**
     * 获取符合条件的用户数
     * @param userName 用户名
     * @param phone 的话
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllUserCount(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                               @Param(value = "week")int week, @Param(value = "start_time")double start_time,
                               @Param(value = "end_time") double end_time);

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
     * @param site_type 场地类型
     * @param remark 备注
     */
    void addUser(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                 @Param(value = "emergencycall")String emergencycall, @Param(value = "week") int week,
                 @Param(value = "start_time") double start_time, @Param(value = "end_time")double end_time,
                 @Param(value = "address") String address, @Param(value = "money")String money,
                 @Param(value = "site_no")String site_no, @Param(value = "site_type")String site_type,
                 @Param(value = "remark")String remark);

    /**
     * 根据id查找用户
     * @param id 用户id
     * @return 对应用户
     */
    User getUserById(@Param(value = "id") int id);

    /**
     * 删除用户
     * @param id 用户id
     */
    void deleteUserById(@Param(value = "id") int id);

    /**
     * 删除订单
     * @param id 订单id
     * @return
     */
    void deleteOrder(@Param(value = "id") int id);

    /**
     * 未完成订单确认完成
     * @param id 订单id
     */
    void completeOrder(@Param(value = "id") int id);

    /**
     * 未支付订单确认支付
     * @param id 订单id
     */
    void payOrder(@Param(value = "id") int id);

}

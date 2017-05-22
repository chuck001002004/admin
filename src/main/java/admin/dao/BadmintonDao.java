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
public interface BadmintonDao {

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
    List<Order> getAllOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

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
    List<Order> getAllOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

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
    List<Order> getAllCompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

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
    List<Order> getAllIncompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

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
    List<Order> getAllUnpayOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                 @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                 @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 添加订单
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param site_no 场地号
     */
    void addOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                  @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                  @Param(value = "end_time") double end_time, @Param(value = "site_no") String site_no);

    /**
     * 实时查看羽毛球场剩余情况（普通用户预约占用）
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 被占用的场地号
     */
    List<String> getBookedSite(@Param("date") String date, @Param("start_time") double start_time,
                               @Param("end_time") double end_time);

    /**
     * 实时查看羽毛球场剩余情况（常驻用户预约占用）
     * @param week 星期几
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 被占用的场地号
     */
    List<String> getBookedSiteByLong(@Param("week") int week, @Param("start_time") double start_time,
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
    void addUser(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                 @Param(value = "emergencycall")String emergencycall, @Param(value = "week") int week,
                 @Param(value = "start_time") double start_time, @Param(value = "end_time")double end_time,
                 @Param(value = "address") String address, @Param(value = "money")String money,
                 @Param(value = "site_no")String site_no, @Param(value = "remark")String remark);

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

}

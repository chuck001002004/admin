package admin.dao;

import admin.vo.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/20.
 */
@Repository
public interface OrderDao {

    /**
     * 获取所有订单记录
     * @param start 开始记录数
     * @param page_size 记录条数
     * @return 所有的订单
     */
    List<Order> getAllOrder(@Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有订单记录数
     * @return 所有的订单
     */
    int getAllOrderCount();

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
    List<Order> getAllOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

    /**
     * 获取微信预约的所有订单数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                                        @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                        @Param(value = "end_time") double end_time);

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
    List<Order> getAllOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

    /**
     * 获取非微信预约的所有订单数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone,
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
    List<Order> getAllCompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有已完成订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有已完成的订单
     */
    int getAllCompleteOrderCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
     * 获取所有已完成微信预约订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllCompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
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
     * 获取所有已完成非微信预约订单记录数
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
    List<Order> getAllInCompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有未完成订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有未完成的订单
     */
    int getAllIncompleteOrderCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                          @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    int getAllIncompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
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
    int getAllIncompleteOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                  @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    List<Order> getAllUnpayOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                      @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                      @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * 获取所有未支付订单记录数
     * @param userName 用户名
     * @param phone 电话
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return
     */
    int getAllUnpayOrderCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                     @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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

}

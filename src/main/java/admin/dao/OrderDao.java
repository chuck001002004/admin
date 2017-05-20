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
     * 根据条件筛选订单记录
     * @param userid 用户id
     * @param date 预约日期
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return 所有符合条件的订单
     */
    List<Order> getAllOrder(@Param(value = "userid") String userid, @Param(value = "date") String date,
                            @Param(value = "start_time") String start_time, @Param(value = "end_time")String end_time);

}

package admin.dao;

import admin.vo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/22.
 */
@Repository
public interface UserDao {

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
     * @return 符合条件的用户
     */
    public int getAllUserCount(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                               @Param(value = "week")int week, @Param(value = "start_time")double start_time,
                               @Param(value = "end_time") double end_time);

}

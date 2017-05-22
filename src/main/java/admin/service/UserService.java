package admin.service;

import admin.dao.UserDao;
import admin.vo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/22.
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

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
        return userDao.getAllUser(userName, phone, week, start_time, end_time, start, page_size);
    }

}

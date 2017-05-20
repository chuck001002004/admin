package admin.dao;

import admin.vo.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Boqi-Hu on 2017/5/18.
 */
@Repository
public interface AdminDao {

    /**
     * 管理员登录操作
     * @param userName 用户名
     * @param password 密码
     * @return 管理员实例
     */
    Admin adminLogin(@Param(value = "username")String userName, @Param(value = "password")String password);

}

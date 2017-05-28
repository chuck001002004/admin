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

    /**
     * 添加登录记录
     * @param adminid 管理员id
     * @param login_ip 登录ip
     */
    void addLog(@Param(value = "adminid") int adminid, @Param(value = "login_ip") String login_ip);

    /**
     * 更改密码前确认身份
     * @param id 管理员id
     * @param password 原有密码
     * @return
     */
    int checkBeforeUpdate(@Param(value = "id") String id, @Param(value = "password") String password);

    /**
     * 更新管理员信息
     * @param id 管理员id
     * @param username 管理员姓名
     * @param password 新密码
     */
    void updateAdminInfo(@Param(value = "id") String id, @Param(value = "name") String username,
                         @Param(value = "password") String password);

}

package admin.service;

import admin.dao.AdminDao;
import admin.vo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Boqi-Hu on 2017/5/18.
 */
@Service
public class AdminService {

    @Autowired
    AdminDao adminDao;

    /**
     * 管理员登录操作
     * @param userName 用户名
     * @param password 密码
     * @return 管理员实例
     */
    public Admin adminLogin(String userName, String password){
        return adminDao.adminLogin(userName, password);
    }

}

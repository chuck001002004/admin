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
     * ����Ա��¼����
     * @param userName �û���
     * @param password ����
     * @return ����Աʵ��
     */
    public Admin adminLogin(String userName, String password){
        return adminDao.adminLogin(userName, password);
    }

}

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

    /**
     * ��ӵ�¼��¼
     * @param adminid ����Աid
     * @param login_ip ��¼ip
     */
    public void addLog(int adminid, String login_ip){
        adminDao.addLog(adminid, login_ip);
    }

    /**
     * ��������ǰȷ�����
     * @param id ����Աid
     * @param password ԭ������
     * @return
     */
    public int checkBeforeUpdate(String id, String password){
        return adminDao.checkBeforeUpdate(id, password);
    }

    /**
     * ���¹���Ա��Ϣ
     * @param id ����Աid
     * @param username ����Ա����
     * @param password ������
     */
    public void updateAdminInfo(String id, String username, String password){
        adminDao.updateAdminInfo(id, username, password);
    }

}

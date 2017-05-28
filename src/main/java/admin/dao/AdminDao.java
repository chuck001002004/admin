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
     * ����Ա��¼����
     * @param userName �û���
     * @param password ����
     * @return ����Աʵ��
     */
    Admin adminLogin(@Param(value = "username")String userName, @Param(value = "password")String password);

    /**
     * ��ӵ�¼��¼
     * @param adminid ����Աid
     * @param login_ip ��¼ip
     */
    void addLog(@Param(value = "adminid") int adminid, @Param(value = "login_ip") String login_ip);

    /**
     * ��������ǰȷ�����
     * @param id ����Աid
     * @param password ԭ������
     * @return
     */
    int checkBeforeUpdate(@Param(value = "id") String id, @Param(value = "password") String password);

    /**
     * ���¹���Ա��Ϣ
     * @param id ����Աid
     * @param username ����Ա����
     * @param password ������
     */
    void updateAdminInfo(@Param(value = "id") String id, @Param(value = "name") String username,
                         @Param(value = "password") String password);

}

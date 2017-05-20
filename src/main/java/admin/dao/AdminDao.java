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

}

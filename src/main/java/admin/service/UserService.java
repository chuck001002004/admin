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
     * ��ȡ�����������û�
     * @param userName �û���
     * @param phone �Ļ�
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��¼��ʼ����
     * @param page_size ����¼����
     * @return �����������û�
     */
    public List<User> getAllUser(String userName, String phone, int week, double start_time,
                                 double end_time, int start, int page_size){
        return userDao.getAllUser(userName, phone, week, start_time, end_time, start, page_size);
    }

}

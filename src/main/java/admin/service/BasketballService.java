package admin.service;

import admin.dao.BasketballDao;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Service
public class BasketballService {

    @Autowired
    BasketballDao basketballDao;

    /**
     * ��ȡ��������ɵ����򶩵���¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return ��������ɵ����򶩵�
     */
    public List<Order> getAllCompleteOrder(String userName, String phone, String date, double start_time,
                                      double end_time, int start, int page_size){
        return basketballDao.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

}

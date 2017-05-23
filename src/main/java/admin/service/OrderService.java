package admin.service;

import admin.dao.OrderDao;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/20.
 */
@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    /**
     * ��ȡ���ж�����¼
     * @param start ��ʼ����
     * @param page_size ������
     * @return ���еĶ���
     */
    public List<Order> getAllOrder(int start, int page_size){
        return orderDao.getAllOrder(start, page_size);
    }

    /**
     * ��ȡ΢��ԤԼ�����ж���
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllOrderByWechat(String userName, String phone, String date,
                                           double start_time, double end_time, int start, int page_size){
        return orderDao.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ��΢��ԤԼ�����ж���
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllOrderUnwechat(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return orderDao.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ��������ɶ�����¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return ��������ɵĶ���
     */
    public List<Order> getAllCompleteOrder(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return orderDao.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ���������΢��ԤԼ������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllCompleteOrderByWechat(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return orderDao.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ��������ɷ�΢��ԤԼ������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllCompleteOrderUnwechat(String userName, String phone, String date, double start_time,
                                                   double end_time, int start, int page_size){
        return orderDao.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ��ɶ�����¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return ����δ��ɵĶ���
     */
    public List<Order> getAllIncompleteOrder(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return orderDao.getAllInCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ���΢��ԤԼ������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllIncompleteOrderByWechat(String userName, String phone, String date, double start_time,
                                             double end_time, int start, int page_size){
        return orderDao.getAllInCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ��ɷ�΢��ԤԼ������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllIncompleteOrderUnwechat(String userName, String phone, String date, double start_time,
                                             double end_time, int start, int page_size){
        return orderDao.getAllInCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ֧��������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllUnpayOrder(String userName, String phone, String date, double start_time,
                                             double end_time, int start, int page_size){
        return orderDao.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ֧��΢��֧��������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllUnpayOrderByWechat(String userName, String phone, String date, double start_time,
                                        double end_time, int start, int page_size){
        return orderDao.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ֧����΢��֧��������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllUnpayOrderUnwechat(String userName, String phone, String date, double start_time,
                                                double end_time, int start, int page_size){
        return orderDao.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

}

package admin.service;

import admin.dao.PingpangDao;
import admin.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Service
public class PingpangService {

    @Autowired
    PingpangDao pingpangDao;

    /**
     * ��ȡ����΢��ԤԼ��ƹ���򶩵���¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    public List<Order> getAllOrderByWechat(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return pingpangDao.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����΢��ԤԼ��ƹ���򶩵���¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllOrderByWechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return pingpangDao.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * ��ȡ���з�΢��ԤԼ��ƹ���򶩵���¼
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
        return pingpangDao.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ���з�΢��ԤԼ��ƹ���򶩵���¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return pingpangDao.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//    public List<Order> getAllCompleteOrder(String userName, String phone, String date, double start_time,
//                                           double end_time, int start, int page_size){
//        return pingpangDao.getAllCompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
//    }

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
        return pingpangDao.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ���������΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllCompleteOrderByWechatCount(String userName, String phone, String date, double start_time,
                                                   double end_time){
        return pingpangDao.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return pingpangDao.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ��������ɷ�΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllCompleteOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                                   double end_time){
        return pingpangDao.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//    public List<Order> getAllIncompleteOrder(String userName, String phone, String date, double start_time,
//                                             double end_time, int start, int page_size){
//        return pingpangDao.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
//    }

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
        return pingpangDao.getAllInCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ���΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllIncompleteOrderByWechatCount(String userName, String phone, String date, double start_time,
                                                     double end_time){
        return pingpangDao.getAllInCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return pingpangDao.getAllInCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ��ɷ�΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllIncompleteOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                                     double end_time){
        return pingpangDao.getAllInCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
//    public List<Order> getAllUnpayOrder(String userName, String phone, String date, double start_time,
//                                        double end_time, int start, int page_size){
//        return pingpangDao.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, page_size);
//    }

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
        return pingpangDao.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ֧��΢��֧��������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllUnpayOrderByWechatCount(String userName, String phone, String date, double start_time,
                                                double end_time){
        return pingpangDao.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return pingpangDao.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����δ֧����΢��֧��������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllUnpayOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                                double end_time){
        return pingpangDao.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * ��Ӷ���
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     */
    public void addOrder(String userName, String phone, String date, double start_time,
                         double end_time){
        System.out.println(userName + "  " + phone + "  " + date + "  " + start_time + "  "
                + end_time);
        pingpangDao.addOrder(userName, phone, date, start_time, end_time);
    }

}

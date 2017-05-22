package admin.service;

import admin.dao.BasketballDao;
import admin.vo.Order;
import admin.vo.User;
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
        return basketballDao.getAllIncompleteOrder(userName, phone, date, start_time, end_time, start, page_size);
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
    public List<Order> getAllUnpayOrder(String userName, String phone, String date, double start_time,
                                        double end_time, int start, int page_size){
        return basketballDao.getAllUnpayOrder(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��Ӷ���
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param site_type ��������
     * @param site_no ���غ�
     */
    public void addOrder(String userName, String phone, String date, double start_time,
                         double end_time, String site_type, String site_no){
        basketballDao.addOrder(userName, phone, date, start_time, end_time, site_type, site_no);
    }

    /**
     * ʵʱ�鿴����ʣ�����
     * @param date ����
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ��ռ�õĳ��غ�
     */
    public String getUnbookedSite(String date, int week, double start_time, double end_time){
        String res = "";
        //��ѯ����ͨ�û�ԤԼ�ĳ���
        List<String> list1 = basketballDao.getUnbookedSite(date, start_time, end_time);
        for(String s : list1){
            res += s + ",";
        }
        //��ѯ����פ�û�ԤԼ�ĳ���
        list1 = basketballDao.getUnbookedSiteByLong(week, start_time, end_time);
        for(String s : list1){
            res += s + ",";
        }
        res = res.lastIndexOf(',') == -1 ? res : res.substring(0, res.lastIndexOf(','));
        return res;
    }

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
        return basketballDao.getAllUser(userName, phone, week, start_time, end_time, start, page_size);
    }

    /**
     * ���ӳ�פ�û�
     * @param userName �û���
     * @param phone ��ϵ��ʽ
     * @param emergencycall ������ϵ��ʽ
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param address ��ϵ��ַ
     * @param money ���
     * @param site_no ���غ�
     * @param remark ��ע
     */
    public void addUser(String userName, String phone, String emergencycall, int week,
                        double start_time, double end_time, String address, String money,
                        String site_no, String remark){
        basketballDao.addUser(userName, phone, emergencycall, week, start_time, end_time,
                address, money, site_no, site_no.length() == 1 ? "0" : "1", remark);
    }

}

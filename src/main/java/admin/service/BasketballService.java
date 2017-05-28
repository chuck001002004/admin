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
     * ��ȡ����΢��ԤԼ�����򶩵���¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return ���е����򶩵�
     */
    public List<Order> getAllOrderByWechat(String userName, String phone, String date, double start_time,
                                   double end_time, int start, int page_size){
        return basketballDao.getAllOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ����΢��ԤԼ�����򶩵���¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ���е����򶩵�
     */
    public int getAllOrderByWechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return basketballDao.getAllOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * ��ȡ���з�΢��ԤԼ�����򶩵���¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return ���е����򶩵�
     */
    public List<Order> getAllOrderUnwechat(String userName, String phone, String date, double start_time,
                                           double end_time, int start, int page_size){
        return basketballDao.getAllOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ���з�΢��ԤԼ�����򶩵���¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ���е����򶩵�
     */
    public int getAllOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                           double end_time){
        return basketballDao.getAllOrderUnwechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * ��ȡ��������ɵ�����΢��ԤԼ������¼
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
        return basketballDao.getAllCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ��������ɵ�����΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllCompleteOrderByWechatCount(String userName, String phone, String date, double start_time,
                                                   double end_time){
        return basketballDao.getAllCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
    }

    /**
     * ��ȡ��������ɵ������΢��ԤԼ������¼
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
        return basketballDao.getAllCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
    }

    /**
     * ��ȡ��������ɵ������΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllCompleteOrderUnwechatCount(String userName, String phone, String date, double start_time,
                                                   double end_time){
        return basketballDao.getAllCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
        return basketballDao.getAllInCompleteOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return basketballDao.getAllInCompleteOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return basketballDao.getAllInCompleteOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return basketballDao.getAllInCompleteOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
        return basketballDao.getAllUnpayOrderByWechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return basketballDao.getAllUnpayOrderByWechatCount(userName, phone, date, start_time, end_time);
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
        return basketballDao.getAllUnpayOrderUnwechat(userName, phone, date, start_time, end_time, start, page_size);
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
        return basketballDao.getAllUnpayOrderUnwechatCount(userName, phone, date, start_time, end_time);
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
     * ʵʱ�鿴����ʣ�����(��Գ����û�ԤԼ����)
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ͬʱ�α����������û�ռ�õĳ��غ�
     */
    public String getUnbookedSiteByLong(int week, double start_time, double end_time){
        List<String> list = basketballDao.getUnbookedSiteByLong(week, start_time, end_time);
        String res = "";
        for(String s : list){
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
     * ��ȡ�����������û���
     * @param userName �û���
     * @param phone �Ļ�
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllUserCount(String userName, String phone, int week, double start_time,
                                 double end_time){
        return basketballDao.getAllUserCount(userName, phone, week, start_time, end_time);
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

    /**
     * ����id�����û�
     * @param id �û�id
     * @return ��Ӧ�û�
     */
    public User getUserById(int id){
        return basketballDao.getUserById(id);
    }

    /**
     * ɾ���û�
     * @param id �û�id
     */
    public void deleteUserById(int id){
        basketballDao.deleteUserById(id);
    }

    /**
     * ɾ������
     * @param id ����id
     * @return
     */
    public void deleteOrder(int id){
        basketballDao.deleteOrder(id);
    }

    /**
     * δ��ɶ���ȷ�����
     * @param id ����id
     */
    public void completeOrder(int id){
        basketballDao.completeOrder(id);
    }

    /**
     * δ֧������ȷ��֧��
     * @param id ����id
     */
    public void payOrder(int id){
        basketballDao.payOrder(id);
    }

    /**
     * ���³�פ�û�
     * @param id �û�id
     * @param userName �û���
     * @param phone �绰
     * @param emergencycall ������ϵ��ʽ
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param address ��ϵ��ַ
     * @param money ���
     * @param stadium ���غ�
     * @param remark ��ע
     */
    public void updateUser(int id, String userName, String phone, String emergencycall,
                           int week, double start_time, double end_time, String address,
                           String money, String stadium, String remark){
        basketballDao.updateUser(id, userName, phone, emergencycall, week, start_time,
                end_time, address, money, stadium, stadium.length() == 1 ? "0" : "1", remark);
    }

}

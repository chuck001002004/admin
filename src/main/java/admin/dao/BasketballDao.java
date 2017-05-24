package admin.dao;

import admin.vo.Order;
import admin.vo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Repository
public interface BasketballDao {

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
    List<Order> getAllOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                            @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                            @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                            @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����΢��ԤԼ�����򶩵���¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ���е����򶩵�
     */
    public int getAllOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                                        @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                        @Param(value = "end_time") double end_time);

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
    List<Order> getAllOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

    /**
     * ��ȡ���з�΢��ԤԼ�����򶩵���¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ���е����򶩵�
     */
    public int getAllOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
                                        @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                        @Param(value = "end_time") double end_time);

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
//    List<Order> getAllCompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
//                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
//                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

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
    List<Order> getAllCompleteOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ��������ɵ�����΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    public int getAllCompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    List<Order> getAllCompleteOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                            @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                            @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ��������ɵ������΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllCompleteOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
//    List<Order> getAllIncompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
//                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
//                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

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
    List<Order> getAllInCompleteOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                              @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                              @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����δ���΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllInCompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                           @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    List<Order> getAllInCompleteOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                              @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                              @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����δ��ɷ�΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllInCompleteOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                  @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
//    List<Order> getAllUnpayOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
//                                 @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
//                                 @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����δ֧��΢��ԤԼ������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    List<Order> getAllUnpayOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                         @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                         @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����δ֧��΢��֧��������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllUnpayOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                             @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

    /**
     * ��ȡ����δ֧����΢��ԤԼ������¼
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return
     */
    List<Order> getAllUnpayOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                         @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                         @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����δ֧����΢��֧��������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllUnpayOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                      @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    void addOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                  @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                  @Param(value = "end_time") double end_time, @Param(value = "site_type")String site_type,
                  @Param(value = "site_no") String site_no);

    /**
     * ʵʱ�鿴����ʣ���������ͨ�û�Ԥ����
     * @param date ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ��ռ�õĳ��غ�
     */
    List<String> getUnbookedSite(@Param("date") String date, @Param("start_time") double start_time,
                                   @Param("end_time") double end_time);

    /**
     * ʵʱ�鿴����ʣ���������פ�û�Ԥ����
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ��ռ�õĳ��غ�
     */
    List<String> getUnbookedSiteByLong(@Param("week") int week, @Param("start_time") double start_time,
                                       @Param("end_time") double end_time);

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
    List<User> getAllUser(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                          @Param(value = "week")int week, @Param(value = "start_time")double start_time,
                          @Param(value = "end_time") double end_time, @Param(value = "start") int start,
                          @Param(value = "page_size") int page_size);

    /**
     * ��ȡ�����������û���
     * @param userName �û���
     * @param phone �Ļ�
     * @param week ���ڼ�
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllUserCount(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                               @Param(value = "week")int week, @Param(value = "start_time")double start_time,
                               @Param(value = "end_time") double end_time);

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
     * @param site_type ��������
     * @param remark ��ע
     */
    void addUser(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                 @Param(value = "emergencycall")String emergencycall, @Param(value = "week") int week,
                 @Param(value = "start_time") double start_time, @Param(value = "end_time")double end_time,
                 @Param(value = "address") String address, @Param(value = "money")String money,
                 @Param(value = "site_no")String site_no, @Param(value = "site_type")String site_type,
                 @Param(value = "remark")String remark);

    /**
     * ����id�����û�
     * @param id �û�id
     * @return ��Ӧ�û�
     */
    User getUserById(@Param(value = "id") int id);

    /**
     * ɾ���û�
     * @param id �û�id
     */
    void deleteUserById(@Param(value = "id") int id);

    /**
     * ɾ������
     * @param id ����id
     * @return
     */
    void deleteOrder(@Param(value = "id") int id);

    /**
     * δ��ɶ���ȷ�����
     * @param id ����id
     */
    void completeOrder(@Param(value = "id") int id);

    /**
     * δ֧������ȷ��֧��
     * @param id ����id
     */
    void payOrder(@Param(value = "id") int id);

}

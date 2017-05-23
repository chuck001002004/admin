package admin.dao;

import admin.vo.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/21.
 */
@Repository
public interface PingpangDao {

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
    List<Order> getAllOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����΢��ԤԼ��ƹ���򶩵���¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone")String phone,
                                        @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                        @Param(value = "end_time") double end_time);

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
    List<Order> getAllOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

    /**
     * ��ȡ���з�΢��ԤԼ��ƹ���򶩵���¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
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
     * ��ȡ���������΢��ԤԼ������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllCompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
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
     * ��ȡ��������ɷ�΢��ԤԼ������¼��
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
//                                      @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
//                                      @Param(value = "start") int start, @Param(value = "page_size") int page_size);

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
    public int getAllInCompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
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
    public int getAllInCompleteOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
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
     */
    void addOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                  @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                  @Param(value = "end_time") double end_time);

    /**
     * ɾ������
     * @param id ����id
     * @return
     */
    void deleteOrder(int id);

}

package admin.dao;

import admin.vo.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Boqi-Hu on 2017/5/20.
 */
@Repository
public interface OrderDao {

    /**
     * ��ȡ���ж�����¼
     * @param start ��ʼ��¼��
     * @param page_size ��¼����
     * @return ���еĶ���
     */
    List<Order> getAllOrder(@Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ���ж�����¼��
     * @return ���еĶ���
     */
    int getAllOrderCount();

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
    List<Order> getAllOrderByWechat(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

    /**
     * ��ȡ΢��ԤԼ�����ж�����
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone,
                                        @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                        @Param(value = "end_time") double end_time);

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
    List<Order> getAllOrderUnwechat(@Param(value = "alias") String userName, @Param(value = "phone")String phone,
                                    @Param(value = "date") String date, @Param(value = "start_time") double start_time,
                                    @Param(value = "end_time") double end_time, @Param(value = "start")int start,
                                    @Param(value = "page_size") int page_size);

    /**
     * ��ȡ��΢��ԤԼ�����ж�����
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone,
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
    List<Order> getAllCompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ��������ɶ�����¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ��������ɵĶ���
     */
    int getAllCompleteOrderCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    List<Order> getAllInCompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                    @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                    @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����δ��ɶ�����¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ����δ��ɵĶ���
     */
    int getAllIncompleteOrderCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                          @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    int getAllIncompleteOrderByWechatCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
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
    int getAllIncompleteOrderUnwechatCount(@Param(value = "alias") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                                  @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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
    List<Order> getAllUnpayOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                      @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                      @Param(value = "start") int start, @Param(value = "page_size") int page_size);

    /**
     * ��ȡ����δ֧��������¼��
     * @param userName �û���
     * @param phone �绰
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return
     */
    int getAllUnpayOrderCount(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                     @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time);

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

}

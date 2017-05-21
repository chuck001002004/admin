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
    List<Order> getAllIncompleteOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                      @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                      @Param(value = "start") int start, @Param(value = "page_size") int page_size);

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
    List<Order> getAllUnpayOrder(@Param(value = "name") String userName, @Param(value = "phone") String phone, @Param(value = "date")String date,
                                 @Param(value = "start_time") double start_time, @Param(value = "end_time") double end_time,
                                 @Param(value = "start") int start, @Param(value = "page_size") int page_size);

}

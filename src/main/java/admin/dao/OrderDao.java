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
     * ��������ɸѡ������¼
     * @param userid �û�id
     * @param date ԤԼ����
     * @param start_time ��ʼʱ��
     * @param end_time ����ʱ��
     * @return ���з��������Ķ���
     */
    List<Order> getAllOrder(@Param(value = "userid") String userid, @Param(value = "date") String date,
                            @Param(value = "start_time") String start_time, @Param(value = "end_time")String end_time);

}

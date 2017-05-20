package admin.vo;

import java.util.Date;

/**
 * Created by Boqi-Hu on 2017/5/20.
 */
public class Order {

    int id; //����id
    Date date;  //ԤԼ����
    String userid;  //�û�id
    String site_no; //���غ�
    double start_time;  //��ʼʱ��
    double end_time;    //����ʱ��
    Date order_date;    //��������ʱ��
    String ispay;   //�Ƿ�֧��

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSite_no() {
        return site_no;
    }

    public void setSite_no(String site_no) {
        this.site_no = site_no;
    }

    public double getStart_time() {
        return start_time;
    }

    public void setStart_time(double start_time) {
        this.start_time = start_time;
    }

    public double getEnd_time() {
        return end_time;
    }

    public void setEnd_time(double end_time) {
        this.end_time = end_time;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getIspay() {
        return ispay;
    }

    public void setIspay(String ispay) {
        this.ispay = ispay;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", userid='" + userid + '\'' +
                ", site_no='" + site_no + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", order_date=" + order_date +
                ", ispay='" + ispay + '\'' +
                '}';
    }

}
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
    String start_time;  //��ʼʱ��
    String end_time;    //����ʱ��
    Date order_date;    //��������ʱ��
    String ispay;   //�Ƿ�֧��
    String name;    //�û�����
    String type;    //��������
    String iscomplete;  //�Ƿ������

    public String getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(String iscomplete) {
        this.iscomplete = iscomplete;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(double start_time) {
        int start_hour = (int) Math.floor(start_time);
        int start_minute = (int) ((start_time - start_hour) * 60);
        this.start_time = start_hour + ":" + (start_minute == 0 ? "00" : start_minute);
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(double end_time) {
        int end_hour = (int) Math.floor(end_time);
        int end_minute = (int) ((end_time - end_hour) * 60);
        this.end_time = end_hour + ":" + (end_minute == 0 ? "00" : end_minute);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", userid='" + userid + '\'' +
                ", site_no='" + site_no + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", order_date=" + order_date +
                ", ispay='" + ispay + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", iscomplete='" + iscomplete + '\'' +
                '}';
    }
}

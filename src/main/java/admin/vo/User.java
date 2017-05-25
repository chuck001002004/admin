package admin.vo;

/**
 * Created by Boqi-Hu on 2017/5/22.
 * ��פ�û�ʵ����
 */
public class User {

    int id; //�û����
    String name;    //�û���
    String phone;   //�绰
    String emergencycall;   //������ϵ��ʽ
    int week;   //���ڼ�
    String start_time;  //��ʼʱ��
    String end_time;    //����ʱ��
    String site_no; //���غ�
    String type;    //��������
    String address; //��ַ
    String remark;  //��ע
    int money;  //���
    double st;  //��ʼʱ��double����
    double et;  //����ʱ��double����

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getSt() {
        return st;
    }

    public void setSt(double st) {
        this.st = st;
    }

    public double getEt() {
        return et;
    }

    public void setEt(double et) {
        this.et = et;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencycall() {

        return emergencycall;
    }

    public void setEmergencycall(String emergencycall) {
        this.emergencycall = emergencycall;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(double start_time) {
        this.setSt(start_time);
        int start_hour = (int) Math.floor(start_time);
        int start_minute = (int) ((start_time - start_hour) * 60);
        this.start_time = start_hour + ":" + (start_minute == 0 ? "00" : start_minute);
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(double end_time) {
        this.setEt(end_time);
        int end_hour = (int) Math.floor(end_time);
        int end_minute = (int) ((end_time - end_hour) * 60);
        this.end_time = end_hour + ":" + (end_minute == 0 ? "00" : end_minute);
    }

    public String getSite_no() {
        return site_no;
    }

    public void setSite_no(String site_no) {
        this.site_no = site_no;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", emergencycall='" + emergencycall + '\'' +
                ", week=" + week +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", site_no='" + site_no + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                ", money=" + money +
                ", st=" + st +
                ", et=" + et +
                '}';
    }

}

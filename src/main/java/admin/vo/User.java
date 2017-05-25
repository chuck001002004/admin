package admin.vo;

/**
 * Created by Boqi-Hu on 2017/5/22.
 * 常驻用户实体类
 */
public class User {

    int id; //用户编号
    String name;    //用户名
    String phone;   //电话
    String emergencycall;   //紧急联系方式
    int week;   //星期几
    String start_time;  //开始时间
    String end_time;    //结束时间
    String site_no; //场地号
    String type;    //场地类型
    String address; //地址
    String remark;  //备注
    int money;  //金额
    double st;  //开始时间double类型
    double et;  //结束时间double类型

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

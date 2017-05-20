package admin.vo;

/**
 * Created by Boqi-Hu on 2017/5/18.
 * 管理员实体类，对应tb_admin
 */
public class Admin {

    int id; //管理员id
    String realname;    //管理员姓名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return realname;
    }

    public void setName(String name) {
        this.realname = name;
    }
}

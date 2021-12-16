import java.util.List;

/**
 * @author: wbb
 * @date 2021/10/25 2:43 下午
 */
public class MyEmployee {
    private Integer my_id;
    private Integer my_age;
    private String my_gender;
    private String my_firstName;
    private String my_lastName;
    private List<Member> my_memberList;

    public Integer getMy_id() {
        return my_id;
    }

    public void setMy_id(Integer my_id) {
        this.my_id = my_id;
    }

    public Integer getMy_age() {
        return my_age;
    }

    public void setMy_age(Integer my_age) {
        this.my_age = my_age;
    }

    public String getMy_gender() {
        return my_gender;
    }

    public void setMy_gender(String my_gender) {
        this.my_gender = my_gender;
    }

    public String getMy_firstName() {
        return my_firstName;
    }

    public void setMy_firstName(String my_firstName) {
        this.my_firstName = my_firstName;
    }

    public String getMy_lastName() {
        return my_lastName;
    }

    public void setMy_lastName(String my_lastName) {
        this.my_lastName = my_lastName;
    }

    public List<Member> getMy_memberList() {
        return my_memberList;
    }

    public void setMy_memberList(List<Member> my_memberList) {
        this.my_memberList = my_memberList;
    }

    public MyEmployee(Integer my_id, Integer my_age, String my_gender, String my_firstName, String my_lastName, List<Member> my_memberList) {
        this.my_id = my_id;
        this.my_age = my_age;
        this.my_gender = my_gender;
        this.my_firstName = my_firstName;
        this.my_lastName = my_lastName;
        this.my_memberList = my_memberList;
    }
}

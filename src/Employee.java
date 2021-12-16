import java.util.Collections;
import java.util.List;

/**
 * @author: wbb
 * @date 2021/9/7 3:17 下午
 */
public class Employee {
    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;
    private List<Member> memberList;

    public Employee(Integer id, Integer age, String gender, String firstName, String lastName, List<Member> memberList) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberList = memberList;
    }
    public Employee() {
        this.id = 0;
        this.age = 0;
        this.gender = null;
        this.firstName = null;
        this.lastName = null;
        this.memberList = Collections.EMPTY_LIST;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }





    @Override
    public String toString() {
        return this.id.toString() + " - " + this.age.toString()+"\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

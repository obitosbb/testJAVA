/**
 * @author: wbb
 * @date 2021/8/16 11:09 上午
 */
public class peo {

    public static final Integer i = 1;
    String s;

    public Integer getI() {
        return i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public peo(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "peo{" +
                "s='" + s + '\'' +
                '}';
    }
}

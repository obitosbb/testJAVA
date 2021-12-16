/**
 * @author: wbb
 * @date 2021/8/16 4:16 下午
 */
public class Member extends DateUtil{

    Integer i;

    String s;

    Boolean b;

    Long l;

    Double d;

    Float f;

    Character c;

    public Member(Integer i, String s, Boolean b, Long l, Double d, Float f, Character c) {
        this.i = i;
        this.s = s;
        this.b = b;
        this.l = l;
        this.d = d;
        this.f = f;
        this.c = c;
    }

    public Member() {
//        this.i = 1;
//        this.s = "s";
//        this.b = true;
//        this.l = 1L;
//        this.d = 5.5;
//        this.f = 6.5f;
//        this.c = 'c';
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Boolean getB() {
        return b;
    }

    public void setB(Boolean b) {
        this.b = b;
    }

    public Long getL() {
        return l;
    }

    public void setL(Long l) {
        this.l = l;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Float getF() {
        return f;
    }

    public void setF(Float f) {
        this.f = f;
    }

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        Member boardVo=(Member) obj;
        return i.equals(Member.this.i) && s.equals(Member.this.s);
    }
    @Override
    public int hashCode() {
        String str=String.valueOf(i)+String.valueOf(s);
        return str.hashCode();
    }

    @Override
    public String toString() {
        return "Member{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", b=" + b +
                ", l=" + l +
                ", d=" + d +
                ", f=" + f +
                ", c=" + c +
                '}';
    }
}

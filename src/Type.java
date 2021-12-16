/**
 * @author: wbb
 * @date 2021/8/16 10:13 上午
 */
public enum Type {
    China(null, "中国"), Chongqing(China, "重庆"), Yuzhongqu(Chongqing, "渝中区");
    private Type parent;
    private String area;

    private Type(Type parent, String area) {
        this.parent = parent;
        this.area = area;
    }

    public Type getParent() {
        return parent;
    }

    public void setParent(Type parent) {
        this.parent = parent;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }



}

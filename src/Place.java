import javax.swing.*;

/**
 * @author: wbb
 * @date 2021/8/16 10:33 上午
 */
public enum Place {
    XUIYING("XUIYING","海南","海口","秀英"),
    MEILAN("MEILAN","海南","海口","美兰"),
    HAIKOU("HAIKOU","海南","海口",null),
    HAINAN("HAINAN","海南",null,null),

    NANSHAN("NANSHAN","广东","深圳","南山"),
    SHENZHEN("SHENZHEN","广东","深圳",null),
    GUANGDONG("GUANGDONG","广东",null,null);



    private String province;
    private String city;
    private String area;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProvince() {
        return province;
    }

    public void setRovince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    Place(String code, String province, String city, String area) {
        this.code = code;
        this.province = province;
        this.city = city;
        this.area = area;
    }

    public static String getCityAndAreaByCode(String code){
        Place []places = values();

        for(Place place : places){
            if(place.getArea() != null & place.code.equals(code)){
                return place.getProvince()+"_"+place.getCity()+"_"+place.getArea();
            }
            if(place.getCity() != null & place.code.equals(code)){
                return place.getProvince()+"_"+place.getCity();
            }
            if(place.getProvince() != null & place.code.equals(code)){
                return place.getProvince();
            }
        }

        return null;
    }
}

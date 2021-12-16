/**
 * @author: wbb
 * @date 2021/8/16 10:10 上午
 */
public enum TestEnum {
    KA("KA",null,"ka"),diangong("diangong",null,"电工");

    private String code;
    private TestEnum firstLevel;
    private String secondLevel;

    TestEnum(String code, TestEnum firstLevel, String secondLevel) {
        this.code = code;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TestEnum getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(TestEnum firstLevel) {
        this.firstLevel = firstLevel;
    }

    public String getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(String secondLevel) {
        this.secondLevel = secondLevel;
    }

    public static String getsecond(TestEnum testEnum){
        TestEnum frist = testEnum.getFirstLevel();
        if(frist == null){
            return testEnum.getSecondLevel();
        }
        else{
            return getsecond(frist)+testEnum.getSecondLevel();
        }
    }
}

/**
 * @author: wbb
 * @date 2021/11/13 11:42 上午
 */
public class executeCases {
    private static final long serialVersionUID = 614613882798398187L;
    private Long id;
    private boolean success;
    private String failReason;
    private Long startTime;
    private Long endTime;
    private Long executeTime;

    public executeCases() {
    }

    public Long getId() {
        return this.id;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getFailReason() {
        return this.failReason;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public Long getExecuteTime() {
        return this.executeTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }
}

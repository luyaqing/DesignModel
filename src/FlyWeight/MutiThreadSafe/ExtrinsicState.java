package FlyWeight.MutiThreadSafe;

/**
 * @Description 外部状态类
 * @Author BG362793
 * @Date 2020-08-25 17:08
 * @Version 1.0
 */
public class ExtrinsicState {

    // 考试科目
    private String subject;

    // 考试地点
    private String location;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExtrinsicState) {
            ExtrinsicState state = (ExtrinsicState)obj;
            return state.getLocation().equalsIgnoreCase(location) &&
                    state.getSubject().equalsIgnoreCase(subject);
        }
        return false;
    }

    @Override
    public int hashCode() {

        return subject.hashCode() + location.hashCode();
    }
}

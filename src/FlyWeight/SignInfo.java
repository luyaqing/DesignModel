package FlyWeight;

import FlyWeight.MutiThreadSafe.ExtrinsicState;

/**
 * @Description 报考信息
 * @Author BG362793
 * @Date 2020-08-25 15:57
 * @Version 1.0
 */
public class SignInfo {

    private String id;

    private String location;

    private String subject;

    private String postAddress;

    private ExtrinsicState extrinsicState;

    public ExtrinsicState getExtrinsicState() {
        return extrinsicState;
    }

    public void setExtrinsicState(ExtrinsicState extrinsicState) {
        this.extrinsicState = extrinsicState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}

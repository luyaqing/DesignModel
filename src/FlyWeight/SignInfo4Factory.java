package FlyWeight;

/**
 * @Description 带对象池的报考信息
 * @Author BG362793
 * @Date 2020-08-25 15:59
 * @Version 1.0
 */
public class SignInfo4Factory extends SignInfo{

    // 这个外部状态也可以放到父类中定义，并加上final的修饰，防止无意的修改了一下。
    private String key;

    public SignInfo4Factory(String _key) {
        this.key = _key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

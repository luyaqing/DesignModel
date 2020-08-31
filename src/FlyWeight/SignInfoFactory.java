package FlyWeight;



import java.util.HashMap;

/**
 * @Description 带对象池的工厂类
 * @Author BG362793
 * @Date 2020-08-25 16:01
 * @Version 1.0
 */
public class SignInfoFactory {

    // 池对象
    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

    public static SignInfo getSignInfo(String key) {

        SignInfo signInfo =  null;

        // 池中没有对象，则建立 并放入池中
        if (!pool.containsKey(key)) {
            System.out.println(key + "----建立对象， 并放入池中");
            signInfo = new SignInfo4Factory(key);
            pool.put(key, signInfo);
        } else {
            signInfo = pool.get(key);
            System.out.println(key + "---直接从池中获得");
        }

        return signInfo;
    }
}

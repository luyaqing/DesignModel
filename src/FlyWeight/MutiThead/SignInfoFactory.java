package FlyWeight.MutiThead;



import FlyWeight.SignInfo;

import java.util.HashMap;

/**
 * @Description 带对象池的工厂类
 * @Author BG362793
 * @Date 2020-08-25 16:01
 * @Version 1.0
 */
public class SignInfoFactory {

    // 池对象
    public static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

    public static SignInfo getSignInfo(String key) {

        SignInfo signInfo =  null;

        // 池中没有对象，则建立 并放入池中
        if (!pool.containsKey(key)) {

            signInfo = new SignInfo();
            pool.put(key, signInfo);

        } else {

            signInfo = pool.get(key);
        }

        return signInfo;
    }
}

package FlyWeight.MutiThreadSafe;

import FlyWeight.SignInfo;

import java.util.HashMap;

/**
 * @Description 线程安全的享元工厂
 * @Author BG362793
 * @Date 2020-08-25 17:14
 * @Version 1.0
 */
public class SignInfoFactory {

    // 池容器
    private static HashMap<ExtrinsicState, SignInfo> pool = new HashMap<ExtrinsicState, SignInfo>();

    // 从池中获得对象
    public static SignInfo getSignInfo(ExtrinsicState key) {

        // 设置返回对象
        SignInfo result = null;

        // 池中没有对象，则建立并放入池中
        if (!pool.containsKey(key)) {

            result = new SignInfo();
            pool.put(key, result);

        } else {
            result = pool.get(key);
        }

        return result;
    }
}

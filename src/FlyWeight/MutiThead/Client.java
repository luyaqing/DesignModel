package FlyWeight.MutiThead;

import FlyWeight.SignInfo;

/**
 * @Description 场景类
 * @Author BG362793
 * @Date 2020-08-25 16:06
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        SignInfoFactory.getSignInfo("科目1");
        SignInfoFactory.getSignInfo("科目2");
        SignInfoFactory.getSignInfo("科目3");
        SignInfoFactory.getSignInfo("科目4");

        // 取得对象
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
        int a = 0;
        while (true) {
            signInfo.setId("ZhangSan");
            signInfo.setLocation("ZhangSan");
            (new MultiThread(signInfo)).start();

            signInfo.setId("LiSi");
            signInfo.setLocation("LiSi");
            (new MultiThread(signInfo)).start();

            System.out.println(a);
            a++;
        }
    }
}

/**
 *  这个方法执行多次之后，肯定会出现线程安全的问题；
 *  一次不一定会出现，但是一旦出现了，肯定是问题很大
 *
 */

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
        while (true) {
            signInfo.setId("ZhangSan");
            signInfo.setLocation("ZhangSan");
            (new MultiThread(signInfo)).start();

            signInfo.setId("LiSi");
            signInfo.setLocation("LiSi");
            (new MultiThread(signInfo)).start();
        }
    }
}

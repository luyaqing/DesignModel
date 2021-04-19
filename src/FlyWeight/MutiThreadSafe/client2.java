package FlyWeight.MutiThreadSafe;

/**
 * @Description String作为外部状态的测试
 * @Author BG362793
 * @Date 2020-11-26 9:46
 * @Version 1.0
 */
public class client2 {


    public static void main(String[] args) {

        String key1 = "科目1上海";

        String key2 = "科目1上海";

        // 初始化对象池
        FlyWeight.MutiThead.SignInfoFactory.getSignInfo(key1);

        // 计算执行100万次需要的时间
        long startTime = System.currentTimeMillis();

        for (int i=0; i<1000000; i++) {
            FlyWeight.MutiThead.SignInfoFactory.getSignInfo(key2);
        }

        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (tailTime - startTime) + "ms");

    }
}

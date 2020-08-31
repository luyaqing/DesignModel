package FlyWeight.MutiThreadSafe;

/**
 * @Description 场景类
 * @Author BG362793
 * @Date 2020-08-25 17:18
 * @Version 1.0
 */
public class Client {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ExtrinsicState state1 = new ExtrinsicState();
        state1.setSubject("科目1");
        state1.setLocation("上海");
        SignInfoFactory.getSignInfo(state1);

        ExtrinsicState state2 = new ExtrinsicState();
        state2.setSubject("科目1");
        state2.setLocation("上海");

        // 计算执行100万次需要的时间
        long startTime = System.currentTimeMillis();

        for (int i=0; i<1000000; i++) {
            SignInfoFactory.getSignInfo(state2);
        }

        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (tailTime - startTime) + "ms");

    }
}

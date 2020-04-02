package StrategyDesign;

import java.util.Arrays;

/**
 *  场景类
 */
public class Client {

    public static void main(String[] args) {

        // 输入的两个参数是数字
        int a = 100;
        String symbol = "+"; //符号
        int b = 200;
        System.out.println("输入的参数为：" + Arrays.toString(args));
        System.out.println("运行结果为：" + a +symbol + b + "=" + Calculator.ADD.exec(a, b));
    }
}

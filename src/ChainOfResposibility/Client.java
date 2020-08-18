package ChainOfResposibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description 场景类
 * @Author BG362793
 * @Date 2020-08-18 14:34
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<IWomen>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        // 定义三个请求对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        // 设置请示的顺序
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
            father.handleMessage(women);
        }
    }
}

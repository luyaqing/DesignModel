package BuilderDesign.model;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-31 14:45
 * @Version 1.0
 */
public class BenzModel extends CarModel {

    @Override
    protected void start() {

        System.out.println("奔驰车的启动是这样的。。。。。");
    }

    @Override
    protected void stop() {

        System.out.println("奔驰车停车是这样的。。。。。");
    }

    @Override
    protected void alarm() {

        System.out.println("奔驰车喇叭声音。。。。");
    }

    @Override
    protected void engineBoom() {

        System.out.println("奔驰车的引擎声音。。。。。");
    }
}

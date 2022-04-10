package BuilderDesign.model;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-31 14:48
 * @Version 1.0
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {

        System.out.println("宝马车是这样的启动的。。。。");
    }

    @Override
    protected void stop() {

        System.out.println("宝马车是这样停止的");

    }

    @Override
    protected void alarm() {

        System.out.println("宝马车是这样鸣笛的。。。。");
    }

    @Override
    protected void engineBoom() {

        System.out.println("宝马车是这样的引擎。。。。");
    }
}

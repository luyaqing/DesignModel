package TemplateDesign;


/**
 * 抽象宝马类（抽象模板）
 *
 */
public abstract class AbstractHummerModel {

    // 基本方法， 由子类实现的方法，在模板方法中被调用
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    // 模板方法一般都要加上final关键字，不允许被复写
    // 可以有一个或多个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
    final public void run() {

        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    // 钩子方法，默认是会响的
    protected boolean isAlarm() {
        return true;
    }
}

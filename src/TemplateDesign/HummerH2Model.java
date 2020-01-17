package TemplateDesign;

/**
 * 悍马H2模型
 *      要求是：喇叭不要响
 */
public class HummerH2Model extends AbstractHummerModel {

    @Override
    protected void start() {
        System.out.println("悍马H2发动.....");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车.....");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛.....");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2的引擎声音是这样的.....");
    }

    // 重写了钩子方法，默认是不鸣笛的
    @Override
    protected boolean isAlarm() {
        return false;
    }
}

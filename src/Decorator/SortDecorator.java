package Decorator;

/**
 * @Description 排名装饰器
 * @Author BG362793
 * @Date 2020-06-03 10:52
 * @Version 1.0
 */
public class SortDecorator extends Decorator{

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("我的排名是第38名。。。。。");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}

package Decorator;

/**
 * @Description 装饰器对象
 * @Author BG362793
 * @Date 2020-06-03 10:42
 * @Version 1.0
 */
public abstract class Decorator extends SchoolReport{

    // 成绩单对象  这个对象比较重要
    private SchoolReport sr;

    // 构造函数， 传递成绩单过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    // 成绩单还是要被看到的
    public void report() {
        this.sr.report();
    }

    // 看完还是要签名
    public void sign(String name) {
        this.sr.sign(name);
    }
}

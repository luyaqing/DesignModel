package Decorator;

/**
 * @Description 成绩单对象
 * @Author BG362793
 * @Date 2020-06-03 10:41
 * @Version 1.0
 */
public abstract class SchoolReport {

    // 展示成绩单
    abstract void report();

    // 签名
    abstract void sign(String name);
}

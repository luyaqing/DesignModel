package Decorator;

/**
 * @Description 最高分装饰器
 * @Author BG362793
 * @Date 2020-06-03 10:46
 * @Version 1.0
 */
public class HighScoreDecorator extends Decorator {

    // 构造函数
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    // 我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75. 数学是78， 自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }

}

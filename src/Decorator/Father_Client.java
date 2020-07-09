package Decorator;

/**
 * @Description 父亲查看成绩单
 * @Author BG362793
 * @Date 2020-06-03 10:40
 * @Version 1.0
 */
public class Father_Client {

    public static void main(String[] args) {

        SchoolReport sr;

        sr = new ForthGradeSchoolReport();

        sr = new HighScoreDecorator(sr);

        sr = new SortDecorator(sr);

        // 查看成绩单
        sr.report();

        // 看了一下，很开心，就签名了
        sr.sign("胡汉三");
    }

}

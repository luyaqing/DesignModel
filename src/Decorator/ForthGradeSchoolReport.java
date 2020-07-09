package Decorator;

/**
 * @Description 成绩单对象
 * @Author BG362793
 * @Date 2020-06-03 10:56
 * @Version 1.0
 */
public class ForthGradeSchoolReport extends SchoolReport{

    @Override
    void report() {
        // 成绩单的内容是：
        System.out.println("尊敬的XXX家长：");
        System.out.println("............");
        System.out.println("语文 62 数学 65 体育 98 自然 63");
        System.out.println("............");
        System.out.println("        家长签字：       ");
    }

    @Override
    void sign(String name) {
        System.out.println(name);
    }
}

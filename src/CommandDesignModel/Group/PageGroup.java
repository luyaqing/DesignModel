package CommandDesignModel.Group;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-20 10:24
 * @Version 1.0
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到美工组......");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个页面");

    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面..");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划");
    }
}

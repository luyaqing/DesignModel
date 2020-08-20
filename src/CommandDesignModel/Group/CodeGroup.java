package CommandDesignModel.Group;

/**
 * @Description 代码组
 * @Author BG362793
 * @Date 2020-08-20 10:26
 * @Version 1.0
 */
public class CodeGroup extends Group{

    @Override
    public void find() {
        System.out.println("找到代码组....");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项功能....");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能....");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项功能....");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划....");
    }
}

package CommandDesignModel.Commad;

/**
 * @Description 增加需求命令
 * @Author BG362793
 * @Date 2020-08-20 10:37
 * @Version 1.0
 */
public class AddRequirementCommand extends Command{
    @Override
    public void execute() {

        // 找到需求组
        super.requirementGroup.find();

        // 增加一份需求
        super.requirementGroup.add();

        // 给出计划
        super.requirementGroup.plan();
    }
}

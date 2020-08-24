package CommandDesignModel.Commad;

import CommandDesignModel.Group.CodeGroup;
import CommandDesignModel.Group.PageGroup;
import CommandDesignModel.Group.RequirementGroup;


/**
 * @Description 抽象命令类
 * @Author BG362793
 * @Date 2020-08-20 10:18
 * @Version 1.0
 */
public abstract class Command {

    // 这里的就是接受者 receiver对象，即最终的调用对象
    protected final RequirementGroup requirementGroup = new RequirementGroup();

    protected PageGroup pageGroup = new PageGroup();

    protected CodeGroup codeGroup = new CodeGroup();

    // execute的意思：执行、处死，这里取执行的意思
    public abstract void execute();
}

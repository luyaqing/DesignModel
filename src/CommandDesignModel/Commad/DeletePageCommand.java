package CommandDesignModel.Commad;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-20 10:39
 * @Version 1.0
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        // 找到页面组
        super.pageGroup.find();

        super.pageGroup.delete();

        super.pageGroup.plan();
    }
}

package CommandDesignModel.Commad;

/**
 * @Description 页面修改撤销功能
 * @Author BG362793
 * @Date 2020-08-20 13:56
 * @Version 1.0
 */
public class CancelDeletePageCommand extends Command{


    // 撤销删除一个页面的命令
    @Override
    public void execute() {
        super.pageGroup.rollback();
    }
}

package CommandDesignModel.Group;

/**
 * @Description 抽象组
 * @Author BG362793
 * @Date 2020-08-20 10:20
 * @Version 1.0
 */
public abstract class Group {

    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void plan();

    public void rollback() {
        // 根据事务日志进行回滚
    }
}

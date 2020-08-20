package CommandDesignModel;

import CommandDesignModel.Commad.Command;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-20 10:40
 * @Version 1.0
 */
public class Invoker {

    private Command command;

    // 客户发出的命令
    public void setCommand(Command command) {
        this.command = command;
    }

    // 执行客户的命令
    public void action() {
        this.command.execute();
    }
}

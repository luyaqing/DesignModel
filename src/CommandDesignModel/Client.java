package CommandDesignModel;

import CommandDesignModel.Commad.AddRequirementCommand;
import CommandDesignModel.Commad.Command;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-20 10:44
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 定义我们的接头人
        Invoker invoker = new Invoker();

        // 客户增加一项需求
        System.out.println("----------客户要求增加一项需求----------");

        // 客户给我们下命令来
        Command command = new AddRequirementCommand();

        // 接头人接到命令
        invoker.setCommand(command);

        // 接头人执行命令
        invoker.action();

    }
}

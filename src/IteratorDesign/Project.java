package IteratorDesign;

import java.util.ArrayList;

/**
 * @Description 项目信息的实现
 * @Author BG362793
 * @Date 2020-08-26 15:10
 * @Version 1.0
 */
public class Project implements IProject {

    // 定义一个项目列表，所有的项目都放在这里
    private ArrayList<IProject> projectList = new ArrayList<IProject>();

    // 项目名称
    private String name = "";

    // 项目成员数量
    private int num;

    // 项目费用
    private int cost = 0;

    public Project() {

    }

    // 定义一个构造函数， 把所有老板需要看到的信息存储起来
    public Project(String name, int num, int cost) {
        // 赋值到类的成员变量中
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    // 增加项目
    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    // 得到项目的信息
    @Override
    public String getProjectInfo() {

        String info = "";
        info += "项目名称是：" + this.name;
        info += "\t项目人数是： " + this.num;
        info += "\t项目费用： " + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }


}

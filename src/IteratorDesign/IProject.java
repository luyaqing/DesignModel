package IteratorDesign;

/**
 *  项目信息接口
 */
public interface IProject {

    // 增加项目
    void add(String name, int num, int cost);

    String getProjectInfo();

    // 获得一个可以被遍历的对象
    IProjectIterator iterator();
}



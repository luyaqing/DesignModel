package IteratorDesign;

import java.util.ArrayList;

/**
 * @Description 项目迭代器
 * @Author BG362793
 * @Date 2020-08-26 15:20
 * @Version 1.0
 */
public class ProjectIterator<E> implements IProjectIterator<E>{

    // 所有的项目都放在List中
    private ArrayList<E> projects;

    private int currentItem = 0;

    // 构造函数传入projectList
    public ProjectIterator(ArrayList<E> projects) {
        this.projects = projects;
    }

    // 判断是否还有元素，必须实现
    @Override
    public boolean hasNext() {

        // 定义一个返回值
        boolean b = true;
        if (this.currentItem >= projects.size() || this.projects.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public E next() {
        return this.projects.get(this.currentItem++);
    }

    @Override
    public void remove() {
        // 暂时没有使用到
    }
}

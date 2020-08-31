package IteratorDesign;


/**
 * @Description 老板看报表
 * @Author BG362793
 * @Date 2020-08-26 15:28
 * @Version 1.0
 */
public class Boss {

    public static void main(String[] args) {

        IProject project = new Project();
        project.add("星球大战项目", 10, 100000);
        project.add("扭转时空项目", 100, 1000000);
        project.add("超人改造项目", 10000, 100000000);

        for (int i = 4 ; i < 104; i++) {
            project.add("第" + i + "个项目", i * 10, i * 10000000);
        }

        // 遍历一下ArrayList 把所有的数据都取出来
        // 这里的泛型的问题，有待思考一下再
        IProjectIterator<IProject> projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = projectIterator.next();
            System.out.println(p.getProjectInfo());
        }

    }
}

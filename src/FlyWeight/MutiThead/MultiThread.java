package FlyWeight.MutiThead;


import FlyWeight.SignInfo;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-25 16:43
 * @Version 1.0
 */
public class MultiThread extends Thread {

    private  SignInfo signInfo;

    public MultiThread(SignInfo signInfo) {
        this.signInfo = signInfo;
    }

    @Override
    public void run() {

        if (!signInfo.getId().equalsIgnoreCase(signInfo.getLocation())) {

            System.out.println("编号：" + signInfo.getId());
            System.out.println("考试地址：" + signInfo.getLocation());
            System.out.println("线程不安全了!");

        }

    }


}

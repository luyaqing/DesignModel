package ChainOfResposibility.handle;

import ChainOfResposibility.women.IWomen;

/**
 * @Description 父亲类
 * @Author BG362793
 * @Date 2020-08-18 14:19
 * @Version 1.0
 */
public class Father extends Handler{


    // 重写或者调用父类的构造器即可。 必须要调用
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {

        System.out.println("------女儿向父亲请示------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是： 同意\n"); // \n 是换行符
    }
}

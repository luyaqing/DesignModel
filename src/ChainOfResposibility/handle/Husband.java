package ChainOfResposibility.handle;


import ChainOfResposibility.women.IWomen;

/**
 * @Description  丈夫
 * @Author BG362793
 * @Date 2020-08-18 14:24
 * @Version 1.0
 */
public class Husband extends Handler {

    public Husband() {

        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {

        System.out.println("-----妻子向丈夫请求----");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是： 同意\n");
    }
}

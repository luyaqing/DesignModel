package ChainOfResposibility;

/**
 * Handler抽象类
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUIEST = 1;

    public final static int HUSBAND_LEVEL_REQUEST = 2;

    public final static int SON_LEVEL_REQUEST = 3;

    // 能处理的级别
    private int level = 0;

    // 责任传递，下一个责任人是谁
    private Handler nextHandler;

    // 每个类都要说明一下自己能处理哪些请求
    public Handler(int _level) {
        this.level = _level;
    }

    // 一个女性 (女儿、妻子或者是母亲) 要求逛街，你要处理这个请求
}

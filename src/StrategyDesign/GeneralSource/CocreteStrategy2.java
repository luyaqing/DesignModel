package StrategyDesign.GeneralSource;

/**
 *  具体的运算法则
 */
public class CocreteStrategy2 implements Strategy {

    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}

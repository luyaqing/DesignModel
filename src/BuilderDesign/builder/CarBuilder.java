package BuilderDesign.builder;

import BuilderDesign.model.CarModel;

import java.util.ArrayList;

/**
 * @Description 抽象建造类
 * @Author BG362793
 * @Date 2020-08-31 14:50
 * @Version 1.0
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}

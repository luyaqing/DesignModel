package BuilderDesign.builder;

import BuilderDesign.model.BMWModel;
import BuilderDesign.model.CarModel;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-31 14:53
 * @Version 1.0
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {

        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {

        return this.bmwModel;
    }
}

package BuilderDesign.builder;

import BuilderDesign.model.BenzModel;
import BuilderDesign.model.CarModel;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-31 14:52
 * @Version 1.0
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {

        return this.benzModel;
    }
}

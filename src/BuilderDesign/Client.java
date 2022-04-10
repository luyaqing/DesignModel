package BuilderDesign;

import BuilderDesign.builder.BMWBuilder;
import BuilderDesign.builder.BenzBuilder;
import BuilderDesign.model.BMWModel;
import BuilderDesign.model.BenzModel;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-31 14:55
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        bmwModel.run();
    }
}

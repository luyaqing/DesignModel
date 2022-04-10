package BuilderDesign;

import BuilderDesign.builder.BMWBuilder;
import BuilderDesign.builder.BenzBuilder;
import BuilderDesign.model.BMWModel;
import BuilderDesign.model.BenzModel;

import java.util.ArrayList;

/**
 * @Description 导演类
 * @Author BG362793
 * @Date 2020-08-31 15:00
 * @Version 1.0
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();

    private BenzBuilder benzBuilder = new BenzBuilder();

    private BMWBuilder bmwBuilder = new BMWBuilder();


    public BenzModel getABenzModel() {

        // 清理场景， 容易被忽视的地方
        this.sequence.clear();

        this.sequence.add("start");

        this.sequence.add("stop");

        this.benzBuilder.setSequence(sequence);

        return (BenzModel) this.benzBuilder.getCarModel();
    }


    public BenzModel getBBenzModel() {

        this.sequence.clear();

        this.sequence.add("engine boom");

        this.sequence.add("start");

        this.sequence.add("stop");

        this.benzBuilder.setSequence(this.sequence);

        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getCBMWModel() {

        this.sequence.clear();

        this.sequence.add("alarm");

        this.sequence.add("start");

        this.sequence.add("stop");

        this.bmwBuilder.setSequence(this.sequence);

        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}

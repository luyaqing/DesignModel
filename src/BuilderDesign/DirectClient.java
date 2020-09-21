package BuilderDesign;

/**
 * @Description 导演场景类
 * @Author BG362793
 * @Date 2020-08-31 16:21
 * @Version 1.0
 */
public class DirectClient {

    public static void main(String[] args) {

        Director director = new Director();

        for (int i=0; i<1000; i++) {
            director.getABenzModel().run();
        }

        for (int i=0; i<10000; i++) {
            director.getBBenzModel().run();
        }

    }
}

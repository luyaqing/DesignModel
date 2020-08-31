package Facade;

/**
 * @Description 场景类
 * @Author BG362793
 * @Date 2020-08-28 9:34
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        ModernPostOffice modernPostOffice = new ModernPostOffice();

        String address = "Happy Road No.666, God Province, Heaven";

        String context = "Hello, It's me, do you know who I am?.........";

        modernPostOffice.sendLetter(context, address);

    }
}

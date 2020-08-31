package Facade;

/**
 * @Description TODO
 * @Author BG362793
 * @Date 2020-08-28 9:30
 * @Version 1.0
 */
public class LetterProcessImpl implements ILetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址和姓名" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件");
    }

}

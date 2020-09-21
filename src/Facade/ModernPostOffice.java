package Facade;

/**
 * @Description 现代邮局
 * @Author BG362793
 * @Date 2020-08-28 9:28
 * @Version 1.0
 */
public class ModernPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {

        letterProcess.writeContext(context);

        letterProcess.fillEnvelope(address);

        letterProcess.letterIntoEnvelope();

        letterProcess.sendLetter();
    }

}

package Facade;

/**
 * @Description 写信过程接口
 * @Author BG362793
 * @Date 2020-08-28 9:28
 * @Version 1.0
 */
public interface ILetterProcess {

    // 写信的内容
    void writeContext(String context);

    void fillEnvelope(String address);

    void letterIntoEnvelope();

    void sendLetter();

}

package FlyWeight.MutiThreadSafe;

/**
 * @Description String中的享元模式的实现
 * @Author BG362793
 * @Date 2020-08-25 17:39
 * @Version 1.0
 */
public class StringFlyWeight {

    public static void main(String[] args) {

        String str1 = "和谐";
        String str2 = "社会";

        String str3 = "和谐社会";
        String str4;
        str4 = str1 + str2;
        // == 比较的是地址信息
        System.out.println(str3 == str4);
        str4 = (str1 + str2).intern();
        System.out.println(str3 == str4);


        // false
        // true

    }

}

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author lzc
 * @Date 2019-05-21 14:28
 */
public class Ttest {
    public static void main(String ... args) {
        int a, b;
        a = b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println(a = 100);

        add(new int[]{10,20});
        add(10,20,30);

        try {
            new FileInputStream("");
            // 受检异常(checked 异常), 编译时异常
            // 运行时异常  NullPointException
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void add(int ...a) throws IllegalAccessError, IllegalArgumentException{
        throw new RuntimeException();
    }

}

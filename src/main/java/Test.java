import com.atguigu.day07.net2.protocol.GirlMessage;
import scala.collection.immutable.HashSet;

/**
 * @Author lzc
 * @Date 2019-05-28 14:40
 */
public class Test {
    public static void main(String[] args) {
        sum1(1, 100, 0);

    }

    public static int sum1(int from, int to, int acc) {
        if (from == to) throw new RuntimeException();
        else return sum1(from + 1, to, from + acc);
    }
}

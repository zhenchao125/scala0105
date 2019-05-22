/**
 * @Author lzc
 * @Date 2019-05-22 10:51
 */
public class ADemo {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        System.out.println(a.i);  // 20  X
        System.out.println(b.i);  // 20

        System.out.println(a.getI());
        System.out.println(b.getI());


    }
}

class A{
    static {

    }

    {
      //先与构造函数执行
    }
    public int i = 10;

    public int getI(){
        return i;
    }
}

class B extends A{

    public int i = 20;
    public int getI(){
        return i;
    }
}

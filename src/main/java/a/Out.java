package a;

/**
 * @Author lzc
 * @Date 2019-05-25 14:13
 */
public class Out{
    public void foo(){
        int a = 10;
        class Inner{
            public void f1(){

                System.out.println(a + 1);
            }
        }

        new Inner();
    }

}

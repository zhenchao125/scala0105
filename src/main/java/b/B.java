package b;

import a.A;

/**
 * @Author lzc
 * @Date 2019-05-22 16:51
 */
public class B extends A {
    public static void main(String[] args) {

    }

    public void foo(){
        super.foo();
        System.out.println("A foo");
    }
}

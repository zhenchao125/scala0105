/**
 * @Author lzc
 * @Date 2019-05-22 10:43
 */
public class Person {
    private int age = 0;


    public static void main(String[] args) {
        Person p1 = new Student();
        p1.eat();

    }
    public void eat() {
        System.out.println("p");
    }
}


class Student extends Person{
    @Override
    public void eat() {
        System.out.println("s");
    }
}
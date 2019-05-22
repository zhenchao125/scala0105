/**
 * @Author lzc
 * @Date 2019-05-22 10:43
 */
public class Person {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.eat();

    }
    public void eat() {
        System.out.println("p");
    }
}


class Student extends Person{
    public void eat() {
        System.out.println("s");
    }
}
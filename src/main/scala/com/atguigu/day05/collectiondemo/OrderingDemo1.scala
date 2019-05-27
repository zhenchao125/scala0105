package com.atguigu.day05.collectiondemo

/**
  * Author lzc
  * Date 2019-05-27 10:40
  */
object OrderingDemo1 {
    def main(args: Array[String]): Unit = {
//        val io = new IntOrdering
//        println(io.lteq(1, 2))
//        println(io.lteq(2, 1))
        val uo = new UserOrdering
        println(uo.gt(new User(10, "李四"), new User(20, "李四")))
    }
}

class User(val age: Int, val name: String){
    override def toString(): String = s"[$age  $name]"
}

class UserOrdering extends Ordering[User] {
    override def compare(x: User, y: User): Int = {
        var r: Int = x.age - y.age
        if (r == 0) {
            r = x.name.compareTo(y.name)
        }
        r
    }
}

object IntOrdering extends Ordering[Int] {
    /*
    如果返回值是 < 0 表示 x < y
    如果返回值是 > 0 表示 x > y
    如果返回值是 == 0 表示 x == y
     */
    override def compare(x: Int, y: Int): Int = x - y
}

/*
object IntOrderingReverse extends IntOrdering{
    override def compare(x: Int, y: Int): Int = -super.compare(x, y)
}
*/

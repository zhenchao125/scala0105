package com.atguigu.day05.collectiondemo

/**
  * Author lzc
  * Date 2019-05-27 10:58
  */
object SortByDemo1 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70, 60, 10, 20)
        val list2: List[Int] = list1.sortBy(x => x)
        println(list2)*/
    
//        val list1 = List("309999", "50", "701")
//        val r: List[String] = list1.sortBy(x => x.length)(Ordering.Int.reverse)
//        println(r)
        
        val list = List(new User(10, "a"), new User(30, "bb"), new User(20, "caa"), new User(20, "aaaaa"))
        val users: List[User] = list.sortBy(user => (user.age, user.name.length))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.Int.reverse))
        println(users)
    }
}

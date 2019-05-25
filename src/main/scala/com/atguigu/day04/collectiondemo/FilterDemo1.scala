package com.atguigu.day04.collectiondemo

object FilterDemo1 {
    def main(args: Array[String]): Unit = {
        // 900, 2500, 3600
        val list1 = List(30, 50, "70", 60, 10, 20, "a", false)
        // 过滤
        val list2: List[Any] = list1.filter(x => x.isInstanceOf[Int])
//        val list3: List[Int] = list2.map(x => x.asInstanceOf[Int])
        val list3: List[Int] = list2.map(_.asInstanceOf[Int])
        val list4: List[Int] = list3.map(x => x * x)
        println(list4)
    }
}

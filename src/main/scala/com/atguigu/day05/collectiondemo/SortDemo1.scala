package com.atguigu.day05.collectiondemo

object SortDemo1 {
    def main(args: Array[String]): Unit = {
//        val list1 = List(30, 50, 70, 60, 10, 20)
//        val list2: List[Int] = list1.sorted(Ordering.Int.reverse)
//        println(list2)
        
        val list1 = List("ab", "aabbba", "ccc")
        val list2: List[String] = list1.sorted(Ordering.String.reverse)
        println(list2)
    }
}

/*
提供了3个可以排序的算子
都不会修改原集合, 返回新的排好序的集合

sorted
sortWith
sortBy

 */

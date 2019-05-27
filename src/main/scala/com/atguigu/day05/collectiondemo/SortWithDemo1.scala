package com.atguigu.day05.collectiondemo

/**
  * Author lzc
  * Date 2019-05-27 11:31
  */
object SortWithDemo1 {
    def main(args: Array[String]): Unit = {
       /* val list1 = List(30, 50, 70, 60, 10, 20)
        val list2: List[Int] = list1.sortWith((a, b) => {
            if (a > b) true else false
        })
        println(list2)*/
    
       /* val list1 = List("309999", "50", "701")
        val list2 = list1.sortWith((a, b) => {
//            if(a.length < b.length) true else false
            a.length > b.length
        })
        println(list2)*/
    
        val persons = List(new Person(10, "a"), new Person(30, "bb"), new Person(20, "caa"), new Person(20, "aaaaa"))
        val ps: List[Person] = persons.sortWith((p1, p2) => {
            p1 < p2
        })
        println(ps)
        
    }
}

class Person(val age: Int, val name:String) extends Ordered[Person]{
    override def compare(that: Person): Int = {
        // this that
        this.age - that.age
    }
    
    override def toString: String = s"[$age $name]"
    
}

package com.atguigu.day06.homework

object Homework4 {
    def main(args: Array[String]): Unit = {
        val list = List(3, List(3, 2), 2, List(5))
        //        println(sum(list))
        println(sumList(list))
    }
    
    /// 求和, 计算 any 中的元素的和
    def sum(any: Any): Int = {
        any match {
            case list: List[_] => list.foldLeft(0)((x, y) => {
                x + sum(y)
            })
            case v: Int => {
                println(v);
                v
            }
        }
    }
    
    // 计算list中的元素和
    def sumList(list: List[Any]): Int = {
        var sum = 0
        list.foreach(x => {
            x match {
                case v: Int => sum += v
                case list: List[_] => sum += sumList(list)
            }
        })
        sum
    }
}

/*
4. 我们可以用列表制作只在叶子节点存放值的树。举例来说，列表((3 8) 2 (5)) 描述的是如下这样一棵树：
    *
   /|\
  * 2 *
 /\   |
3  8  5
List[Any] = List(List(3, 8), 2, List(5))
不过，有些列表元素是数字，而另一些是列表。在Scala中，你必须使用List[Any]。编写一个leafSum函数，计算所有叶子节点中的元素之和.

 */
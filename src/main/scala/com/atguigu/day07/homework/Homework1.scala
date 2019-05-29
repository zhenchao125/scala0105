package com.atguigu.day07.homework

object Homework1 {
    
    def leafSum(bt: BinaryTree): Int = {
        bt match {
            case Leaf(v) => v
            case Node(left, right) => leafSum(left) + leafSum(right)
        }
    }
    
    def main(args: Array[String]): Unit = {
        val node = Node(Leaf(10), Node(Node(Leaf(20), Leaf(30)), Leaf(50)))
        println(leafSum(node))
        
    }
}
sealed abstract class BinaryTree
case class Leaf(value : Int) extends BinaryTree
case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
/*
1. 如果使用样例会更好一些, 从二叉树开始
    sealed abstract class BinaryTree
    case class Leaf(value : Int) extends BinaryTree
    case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

    编写一个函数计算所有叶子节点的元素的和
    Node(Leaf(10), Node(Node(Leaf(20), Leaf(30)), Leaf(50))))
 */
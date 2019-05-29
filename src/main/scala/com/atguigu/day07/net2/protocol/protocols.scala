package com.atguigu.day07.net2.protocol

sealed abstract class Message

case class BoyMessage(content: String, age: Int) extends Message

case class GirlMessage(content: String, bfCount: Int) extends Message
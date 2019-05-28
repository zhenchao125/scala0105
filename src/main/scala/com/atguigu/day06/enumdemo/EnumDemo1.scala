package com.atguigu.day06.enumdemo

object EnumDemo1 {
    def main(args: Array[String]): Unit = {
        val seasons = List(Spring, Summer)
        seasons.foreach(season =>
            season match {
                case Spring =>
                case Summer =>
            }
        )
    }
}

sealed class Season
case object Spring extends Season
case object Summer extends Season
case object Autumn extends Season
case object Winter extends Season

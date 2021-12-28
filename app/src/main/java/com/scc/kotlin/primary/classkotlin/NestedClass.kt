package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/9 嵌套类
class SanGuo {// 外部类
    class WeiGuo(var name: String) {
        //嵌套类
        fun caption() = println("$name,是魏国滴")
    }

    class ShuGuo(var name: String) {
        //嵌套类
        fun caption() = println("$name,是蜀国滴")
    }
}

fun main() {
    SanGuo.WeiGuo("张辽").caption()
    SanGuo.ShuGuo("赵云").caption()
}
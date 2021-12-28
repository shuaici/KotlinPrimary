package com.scc.kotlin.primary

// TODO: 2021/12/7 控制语句
fun main() {
//    //return
//    println(userInfo("ShuaiCi", 18))
//    println("-----")
//    //break
//    for (number in 3..8) {
//        if (number > 6) break//number>6跳出循环
//        println(number)
//    }

    for (number in 3..8) {
        println("$number,start")
        if (number ==4 ) continue//跳过本次循环，直接执行下一次循环
        if (number > 6) break//number>6跳出循环
        println("$number,end")
    }
}

fun userInfo(name: String, age: Int): String {
    //具名函数这里要加return
    return "$name-今年：$age"
}
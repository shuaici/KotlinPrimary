package com.scc.kotlin.primary

// TODO: 2021/12/21 合并combine
fun main() {
    val name = listOf("变换", "过滤", "合并")
    val age = listOf(7, 25, 36)
    val list = name.zip(age)
    println(list)//[(变换, 7), (过滤, 25), (合并, 36)]
    val map = list.toMap()
    println(map)//{变换=7, 过滤=25, 合并=36}
    println(map["过滤"])//25

    //初始值为10，将每个元素乘以2相加
    var total = listOf(4, 8, 12).fold(10) { total, number ->
        println("Total：$total")
        total + (number * 2)
    }
    println(total)
}
package com.scc.kotlin.primary

// TODO: 2021/12/6 匿名函数
fun main() {
    //str.count()返回str字符串的长度
    val lenth = "ShuaiCi".count()
    println(lenth)

    //使用匿名函数制定特殊规则
    val lenthI = "ShuaiCi".count() {
        //it 就等于 "ShuaiCi"转成的char。
        it == 'i'
    }
    println(lenthI)

}
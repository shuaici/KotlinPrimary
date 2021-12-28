package com.scc.kotlin.primary

// TODO: 2021/12/3 var、val、类型推断 
fun main() {
    //类型推断
    var type = "Hello Type"//自动推断为String
    println(type)

    var a = 10      //自动推断为Int
    println(a)

    var b = true    //自动推断为Boolean
    println(b)

    var d :String   //如果不在声明时初始化则必须提供变量类型
    d = "HHH"       //明确赋值
    println(d)
}
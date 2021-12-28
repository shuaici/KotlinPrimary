package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/11 接口2.0
//interface 提供默认属性的getter方法和函数实现。
interface Tea2 {
    //定义属性
    val type: String
    val price: Int  //提供默认属性的getter
        get() = 500

    //定义函数
    fun effect(): String
    fun action(): String {//默认函数实现
        return "${type}-有延缓衰老的作用,$price"
    }
}

//实现接口 冒号:+接口名
//必须实现接口中所有没有默认实现的函数和属性
class GreenTea2(val place:String,override val type: String) : Tea2 {
    override fun effect(): String {
        return "${type}-产自-${place}-有抑制心血管疾病的功效,$price"
    }
}

fun main() {
    //使用实现接口的类
    println(GreenTea2("西湖", "绿茶").effect())
    //接口函数实现
    println(GreenTea2("西湖", "绿茶").action())
}
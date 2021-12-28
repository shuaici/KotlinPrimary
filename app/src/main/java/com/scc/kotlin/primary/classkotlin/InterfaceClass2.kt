package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/11 接口
//interface 关键字可以定义接口
interface Tea {
    //定义属性
    val type: String
    val price: Int

    //定义函数
    fun effect(): String
    fun action(): String
}

//实现接口 冒号:+接口名
//重写属性和函数
class GreenTea(var place: String, override var type: String, override val price: Int) : Tea {
    override fun effect(): String {
        return "${type}-产自-${place}-有抑制心血管疾病的功效,$price"
    }

    override fun action(): String {
        return "${type}-产自-${place}-有延缓衰老的作用,$price"
    }
}

fun main() {
    //使用实现接口的类
    println(GreenTea("西湖", "绿茶", 128).effect())
}
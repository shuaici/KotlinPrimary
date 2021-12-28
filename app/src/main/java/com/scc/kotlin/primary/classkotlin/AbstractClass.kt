package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/11 抽象类
//定义抽象类
abstract class Book{
    //未实现函数
    abstract fun introduce():String
    //实现函数
    fun classification()="Book-技术"
}

//继承类，抽象类无需使用open关键字
class AndroidBook: Book() {
    override fun introduce(): String {
        return "AndroidBook-Kotlin"
    }
}

fun main() {
    //继承类实现函数
    println(AndroidBook().introduce())
    //抽象类实现函数
    println(AndroidBook().classification())
}
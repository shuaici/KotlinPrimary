package com.scc.kotlin.primary.extension

//() -> Unit：普通匿名函数
fun String.doAnonymous(anonymous:() -> Unit):String{
    anonymous()
    return "$this,AnonymousN"
}
//String.() -> Unit：匿名函数内部this指向一个String对象，隐式调用
fun String.doAnonymousString(anonymous: String.() -> Unit) :String{
    println(this)
    anonymous()
    return this
}
//这里使用的泛型匿名函数，使用其内部this
fun <T> T.doAnonymousT(anonymous: T.() -> Unit):T {
    println(this)
    anonymous()
    return this
}
fun main() {
    //普通匿名函数
    "a".doAnonymous{
//        println("$this,看看")//此处使用this，报错
    }

    //匿名函数内部this指向一个String对象
    "b".doAnonymousString{
        println("$this,看看")
    }
    15.doAnonymousT {
        println("$this,无敌是多么寂寞")
    }
}
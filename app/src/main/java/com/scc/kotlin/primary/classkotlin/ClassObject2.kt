package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/8 对象表达式
open class Uesr{
    var name = "帅次"
    var age = 16
    open fun doInfo() = "Uesr doInfo"
}
//使用
fun main() {
    //User类别忘记加open关键字
    val user = object : Uesr(){
        override fun doInfo()= "User object"
    }
    println(user.doInfo())

    //通过对象表达式可以越过类的定义直接得到一个对象
    val vipUser = object {
        var name = "Kotlin"
        var age = 15
    }
    println(vipUser.name)
    println(vipUser.age)

}
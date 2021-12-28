package com.scc.kotlin.primary.classkotlin

import com.scc.kotlin.primary.extension.scFile as scAliasFile

// TODO: 2021/12/8 延迟初始化
class UserInfo4() {
    lateinit var name: String //属性延迟初始化
    fun addName(_name: String) {
        name = _name
    }

    fun readName() {
        //直接使用如果name未做初始化会报错。
        //println(name)
        //添加islnitialized检查
        if (::name.isInitialized) println(name)
    }

    val age by lazy { ageAdd() }//惰性初始化
    //如果不调用age， ageAdd()函数永远不执行
    private fun ageAdd(): Int {
        return 18
    }
}

fun main() {
    var userInfo4 = UserInfo4()
    userInfo4.addName("Hello Kotlin")
    userInfo4.readName()
    println("------")
    println(userInfo4.age)
    userInfo4.scAliasFile()//使用新定义的别名
//    userInfo4.scFile()//无法使用，报错
}
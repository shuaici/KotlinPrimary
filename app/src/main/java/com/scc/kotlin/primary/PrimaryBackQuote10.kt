package com.scc.kotlin.primary

// TODO: 2021/12/3 反引号中的函数名
fun main() {
    //使用空格和特殊字符对函数命名
    `20211202 世界对称日`("公众号：帅次")
    //Kotlin和Java互操作
    Test.`fun`()
}
private fun `20211202 世界对称日`(name :String ){
    println(name)
}
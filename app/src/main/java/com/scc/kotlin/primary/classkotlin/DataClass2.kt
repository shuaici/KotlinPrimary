package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/9 解构语法、运算符重载
data class DataDaSong(var name:String ,var age:Int)
class DaSong(var name:String ,var age:Int){
    //解构语法：必须从component1开始
    operator fun component1() = name
    operator fun component2() = age
}

fun main() {
    //使用普通类需要自己写component1、component2...componentN
    var (name,age) = DaSong("北宋",167)
    println("$name,是中国历史上继五代十国之后的朝代，传九位皇帝，享国-$age-年")
    //使用数据类支持解构语法，自动生成operator fun component1
    var (dataname,dataage) = DataDaSong("北宋",167)
    println("数据类：$dataname,是中国历史上继五代十国之后的朝代，传九位皇帝，享国-$dataage-年")

}
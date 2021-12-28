package com.scc.kotlin.primary

import android.os.Build
import android.support.annotation.RequiresApi

// TODO: 2021/12/15 Set
fun main() {
//    //创建只读Set
//    var set = setOf("Flutter", "Java", "Kotlin", "Java", "Flutter")
//    println(set.size)//3，因为后面2项与前面重复
//    //元素获取
//    println(set.elementAt(2))//Kotlin
//    //这里的安全操作和List类似。
//    println(set.elementAtOrElse(3) { "Set-Android" })//Set-Android
//    println(set.elementAtOrNull(3) ?: "Set-Android")//Set-Android
//
//    //创建可变Set
//    var mset = mutableSetOf("Flutter", "Java", "Kotlin", "Java", "Flutter")
//    //这里增删改查也跟List类似就不多描述了。
//    mset.add("iOS")
//    println(mset)//[Flutter, Java, Kotlin, iOS]
//    mset.remove("Java")
//    println(mset)//[Flutter, Kotlin, iOS]
    //集合转换
    var list = listOf("Flutter", "Java", "Kotlin", "Java", "Flutter")
    println("未去重：$list")
    //对List的元素进行去重
    var listTo = list.toSet().toList()
    println("去重：$listTo")

    //kotlin提供的快捷函数一步到位
    println(list.distinct())
}
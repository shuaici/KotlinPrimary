package com.scc.kotlin.primary

import android.os.Build
import android.support.annotation.RequiresApi

// TODO: 2021/12/15 List
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    //创建只读数组
    var data = listOf("Flutter", "Java", "Kotlin")
//    //元素获取
//    println(data[2])//Kotlin
//
//    //数组越界
////    println(data[3])//抛异常：ArrayIndexOutOfBoundsException
//    //避免数据越界
//    //1、当没有这个元素，执行lambda表达式
//    println(data.getOrElse(3) { "Android" })//Android
//    //2、当没有这个元素，返回null
//    println(data.getOrNull(3))//null
//    //2.1 使用空合并操作符，返回空时提供默认值
//    println(data.getOrNull(3) ?: "Android")//Android

    //创建可变数组
    var mutableData = mutableListOf("Flutter", "Java", "Kotlin")
//    //新增元素iOS
//    mutableData.add("iOS")
//    println(mutableData)//[Flutter, Java, Kotlin, iOS]
//    //删除元素Flutter
//    mutableData.remove("Flutter")
//    println(mutableData)//[Java, Kotlin, iOS]
//    //在下标为1位置新增元素鸿蒙
//    mutableData.add(1, "鸿蒙")
//    println(mutableData)//[Java, 鸿蒙, Kotlin, iOS]
//    //修改下标为1元素内容
//    mutableData.set(1, "鸿蒙2.0")
//    println(mutableData)//[Java, 鸿蒙2.0, Kotlin, iOS]

//    //MutableList转List
//    var data2:List<String> = mutableData.toList()
//    //List转MutableList
//    var mutableData2:MutableList<String> =  data.toMutableList()

    //mutator函数
    //创建可变数组
    mutableData = mutableListOf("Flutter", "Java", "Kotlin")
    //mutator:新增元素iOS
    mutableData += "iOS"
//    println(mutableData)//[Flutter, Java, Kotlin, iOS]
    //mutator:删除元素Flutter
    mutableData -= "Flutter"
    mutableData.remove("Flutter")
//    println(mutableData)//[Java, Kotlin, iOS]

    //使用lambda表达式删除元素
    //先在lambda判断元素是否存在，当元素存在返回true，则删除元素
    mutableData.removeIf { it.contains("iOS") }
//    println(mutableData)//[Java, Kotlin]

    //List集合遍历
    //方法一：for..in
    for (md in mutableData){
        println("①-$md")
    }
    //方法二：forEach
    mutableData.forEach {
        println("②-$it")
    }
    //方法三：forEachIndexed
    mutableData.forEachIndexed { index, s ->
        println("③-$index-$s")
    }
}
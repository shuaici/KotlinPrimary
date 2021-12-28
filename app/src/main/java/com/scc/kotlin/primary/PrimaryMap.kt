package com.scc.kotlin.primary

import android.os.Build
import android.support.annotation.RequiresApi

// TODO: 2021/12/15 Map
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
//    //创建只读Map
//    //方法一：
//    var map = mapOf("Kotlin" to 12,"Java" to 32,"Flutter" to 8)
//    println(map)//{Kotlin=12, Java=32, Flutter=8}
//    //方法二：
//    map = mapOf(Pair("Kotlin",15),Pair("Java",28),Pair("Flutter",55))
//    println(map)//{Kotlin=15, Java=28, Flutter=55}
//
//    //获取值
//    println(map["Kotlin"])//15
//    println(map.get("Java"))//28
//    println(map.getOrElse("iOS") { "Android" })//Android
//    println(map.getOrDefault("iOS", 100))//100

//    //创建可变Map
//    var mapM = mutableMapOf("Kotlin" to 19, "Java" to 51, "Flutter" to 15)
//    println(mapM)//{Kotlin=19, Java=51, Flutter=15}
//    //添加元素
//    mapM.put("iOS", 36)
//    println(mapM)//{Kotlin=19, Java=51, Flutter=15, iOS=36}
//    //删除元素Flutter
//    mapM -= "Flutter"
//    println(mapM)//{Kotlin=19, Java=51, iOS=36}
//    //没有Android元素返回帅次
//    println(mapM.getOrElse("Android") { "帅次" })//帅次
//    println(mapM)//{Kotlin=19, Java=51, iOS=36}
//    //没有Vs元素，则添加Vs元素
//    mapM.getOrPut("Vs") { 20 }
//    println(mapM)//{Kotlin=19, Java=51, iOS=36, Vs=20}
//    // //没有Ap元素返回94
//    println(mapM.getOrDefault("Ap", 94))
//    println(mapM)//{Kotlin=19, Java=51, iOS=36, Vs=20}


//    //遍历Map
//    //方法一：
//    map.forEach {
//        println("一：${it.key} - ${it.value}")
//    }
//    //方法二：
//    map.forEach { (s, i) ->
//        println("二：$s - &i")
//    }
}
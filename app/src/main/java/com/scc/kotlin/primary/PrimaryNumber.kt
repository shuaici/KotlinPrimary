package com.scc.kotlin.primary

import kotlin.math.roundToInt

fun main() {
    //String转Int
    var str = "1223"
    println(str.toInt())//1223
    str = "3.1415926"
    //报错java.lang.NumberFormatException: For input string: "3.1415926"
    //println(str.toInt())
    println(str.toIntOrNull())//null
    str = "18"
    println(str.toIntOrNull())//18

    //Double转Int
    var d = 3.1415926
    println(d.toInt())//3
    println(d.roundToInt())//3(四舍五入)
    d = 3.5415926
    println(d.roundToInt())//4(四舍五入)
    println(d.toInt())//3
    d.toBigDecimal()

    //Double类型格式化
    var s: String = "%.1f".format(d)//保留一位小数(且支持四舍五入)
    println(s)//3.5
    d = 3.1415926
    s = "%.1f".format(d)//保留一位小数(且支持四舍五入)
    println(s)//3.1
    s = "%.2f".format(d)//保留两位小数(且支持四舍五入)
    println(s)//3.14
    s = "%.3f".format(d)//保留三位小数(且支持四舍五入)
    println(s)//3.142


    var number = 18
    println(number.and(15))
    println(0<number.and(20))
    println(0<number.and(17))
}
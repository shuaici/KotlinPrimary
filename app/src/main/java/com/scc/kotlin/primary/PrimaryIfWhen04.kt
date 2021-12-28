package com.scc.kotlin.primary

// TODO: 2021/12/3 条件语句if和when、以及rang表达式
fun main() {
    val number = 83
    val str = if (0 < number && number <= 59) {
        //0-59范围
        "$number 不及格"
    } else if (59 < number && number <= 75) {
        "$number 及格"
    } else if (75 < number && number <= 85) {
        "$number 良好"
    } else {
        "$number 优秀"
    }
    println(str)




    //if..in
    //in x..y，in关键字用来检查某个值是否在指定区间x-y(包含y)之内。
    val strRange = if (number in 1..59) {
        //0-59范围
        "$number 不及格"
    } else if (number in 60..75) {
        "$number 及格"
    } else if (number in 76..85) {
        "$number 良好"
    } else {
        "$number 优秀"
    }
    println(strRange)

    val number2 = 81
    //这个就是取反了。
    //!in x..y，in关键字用来检查某个值是否不在指定区间x-y(包含y)之内。
    if (number2 !in 70..80){
        println("$number2,不在70-80范围")
    }else{
        println("$number2,在范围")
    }

    val numberWhen = 70
    val s = when(numberWhen){
        in 0..59->"$numberWhen,不及格"
        in 60..75->"$numberWhen,及格"
        in 76..85->"$numberWhen,良好"
        else -> "$numberWhen,优秀"
    }
    println(s)
}
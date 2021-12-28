package com.scc.kotlin.primary

// TODO: 2021/12/21 过滤filter
fun main() {
    var number = listOf(1, 3, 5, 7, 12, 19, 21)
    //过滤元素大于15的元素，并添加到新集合
    var newNumber = number.filter { it > 15 }
    //原始数据
    println(number)//[1, 3, 5, 7, 12, 19, 21]
    //过滤后
    println(newNumber)//[19, 21]

    //flatMap+filter
    var numberList = listOf(
        listOf(1, 2, 3, 4, 5),
        listOf(6, 7, 8, 9, 10), listOf(11, 12, 13, 14, 15)
    )
    //先合并，后过滤
    var newNumberList = numberList.flatMap { it.filter { it % 2 == 0 } }
    println(numberList)//[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]
    println(newNumberList)//[2, 4, 6, 8, 10, 12, 14]

}
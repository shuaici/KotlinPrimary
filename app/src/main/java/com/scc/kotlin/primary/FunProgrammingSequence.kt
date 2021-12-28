package com.scc.kotlin.primary

// TODO: 2021/12/21 序列Sequence
fun main() {
    //在1-3000的范围内产生1000个能同时整除2和整除7的数
    val list = (1..3000).toList().filter { it % 2 == 0 && it % 7 == 0 }.take(1000)
    println(list.size)//214
    //[14, 28, 42, 56, 70, 84, 98, ...2954, 2968, 2982, 2996]
    println(list)

    //使用序列,取满足条件的1000个为止
    val slist = generateSequence(1,
        { num ->
            num + 1
        })
        .filter { it % 2 == 0 && it % 7 == 0 }
        .take(1000)
        .toList()

    println(slist.size)//1000
    //[14, 28, 42, 56, 70, 84, 98, ...13958, 13972, 13986, 14000]
    println(slist)
}
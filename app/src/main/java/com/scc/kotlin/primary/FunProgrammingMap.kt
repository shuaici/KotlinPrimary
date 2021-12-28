package com.scc.kotlin.primary

// TODO: 2021/12/21 变换transform 
fun main() {
    var citys = listOf("北京", "上海", "广州", "深圳")
    var chinaCitys = citys
        .map { citys -> "中国-$citys" }
        .map { china -> "$china，一线城市！" }
    //原始集合
    println(citys)
    //修改原始集合元素
    println(chinaCitys)

    //flatMap
    //一个集合的集合:List<List<String>>
    var cityslist = listOf(listOf("北京", "上海", "广州", "深圳"), listOf("合肥","杭州","成都"))
    //多个集合中的元素合并，返回一个新集合flatCity
    var flatCity = cityslist.flatMap { it }

    //原始集合
    println(cityslist)//[[北京, 上海, 广州, 深圳], [合肥, 杭州, 成都]]
    //合并后集合元素
    println(flatCity)//[北京, 上海, 广州, 深圳, 合肥, 杭州, 成都]

}
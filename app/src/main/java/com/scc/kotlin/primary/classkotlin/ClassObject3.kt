package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/8 伴生对象
open class `东皇太一`{
    companion object {
        val lq = "刚出生就有先天至宝"
        fun `混沌钟`() = lq

    }
}
//使用
fun main() {
    //`东皇太一`类直接调用伴生对象函数。
    println(东皇太一.混沌钟())
}
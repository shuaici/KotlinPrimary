package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/10 枚举类、ADT
enum class ColorADT {
    RED,
    BULE,
    YELLOW
}

class TakeColor(var colorADT: ColorADT) {
    fun selectColor(): String {
        return when (colorADT) {
            ColorADT.RED -> "红色"
            ColorADT.BULE -> "蓝色"
            ColorADT.YELLOW -> "黄色"
        }
    }
}

fun main() {
    println(TakeColor(ColorADT.BULE).selectColor())
}
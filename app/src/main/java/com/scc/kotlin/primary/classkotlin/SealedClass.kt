package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/10 密封类
sealed class ColorSealed{
    //以下都是密封类的子类
    //使用object用的是单例，因为下面两个子类没有属性，不管生成多少次都一样
    object Blue : ColorSealed()
    object Yellow : ColorSealed()
    //这个子类有属性，可能属性不同，所以要生成不同的对象
    class Red(val toast:String) : ColorSealed()
}

class TakeColorSealed(var colorSealed: ColorSealed) {
    fun selectColor(): String {
        return when (colorSealed) {
            is ColorSealed.Blue -> "蓝色"
            is ColorSealed.Yellow -> "黄色"
            is ColorSealed.Red ->
                "红色,${(this.colorSealed as ColorSealed.Red).toast}"
            //不再需要 else 子句，因为我们已经覆盖了所有的情况
        }
    }
}

fun main() {
    println(TakeColorSealed(ColorSealed.Blue).selectColor())
    println("----------")
    println(TakeColorSealed(ColorSealed.Red("警告警告！！！")).selectColor())
}
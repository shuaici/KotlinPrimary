package com.scc.kotlin.primary.extension
class School(var name:String){
    var price:Int = 0
        get() = 15
    set(value) {
        field = field.plus(15)
    }
    //自带函数
    fun teacher():String{
        return "$name-教书育人"
    }
}
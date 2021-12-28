package com.scc.kotlin.primary

import java.util.regex.Pattern

// TODO: 2021/12/14 字符串
fun main() {
//    val ch = charArrayOf('S', 'h', 'u', 'a', 'i', 'C', 'i')
//    val str = String(ch)
//    println(str)//ShuaiCi
//
//    var kotlin = "Kotlin"
//    val android = """Android"""
//    println("$kotlin-$android")//Kotlin-Android

    //字符串截取
//    var intercept = "Write better Android apps faster with Kotlin."
//    println(intercept.length)//45
//    println(intercept.substring(10))//er Android apps faster with Kotlin.
//    println(intercept.substring(10,18))//er Andro
//    println(intercept.substring(10 until 18))//er Andro
//    println(intercept.substring(IntRange(10,18)))//er Androi
//
////    println(intercept.substring(30,46))//抛异常
////    println(intercept.substring(IntRange(30,46)))//抛异常
//
//    println(intercept.subSequence(10, 18))//er Andro

//    //字符串拆分
//    var cf = "Android|Java|Kotlin"
//    var data = cf.split("|")
//    println(data)
//    //解构语法
//    var (zero, one, two) = cf.split("|")
//    println("$zero-$one-$two")
//    //解构语法过滤元素
//    //如，不想接收第二个元素则可以用 "_"
//    var (zero2, _, two2) = cf.split("|")
//    println("$zero2-$two2")

//    var dataRegex = cf.split(Regex("[ao]"))
//    //[Andr, id|J, v, |K, tlin]
//    println(dataRegex.toString())
//    dataRegex = cf.split(Pattern.compile("[ao]"))
//    //[Andr, id|J, v, |K, tlin]
//    println(dataRegex.toString())

//    var th = "Write better Android apps faster with Kotlin."
    // 把字符t全部替换为!
//    println(th)
//    println(th.replace("t", "!"))
//
//    //第一个参数是正则表达式，用来决定要替换哪些字符
//    //第二个参数是匿名函数，用来确定该如何替换正则表达式搜索到的字符
//    var reg= th.replace(Regex("[rte]")){
//        when(it.value){
//            "r" ->"7"
//            "t" ->"!"
//            "e" ->"5"
//            else -> it.value
//        }
//    }
//    println(reg)

//    //把第一个字符A替换为V
//    println(th.replaceFirst("e", "V"))
//    //把第一个字符串er替换为Victory
//    println(th.replaceFirst("er", "Victory"))

//    //截取字符p，并在其后面加上Kotlin
//    println(th.replaceAfter("p", "Kotlin"))
//
//    //截取字符串Android，并在其后面加上帅次
//    println(th.replaceAfter("Android", "帅次"))

//    //截取字符p，并在其前面加上Kotlin
//    println(th.replaceBefore("p", "Kotlin"))
//
//    //截取字符串Android，并在其前面加上帅次
//    println(th.replaceBefore("Android", "帅次"))

    //截取字符p，并在其前面加上Kotlin

//    var indent  = "            aaa       aaaA"
//    println(indent)
//    //检测常见的最小缩进，并将其替换为指定的 newIndent。
//    println(indent.replaceIndent())
//    //检测所有输入行的通用最小缩进，将其从每一行中删除，如果第一行和最后一行是空白的，也将其删除（注意空白与空的区别）
//    println(indent.trimIndent())

    //字符串比较
//    val str1 = "Kotlin"
//    val str2 = "Kotlin"
//    val str3 = "kotlin".replace("k", "K")
//    val str4 = "kotlin"
//    println("$str1-$str2-$str3-$str4")
//    //比较的是内容，true
//    println(str1 == str2)//true
//    println(str1 == str3)//true
//
//    //这里为什么是true,字符串内容不可变，Java和Kotlin有个字符串常量池
//    //字符串常量池：因字符串内容相同，如果常量池有，则直接指向常量池中的常量
//    //当字符串内容改变，则会在内存重新开辟一个空间，然后字符串指向这个新的空间
//    println(str1 === str2)//true
//    println(str1 === str3)//false

//    //Kotlin.equals(Kotlin)
//    println(str1.equals(str2))//true
//    //Kotlin.equals(kotlin)
//    println(str1.equals(str4))//false
//    //Kotlin.equals(kotlin)
//    println(str1.equals(str4,true))//true


//    var seek = "Write better Android apps faster with Kotlin."
//    println(seek.first())
//    //查找等于某一个字符的第一个元素
//    var data = seek.first {
//        it == 'A'
//    }
//    println(data)
//    seek = ""
//    //报错：NoSuchElementException: Char sequence is empty.
////    println(seek.first())
//    println(seek.firstOrNull())//null
//    //如果字符串为空串或字符串内没有该字符，则返回null
//    var foN= seek.firstOrNull {
//        it == 'N'
//    }
//    println(foN)//null
//    seek = "Note"
//    //满足条件返回:char=N
//    foN= seek.firstOrNull {
//        it == 'N'
//    }
//    println(foN)//N
//
//    println(seek.last())//e
//    var la = seek.last {
//        it == 't'
//    }
//    println(la)//t

//    val cz = "Android|Java|Kotlin"
//    //查找i在cz中第一次出现的下标。
//    println(cz.indexOf('i'))//5
//    println(cz.indexOf("i"))//5
//    //从第10位开始，查找i在cz中第一次出现的下标。
//    println(cz.indexOf("i", 10))//17
//    var z = cz.indexOfFirst {
//        it == 'i'
//    }
//    println(z)//5
//
//    //查找i在cz中最后一次出现的下标。
//    println(cz.lastIndexOf('i'))//17
//    println(cz.lastIndexOf("i"))//17
//    //从第10位开始，查找i在cz中第一次出现的下标。
//    println(cz.lastIndexOf("i", 10))//5
//    z = cz.indexOfLast {
//        it == 'i'
//    }
//    println(z)//17

//    var verification = ""
//    println(verification)
//    println(verification.isEmpty())//true
//    println(verification.isNotEmpty())//false
//    println(verification.isNullOrEmpty())//true
//    println(verification.isBlank())//true
//    println(verification.isNotBlank())//false
//    println(verification.isNullOrBlank())//true
//
//    verification = "Kotlin"
//    println(verification)
//    println(verification.isEmpty())//false
//    println(verification.isNotEmpty())//true
//    println(verification.isNullOrEmpty())//false
//    println(verification.isBlank())//false
//    println(verification.isNotBlank())//true
//    println(verification.isNullOrBlank())//false

    var name = "ShuaiCi "
//    //字符串拼接
//    println(name + "回笼早觉艺术家")//ShuaiCi 回笼早觉艺术家
//    println(name.plus("无所谓最佳男主角"))//ShuaiCi 无所谓最佳男主角
//    println(name.plus(12.5))//ShuaiCi 12.5
//
//    //字符串长度
//    println(name.length)//8
//    println(name.count())//8
//
//    //在name中有2个i
//    var coun = name.count {
//        it == 'i'
//    }
//    println(coun)//2
//
//    println(name)//ShuaiCi
//    println(name.reversed())// iCiauhS
//
//    println(name.startsWith('S'))//true
//    println(name.startsWith("Shuai"))//true
//    println(name.startsWith("Ci"))//false
//    println(name.get(5))//C
//    //当起始位置为5时，是否由字符串`Ci`起始
//    println(name.startsWith("Ci", 5))//true

//    println(name.endsWith(' '))//true
//    println(name.endsWith("Shuai"))//false
//    println(name.endsWith("Ci "))//true
//    name = "     ShuaiCi     "
//    println(name)//     ShuaiCi
//    println(name.trim())//ShuaiCi

//    name = "Shuaici"
//    val age = 18
//    val money = 1.25f
//    //引号内放入变量值
//    //Shuaici 今年 18 ,身上带了 1.25 巨款
//    println("$name 今年 $age ,身上带了 $money 巨款")
//
//    val isMan = true
//    //添加表达式
//    //Shuaici 是个 纯爷们
//    println("$name 是个 ${if (isMan) "纯爷们" else "萌妹子"}")
//    name = "Shuaici"
//    name.forEach {
//        print("$it|")
//    }
//
//    var str = "12.5"
//    //使用toFloatOrNull，当str为null或空串时返回null
//    //使用toFloat，str为null或空串时报错：NumberFormatException
//    println(str.toFloatOrNull())//12.5
//    str= ""
//    println(str.toFloatOrNull())//null
////    println(str.toFloat())//NumberFormatException
//
//    var i = true
//    println(i.toString())//true

}


class Try {
    //val:引用不可变
    //增强的类型推导
    val a:String = "I am Kotlin."

    //必须显式声明返回类型
    fun sum(x:Int,y:Int) : Int{
        return x+y
    }
    //fun sum(x: Int,y: Int) = x+y
    //单行表达式与等号-----表达式函数体；普通的函数声明：代码块函数体

//Lambada1: 左边引用右边的匿名函数？
    val sum2: (Int,Int) -> Int = { x,y -> x+y }
//Lambada2: sum3看成匿名函数？
    val sum3 = { x: Int,y: Int -> x+y }
    /*1.Lambda表达式用{}包裹
     *2.声明参数类型+返回值支持类型推导，可省略函数类型声明
     *3.变量声明了函数类型，参数部分的类型可省略？？*/

    val sum:Int = sum(1,2)

    //对于复杂情况也要显式声明类型
    fun foo(n:Int) : Int = if (n==0) 1 else n*foo(n-1)
    val callBack:Int = foo(2)

    //var:局部变量；占内存少，便于储存数据
    fun cal(list: List<Int>) : Int{
        var res = 0
        for (el in list){
            res *= el
            res += el
        }
        return res
    }
    val foo = { x: Int ->
        val y = x + 1
        y
    }    //foo(1)=2

}
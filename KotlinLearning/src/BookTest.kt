class BookTest (var name:String){
    fun printName(){//var声明的参数name引用可被改变
        println(this.name)
    }
}
fun main(args : Array<String>){
    val book = BookTest("Thinking in Java.")//book引用的对象不可变
    book.name = "Diving into Kotlin."//对象的可变成员能被修改
    book.printName()
//一个类的构造方法——>变量(方法引用)
    val getBook = ::BookTest
    println(getBook("Dive into Kotlin.").name)

//引用某个类中的成员变量
    val bookName = listOf(
        BookTest("Thinking in Java"),
        BookTest("Dive into Kotlin")
    ).map (BookTest::name)//？？？？

    println(bookName)
}
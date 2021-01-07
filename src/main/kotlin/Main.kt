import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")
    dayOfWeek()
    println("Hellooo, ${args[0]}")
}

fun dayOfWeek() {
    val dayOfWeek : Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("It is $dayOfWeek")

    when (dayOfWeek) {
        0 -> println("Hi")
        in 1..3 -> println ("hii")
        else -> println("bye")
    }

}
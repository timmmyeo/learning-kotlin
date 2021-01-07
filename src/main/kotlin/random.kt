import java.lang.Math.random
import java.util.*

fun main(args: Array<String>) {
    val random1 = random()
    val random2 = {random()}
    println("$random1, ${random2.invoke()}")
    println("$random1, ${random2.invoke()}")
    println("$random1, ${random2.invoke()}")
}
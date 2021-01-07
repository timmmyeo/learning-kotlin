import java.util.*

fun main(args : Array<String>) {
    val value = 4
    when (value) {
        in 0..12 -> println("Good morning")
        else -> println("Good night, Kotlin")
    }
    val day = randomDay()
    val food = fishFood(day)
    println(food)

    swim ()

    if (shouldChangeWater(day)) {
        println("Yes")
    }
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading()) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day)-> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"


fun swim(time:Int = 50, speed: String = "Fast") {
    println("swimming $speed")
}

fun randomDay() : String {
    val week = arrayOf("Mon", "Tues", "Wed")
    return week[Random().nextInt(3)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Mon" -> "flakes"
        else -> "fasting"
    }
}
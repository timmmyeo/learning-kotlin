import java.util.*
import kotlin.random.Random.Default.nextInt

fun main(args: Array<String>) {
    val rollDice : (Int) -> Int = { sides ->
        when (sides) {
            0 -> 0
            else -> Random().nextInt(sides) + 1
        }}
    gamePlay(5, rollDice)
}

fun gamePlay(sides: Int, rollFunction : (Int) -> Int) {
    println(rollFunction(sides))
}
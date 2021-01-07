fun main(args : Array<String>) {
    for (i in 0..9) {
        println("Your fortune is: ${getFortuneCookie(getBirthday())}.")
    }

}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday : Int) : String {
    val fortunes = arrayOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.")
    return fortunes[birthday % fortunes.size]
}



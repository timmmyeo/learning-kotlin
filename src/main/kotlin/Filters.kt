fun main(args: Array<String>) {
    val decorations = listOf("rock", "paper", "pippers")
    val eager = decorations.filter{it[0] == 'p'}
    println(eager)

    // lazy
    val filtered = decorations.asSequence().filter{it[0] == 'p'}
    println(filtered)
    println(filtered.toList())

    // lazy map
    val lazyMap = decorations.asSequence().map{
        println("map: $it")
        it
    }

    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("All: ${lazyMap.toList()}")

}
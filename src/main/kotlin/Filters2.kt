fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper", "corn")
    val curries = spices.filter{it.contains("curry")}.sortedBy{it.length}
    val spices1 = spices.filter{it[0] == 'c' && it[it.length - 1] == 'e'}
    val spices2 = spices.take(3).filter{it.startsWith('c')}
    println(spices2)
}
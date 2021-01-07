fun main(args: Array<String>) {
    val swim = {println("Swimming")}
    swim()
    val waterFilter = {dirty: Int -> dirty / 2}
    println(waterFilter(10))
    val waterFilter2: (Int) -> Int = {dirty -> dirty / 2}
    println(waterFilter(100))
    println(updateDirty(150, waterFilter))
    println(updateDirty(200, ::makeDirty))
    println(updateDirty(230) {dirty -> dirty + 50})
}

fun makeDirty(dirty: Int) : Int {
    return dirty + 10
}

fun updateDirty(dirty: Int, operation: (Int) -> Int) : Int {
    return operation(dirty)
}
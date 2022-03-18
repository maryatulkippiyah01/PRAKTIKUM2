
fun printALL(string: Collection<String>){
    for (s in string)print("$s")
    println()
}

fun main(args: Array<String>){
    val stringList=listOf("satu","dua","tiga")
    printALL(stringList)

    val stringSet =setOf("satu","dua","tiga")
    printALL(stringSet)
}
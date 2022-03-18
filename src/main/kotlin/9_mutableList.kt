fun main(args: Array<String>) {
    //Mutable list contoh
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

    val numbersStr = mutableListOf("satu ", "dua", "tiga", "empat")
    numbersStr.add("lima")   // this is OK
    //mutableList
    println(numbersStr)
}
fun main(args: Array<String>) {
    //contoh ranges
    val i:Int = 2
    for (j in 1..10)
        print(j) // prints "1234"
    println()

    if (i in 1..10) { // equivalent of 1 <= i && i <= 10
        println("kami menemukan nomor Anda --"+i)
    }
}
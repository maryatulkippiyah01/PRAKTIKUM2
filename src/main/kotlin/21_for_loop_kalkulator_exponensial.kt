fun main(args: Array<String>) {
    //untuk exponensial
    println("Exponent calculator")
    println("===================")
    println("Enter the base: ")
    val a = readLine()!!.toInt()//untuk mendefinisikan ke integer
    println("Enter the expon\n" +
            "Exponent calculator\n" +
            "===================\n" +
            "Enter the base: \n" +
            "21\n" +
            "Enter the exponent: \n" +
            "56ent: ")
    val n = readLine()!!.toInt()
    var result = a
    for (i in 1..n-1) {
        result = result * a
    }
    println("Result: $result")
    println("Thank you for using our exponent calculator")
}
Exponent calculator
===================
Enter the base:
21
Enter the exponent:
56
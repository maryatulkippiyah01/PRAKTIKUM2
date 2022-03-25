fun main(args: Array<String>) {
    //untuk looping while
    var x:Int = 0
    println("Example of While Loop--")
    while(x <= 10) {
        print("$x ")
        x++
    }
    print('\n')

    //untuk looping do while
    var y:Int = 0
    do {
        y = y + 10
        println("I am inside Do block---" +y)
    } while(y <= 50)
}
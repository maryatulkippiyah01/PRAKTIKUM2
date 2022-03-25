fun main(args: Array<String>) {
    //kode program untuk break dan continue
    var x:Int
    println("Example of Break and Continue in For-Loop")
    for(x in 1..10) {
        if(x == 7) break//untuk break
        if(x == 3) continue//untuk continue
        print("$x ")
    }
    print('\n')
}
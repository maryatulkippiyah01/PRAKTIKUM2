fun main(args: Array<String>) {
    returnLoop()
}
//kode program untuk for_loop

fun returnLoop(){
    var x:Int
    println("Example of return in For-Loop")
    for(x in 1..10) {//x sama dengan x 1 sampai dengan 10
        if(x < 5) {
            print("${x - 1} ")
        }else {
            return
        }
        print("$x ")
    }
    print("Tidak akan pernah dieksekusi")//menampilkan pesan tidak akan pernah dieksekusi
}
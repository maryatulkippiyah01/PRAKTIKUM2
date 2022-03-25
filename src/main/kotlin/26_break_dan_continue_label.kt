fun main(args: Array<String>) {
    //kode program break dan continue label
    println("Example of Break and Continue Label")
    myLabel@ for(x in 1..10) { // menerapkan label khusus
        if(x == 5) {
            println("I am inside if block with value"+x+"\n-- hence it will close the operation")
            break@myLabel //menentukan label
        } else {
            println("I am inside else block with value"+x)
            continue@myLabel
        }
        println("Not Print")
    }
}
fun main(args:Array<String>){
    val numbers = listOf("satu", "dua", "tiga", "empat")
    println("Number dari elemen: ${numbers.size}")
    println("element ketiga: ${numbers.get(2)}")
    println("element keempat: ${numbers[3]}")
    println("elemen ke \"dua\" ${numbers.indexOf("dua")}")

    //List elements (including nulls) can duplicate
    val maryatul = Person("maryatul", 21)
    val people = listOf<Person>(Person("hawa", 20), maryatul, maryatul)
    val people2 = listOf<Person>(Person("hawa", 20), Person("maryatul", 21), maryatul)
    println(people == people2)
    maryatul.age = 22
    println(people == people2)
}

class Person(var name: String, var age: Int){}
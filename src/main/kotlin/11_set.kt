fun main() {
    //Set<T> menyimpan elemen unik; urutan mereka umumnya tidak terdefinisi.
    val numbers = setOf(1, 2, 3, 4,5,6,7,8,9,10)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(10,9,8,7,6,5,4,3,2,1)
    println("The sets are equal: ${numbers == numbersBackwards}")

    //implementasi default Set – LinkedHashSet – mempertahankan urutan penyisipan elemen
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())

    val strings = hashSetOf("a", "b", "c", "c") //hash set value unik
    println("My Set Values are"+strings)
}
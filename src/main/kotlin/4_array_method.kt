fun main(args: Array<String>) {
    //Array methods
    val simpsonsA = arrayOf("maryatul", "kippiyah", "icik", "muhammad", "ikmal")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')


    val simpsonsB: Array<String> = arrayOf("maryatul", "kippiyah", "icik", "muhammad", "ikmal")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')


    val simpsonsC: Array<String> = arrayOf("maryatul", "kippiyah", "icik", "muhammad", "ikmal")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')


    val simpsonsD = arrayOf("maryatul", "kippiyah", "icik", "muhammad", "ikmal")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }

    val simpsonsE = arrayOf("maryatul", "kippiyah", "icik", "muhammad", "ikmal")
    println("simpsons size: " + simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+ simpsonsE.minOrNull())
    println("Max = "+ simpsonsE.maxOrNull())
    println("First = " + simpsonsE.first())
    println("Last = " + simpsonsE.last())
    println(simpsonsE.contains("Marge"))
}
// Codelba numero 6
//Pares y Triples

fun main (){
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")
    println()

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())
    println()

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")
    println()

    //Destructurar pares y triples
    val equipment1 = "fish net" to "catching fish"
    val (tool, use) = equipment1
    println("$tool is used for $use")
    println()

    val numbers1 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers1
    println("$n1 $n2 $n3")

    // Comprender colecciones
    // Listas, mapas y hash
    println()
    val list = listOf(1, 5, 3, 4)
    println(list.sum())
// Esto dara error no se puede llamar debido a los argumentos incorrectos
    //val list2 = listOf("a", "bbb", "cc")
    //println(list2.sum())
    println()
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })

    val list1 = listOf("a", "bbb", "cc")
    for (s in list1.listIterator()){
        println("$s")
    }
// Los mapas hash
    println()
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))

    println(cures["red sores"])
    //En esta el valor el null ya que el sintoma no existe en el mapa
    println(cures["scale loss"])
    println()
    println(cures.getOrDefault("bloating", "sorry, I don't know"))
    println()
    println(cures.getOrElse("bloating") {"No cure for this"})


    println()
    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())

}


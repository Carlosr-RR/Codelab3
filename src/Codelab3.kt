// Tarea de Codelab numero 3

fun main (){
   var n1 = 1
   var n2 = 1
   val suma = n1 + n2
   println(" La suma de: $n1 + $n2 es igual a: $suma")

   n1 = 53
   n2 = 3
   val resta = n1 - n2
   println("La resta es: $resta")

   n1 = 50
   n2 = 10
   val division = n1 / n2
   println("La division es: $division")

   var nm1 = 1.0
   var nm2 = 2.0
   val div = nm1/nm2
   println("La division es: $div ")

   nm1 = 2.0
   nm2 = 3.5
   val mult = nm1 * nm2
   println ("La multiplicacion es : $mult")

   n1 = 6
   n2 = 50
   val multi = n1 * n2
   println("La multplicacion es de : $multi")

   nm1 = 6.0
   nm2 = 50.0
   val multip = nm1 * nm2
   println ("La multiplicacion es: $multip")

   nm1 = 6.0
   n2 = 50
   val multipi = nm1 * n2
   println("Esta Multplicacion es : $multipi")

   val multplicacion = n1.times(3)
   println ("El resultado es: $multplicacion")

   val sumando = nm1.plus(4)
   println ("El resultado es: $sumando")

   val dividendo = nm2.div(2)
   println ("El resultado sera: $dividendo")
   println()

   // Practicar usos de Tipos
   val i: Int =6
   val b1 = i.toByte()
   println(b1)

   val b2: Byte = 1 // OK, literals are checked statically
   println(b2)

   val i4: Int = b2.toInt()
   println(i4)

   val i5: String = b2.toString()
   println(i5)

   val i6: Double = b2.toDouble()
   println(i6)

   println()
   val oneMillion = 1_000_000
   val socialSecurityNumber = 999_99_9999L
   val hexBytes = 0xFF_EC_DE_5E
   val bytes = 0b11010010_01101001_10010100_10010010
   println("Un millon es : $oneMillion")
   println("El numero de seguro social es: $socialSecurityNumber")
   println("En Hexadecimal es: $hexBytes")
   println("En bytes es: $bytes")

   var fish = 1
   fish = 2
   val aquarium = 1
   //aquarium = 2  aca se deberia cambiar a var para reasignarle el valor

   var fishes: Int = 12
   var lakes: Double = 2.5

   //Cree una plantilla de cadena
   println()
   val numberOfFish = 5
   val numberOfPlants = 12
   println("I have $numberOfFish fish" + " and $numberOfPlants plants")
   println("I have ${numberOfFish + numberOfPlants} fish and plants")
   println()

   // Comparar condicionales y booleanos
   val numeroPeces = 50
   val numeroPlantas = 23
   if (numeroPeces > numeroPlantas){
      println("Buena Proporcion")
   } else {
      println("Proporcion no saludable")
   }
    println()
   val pez = 50
   if (pez in 1 .. 100){
      println(pez)
   }

   if (numberOfFish == 0) {
      println("Empty tank")
   } else if (numberOfFish < 40) {
      println("Got fish!")
   } else {
      println("That's a lot of fish!")
   }

   when (numberOfFish) {
      0  -> println("Empty tank")
      in 1..39 -> println("Got fish!")
      else -> println("That's a lot of fish!")
   }

   //Nulabilidad
   //var rocks: Int = null  aca podemos ver que estas variables no aceptan valores nulos
   var marbles: Int? = null
   // para aceptar valores nulos  se antepone el signo de interrogracion

   /*var fishFoodTreats = 6
   if (fishFoodTreats != null) {
      fishFoodTreats = fishFoodTreats.dec()
   }
*/

   // asi lo escribimos en Kotlin
   var fishFoodTreats = 6
   fishFoodTreats = fishFoodTreats?.dec()!!
   println(fishFoodTreats)

   //El operador de aserción no nulo, (double-bang), convierte cualquier valor en un tipo no nulo y produce una
   // excepción si el valor es .NullPointerExceptions!!null

   //val len = s!!.length   // throws NullPointerException if s is null

   //MATRICES LISTAS Y BUCLES.
   println()
   val escuela = listOf("mackerel", "trout", "halibut")
   println(escuela)
   println()
   val myList = mutableListOf("tuna", "salmon", "shark")
   myList.remove("shark")
   println(myList)
   println()
   //Matrices
   val escuelaa = arrayOf("shark", "salmon", "minnow")
   println(java.util.Arrays.toString(escuelaa))
   println()
   val mixta = arrayOf("fish", 2)
   println(java.util.Arrays.toString(mixta))
   val numbers = intArrayOf(1,2,3)
   println(java.util.Arrays.toString(numbers))
   println()
   val numeros = intArrayOf(1,2,3)
   val numeros3 = intArrayOf(4,5,6)
   val foo2 = numeros3 + numeros
   println(foo2[5])
   println()
   val numbers1 = intArrayOf(1, 2, 3)
   val oceans = listOf("Atlantic", "Pacific")
   val oddList = listOf(numbers, oceans, "salmon")
   println(oddList)
   println()
   val array = Array (5) { it * 2 }
   println(java.util.Arrays.toString(array))
   println()
   //Hacer bucles

   val school = arrayOf("shark", "salmon", "minnow")
   for (element in school) {
      print(element + " ")
   }

   println()
   for ((index, element) in school.withIndex()) {
      println("Item at $index is $element\n")
   }

   for (i in 1..5) print(i)
   println()
   for (i in 5 downTo 1) print(i)
   println()
   for (i in 3..6 step 2) print(i)
   println()
   for (i in 'd'..'g') print (i)
   println()
   var bubbles = 0
   while (bubbles < 50) {
      bubbles++
   }
   println("$bubbles bubbles in the water\n")

   do {
      bubbles--
   } while (bubbles > 50)
   println("$bubbles bubbles in thee water\n")

   repeat(2) {
      println("A fish is swimming")
   }
}

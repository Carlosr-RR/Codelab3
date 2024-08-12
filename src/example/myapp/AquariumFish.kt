
package example.myapp

/*abstract class AquariumFish: FishAction {
    abstract val color: String
    override  fun eat () = println("yum")
}
*/
interface FishAction  {
    fun eat()
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

interface FishColor {
    val color: String
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction ("eat algae"),
    FishColor by fishColor
/*    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}*/

class Shark: FishAction, FishColor {
    override val color = "gray"
    override  fun eat(){
        println("hunt and eat fish")
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}

//Interfaz
interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim()  {
        println("swim")
    }
}

// Ejemplo de clase sellada
sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}
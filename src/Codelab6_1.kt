// Ejemplo de Constante
// Diferencia entre Val y Const
const val rocks = 3

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

// TAREA 5: ESCRIBIR EXTENSIONES
fun main (){
    fun String.hasSpaces(): Boolean {
        val found = this.find { it == ' ' }
        return found != null
    }
    println("Does it have spaces?".hasSpaces())

    open class AquariumPlant(val color: String, private val size: Int)
    class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

    fun AquariumPlant.print() = println("AquariumPlant")
    fun GreenLeafyPlant.print() = println("GreenLeafyPlant")
    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()

}


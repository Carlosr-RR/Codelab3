package example.myapp

import java.lang.Math.PI
/*
class Aquarium (length: Int = 100, width: Int = 20, height: Int = 40)  {
    var length: Int = length
    var width: Int = width
    var height: Int = height


    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}
 */

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40, ) {
// propiedad
open var volume: Int
    get() = width * height * length / 1000  // 1000 cm^3 = 1 l
    set(value) {
        height = (value * 1000) / (width * length)
    }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")

       // println("Volume: $volume l")
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
    init {
        println("aquarium initializing")
    }
   //init {
        // 1 liter = 1000 cm^3
      // println("Volumee: ${width * length * height / 1000} l")
 //   }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}
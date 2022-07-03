interface Roamable{
    fun roam()
}
abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam(){
        println("The animal is roaming")
    }
    fun sleep(){
        println("The animal is sleeping")
    }
}
abstract class Canine : Animal(){
    override fun roam() {
        println("The canine is roaming")
    }

}
//abstract class Feline{
//
//}
class Hippo : Animal() {
    override val image = "Hippo.jpg"
    override val food = "Grass"
    override val habitat = "water"

    override fun makeNoise(){
        println("Grunt, Grunt !")
    }
    override fun eat(){
        println("The Hippo eat $food")
    }
}
//class Lion : Animal() {
//    override val image = "Lion.jpg"
//    override val food = "zebra"
//    override val habitat = "savanna"
//
//    override fun makeNoise(){
//        println("RRRRR!")
//    }
//    override fun eat(){
//        println("The Lion eat $food")
//    }
//}
//class Cheetah{
//
//}
class Wolf : Canine(){
    override val image = "Wolf.jpg"
    override val food = "Rabbit"
    override val habitat = "Forest"

    override fun makeNoise(){
        println("Hooowl!")
    }
    override fun eat(){
        println("The Wolf is eating $food")
    }
}
//class Lynx{

//}
//class Fox{

//}
class Vehicle : Roamable {
    override fun roam(){
        println("The vehicle is roaming")
    }
}
class Vet{
    fun giveshot(animal: Animal){
        animal.makeNoise()
    }
}
fun main() {
    val animals = arrayOf(Hippo(),Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveshot(wolf)
    vet.giveshot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(),Vehicle())
    for (item in roamables){
        item.roam()
        if(item is Animal) {
            item.eat()
        }
    }
}
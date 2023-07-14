package org.demre.funcionmain

/*fun main (){
    var valor1 = 10
    val valor2 = 33
    val valor3 = 66
    var suma = valor1 + valor2 + valor3
    println("El resultado de la primera suma es: $suma")

    valor1 = 55
    suma = valor1 + valor2 + valor3
    println("El resultado de la segunda suma es: $suma")

    var promedio = suma/3.0
    println("El promedio es: $promedio")
}*/
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()

}
class Person(val name: String, val age: Int, var hobby: String?, var referrer: Person?) {
    fun showProfile() {
    println("Name: $name \nAge: $age \nLikes to $hobby.")
        if(referrer == null){
            println("Doesn't have a referrer")


        }else{
            println("Has a fererrer ${referrer!!.name}, who likes to play ${referrer!!.hobby}.")
        }
    }
}
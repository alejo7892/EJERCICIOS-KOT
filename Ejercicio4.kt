/* Basado en el siguiente menú
1. Saludar
2. Pedir Nombre de una Persona
3. Sumar 2 Números
Haga un algoritmo que dependiendo del código ingresado, realice la acción correspondiente. */
fun main() {
    var menu= """
    1. saludar
    2.pedir nombre de una persona
    3.sumar 2 numeros
    ingrese una opcion : """
    
    println(menu)
    var opcion= readLine()?.toInt()
    when (opcion){
        1 -> println("Hola")
        2 ->{
            println("ingrese el nombre de una persona: ")
            val name= readLine()
            println("hola $name")
            }
        3 -> {
            println("ingrese el primer numero")
            val num1= readLine()?.toInt()
            println("ingrese el segundo numero")
            val num2= readLine()?.toInt()
            println("la suma de $num1 y $num2 es: ${(num1!!+num2!!)}")
        }
        else -> println("ingrese una opcion valida")
        } 
            
    }

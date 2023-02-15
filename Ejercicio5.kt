/* Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
1. Sumar
2. Restar
3. Multiplicar
4. Dividir 
5. Finalizar
Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4 */
fun main() {
    var opcion: Int
    var num1 :  Float 
    var num2: Float

    do{
     print("Ingrese el primer numero")
     num1 = readLine()!!.toFloat()
     print("Ingrese el segundo numero")
     num2 = readLine()!!.toFloat() 
     print("Elija una opcion: \n 1. sumar \n 2. restar \n 3. multiplicar \n 4. dividir \n 5. salir")
     opcion= readLine()!!.toInt()
     when (opcion){
     1 -> println("la suma es:  ${num1+num2}")
     2 -> println("la resta es:  ${num1-num2}") 
     3 -> println("la multiplicacion es:  ${num1*num2}")
     4 -> {
        if (num2 <= 0){
            println("el segundo numero no puede ser negativo o cero")
        } else{
            println("la division es: ${num1/num2}")
        }
     }
     5 -> println("Usted salio del programa")

     else -> println("ingrese una opcion valida")

     }

    }while(opcion != 5)
}

/* Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
1. Sumar
2. Restar
3. Multiplicar
4. Dividir 
5. Finalizar
Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4 */
fun main() {
    var opcion : Int=0
    var num1: Float
    var num2: Float

    while (opcion != 5){
    print("ingrese el primer numero: ")
    num1= readLine()!!.toFloat()
    print("ingrese el segundo numero: ")
    num2= readLine()!!.toFloat()
    print("Elija una opcion: \n 1. sumar \n 2. restar \n 3. multiplicar \n 4.dividir \n 5. salir")
    opcion=readLine()!!.toInt()
    when(opcion){
        1 -> println("la suma es: ${num1+num2}")
        2 -> println("la resta es: ${num1-num2}")
        3 -> println("la multiplicacion es: ${num1*num2}")
        4 -> {
            if(num2 <= 0){
            println("El segundo numero no puede ser negativo ni cero")
        } else{
            println("la division es: ${num1/num2}")
        }
        }
        5 -> println("programa finalizado")
        else -> println("ingrese un dato valido")
    }
  }
}

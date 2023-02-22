fun main() {
    
    val par = Pair("clave", 10)

  
    val clave = par.first
    val valor = par.second

   
    println("La clave es $clave y el valor es $valor")

   
    val nuevoPar = par.copy(second = 20)

    
    println("La clave es ${nuevoPar.first} y el valor es ${nuevoPar.second}")
}

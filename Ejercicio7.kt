/* Haga un algoritmo que permita calcular el promedio de n estudiantes, el sistema debe imprimir:
1. Cantidad de estudiantes procesados
2. Promedio total de los promedios */
fun main() {
    var cantidadestudiantes: Int
    var sumapromedios = 0.0
    println("ingrese la cantidad de estudiantes")
    cantidadestudiantes=readLine()!!.toInt()

    for (i in 1..cantidadestudiantes) {
        println("ingrese el promedio del estudiante $i: ")
        var promedio =readLine()!!.toDouble()
        sumapromedios += promedio
        
    }
    var promediototal= sumapromedios / cantidadestudiantes
    println("cantidad de estudiantes procesados es : $cantidadestudiantes ")
    println("promedio total de los promedios es: $promediototal")
    
}
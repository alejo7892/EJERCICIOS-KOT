fun main() {
    val precios = mutableMapOf(
        "manzanas" to 2.50,
        "bananas" to 1.75,
        "naranjas" to 3.00,
        "uvas" to 5.50,
        "piñas" to 6.25
    )

    println("Ingrese el nombre del producto a buscar: ")
    val producto = readLine() ?: ""

    val precio = precios[producto.toLowerCase()]

    if (precio != null) {
        println("El precio de $producto es: \$$precio")
    } else {
        println("No se encontró el producto $producto en la tienda.")
    }
}

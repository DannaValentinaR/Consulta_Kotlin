fun main() {
    
    println("    Explicación de conceptos en Kotlin")
  
    println("1. Variables:")
    println("En Kotlin, una variable es un contenedor que almacena un valor que puede cambiar durante la ejecución del programa. Las variables se definen utilizando la palabra clave var. A diferencia de las constantes, las variables pueden reasignarse a nuevos valores después de su inicialización.")
    println("Ejemplo:")
    println("var variable: String = \"hola\"")
    println("variable = \"adios\"")
    println("println(variable)\n")

    println("2. Constantes:")
    println("En Kotlin, una constante es una referencia a un valor que no puede ser modificado después de su inicialización. Las constantes se definen utilizando la palabra clave val. A diferencia de las variables (var), una vez que se asigna un valor a una constante, no se puede cambiar.")
    println("Ejemplo:")
    println("val constante: String = \"hola\"")
    println("// constante = \"No puedo cambiar mi valor\" ")
    println("println(constante)\n")

    println("3. Opcionales y manejo de nulos:")
    println("En Kotlin, el manejo de nulos y las variables opcionales están diseñados para prevenir errores comunes relacionados con valores nulos (como las excepciones NullPointerException), proporcionando un sistema de tipos que permite declarar explícitamente cuándo una variable puede ser nula.")
    println("Ejemplo:")
    println("var nombre: String? = \"Paola\"")
    println("println(\"Nombre: \$nombre\")")
    println("nombre = null // Esto es válido porque la variable es de tipo String?")
    println("println(\"Nombre después de asignar null: \$nombre\")\n")

    println("Uso del operador Elvis (?:) para proporcionar un valor por defecto si la variable es nula:")
    println("val longitud: Int = nombre?.length ?: 0")
    println("println(\"Longitud del nombre: \$longitud\")\n")

    println("Uso del operador !! para lanzar una excepción si la variable es nula:")
    println("// val longitudForzada: Int = nombre!!.length // Esto lanzará una excepción si nombre es nulo\n")

    println("4. Funciones con parámetros opcionales:")
    println("En Kotlin, las funciones con parámetros opcionales permiten definir valores predeterminados para algunos de sus parámetros. Esto hace que esos parámetros sean opcionales al momento de llamar a la función. Si no se proporciona un valor para un parámetro opcional, se utilizará el valor predeterminado definido en la función.")
    println("Ejemplo:")
    println("fun saludo(saludo: String = \"Hola\", nombre: String? = null) {")
    println("    val nombreSaludo = nombre ?: \"Desconocido\"")
    println("    println(\"\$saludo, \$nombreSaludo!\")")
    println("}")
    println("saludo() // Llamada con valores por defecto")
    println("saludo(nombre = \"Danna\") // Llamada con parámetro opcional")
    println("saludo(saludo = \"Buenos días\", nombre = \"Jhon\") // Llamada con todos los parámetros\n")

   
 
}

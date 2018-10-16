//Primer Hola mundo en Kotlin https://www.youtube.com/watch?v=EAR4FZZ0eIA&index=5&list=PLh_neeN4BQCkH8lDUQ53tkFbRmLAV4g8P


fun main(args : Array<String>){
    println("Hola mundo")

    //Tipos de declarar una variable

    //Asignacion explicita
    var cadena: String
    var n1: Int
    var n2: Int = 100
    var c: Char = 'x'
    var b: Boolean = false
    //Inferencia de tipos
    var cadena1 = "My String"
    var n = 100
    var c1 = 'x'
    var b1 = true
    //Constantes
    val cons: Int = 1
    val cons2 = 5

    //Cadenas con null
    //Una cadena no puede ser null

    //Objetos
    var classA = ClassA()
    classA.unitFun()
    //Parametros por defecto
    println(classA.mySum(5))
    //Funcion con parametros con nombre
    println(classA.mySum(num1 = 5, num2 = 2, num3 = 10))
    println(classA.square(numero = 5))
    classA.funcionMiembro()
    classA.cadenas("Teemonio", "Yass", "Ies")
    classA.numeros(t = "X")
    classA.numeros(t = false)
    classA.numeros(t = 5)

    //Ciclos
    var items = listOf("Juan", "Jose", "Miguel")
    //For
    for (item in items)
        println("El nombre es $item")
    for (posicion in items.indices)
        println("La posicion es $posicion el nombre es ${items[posicion]}")
    //For con Step y DownTo
    for(x in 1..20){
        println(x)
    }
    for(x in 1..20 step 2){
        println(x)
    }
    for(x in 20 downTo 1){
        println(x)
    }
    for(x in 20 downTo 1 step 2){
        println(x)
    }
    //While
    var x: Int = 1
    while (x < 10){
        println(x)
        x++
    }
    //Do while
    do {
        println(x)
        x--
    }while (x > 0)
    //Constructores
    var libro = Libro(autor = "Yaya", paginas = 100, editorial = "Planetoide")
    var libro2 = Libro(autor = "Yiyi", paginas = 300);
}
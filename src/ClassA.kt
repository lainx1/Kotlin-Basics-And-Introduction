class ClassA {
    //Declaracion de variable en una clase

    //Variable String
    var cadena: String = "x"

    //Tipos de datos enteros y sus tamaños
    var _int: Int = 32
    var _long: Long = 64
    var _double: Double = 64.00
    var _floar: Float = 32f
    var _short: Short = 16
    var _byte: Byte = 8
    //null
    var nombre: String? = null

    //Funciones
    fun readLine(message: String, message2: String){
        println(message + " " + message2)
    }
    //Funciones con regreso de valores
    fun mySum(num1: Int, num2: Int): Int{
        return  num1 + num2;
    }
    fun myRes(num1: Int, num2: Int): Int{
        return  num1 - num2;
    }
    fun isValid(valid: Boolean): Boolean{
        return valid
    }
    //Unit equivalente a void
    fun unitFun(): Unit{
        println("Unit = Void")
        //Funcion dentro de otra
        fun inside(){
            println("Funcion dentro")
        }
        inside()
    }
    //Parametros por fedecto
    fun mySum(num1: Int, num2: Int = 5, num3: Int = 10): Int{
        return num1 + num2 + num3
    }
    //Funciones miembro
    fun funcionMiembro(){
        var dato: String = "jose"
        println(dato.capitalize())
    }
    //Funcion de expresion simple
    fun square(numero: Int) = numero * numero
    //VarArgs n cantidad de parametros
    fun cadenas(vararg datos: String){
        for (cadena in datos)
            println(cadena)
    }
    //Funciones genericas trabajar con el tipo de dato que sea
    fun <T>numeros(t: T){
        println(t)
    }

    var sum = mySum(5 , 2)
    var res = myRes(8, 1)
}
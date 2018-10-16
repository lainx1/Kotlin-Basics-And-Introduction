class Libro (autor: String, paginas: Int, editorial: String){
    var autor: String = ""
    var paginas: Int = 0
    var editorial: String = ""


    //Constructor secundario
    constructor(autor: String, paginas: Int): this(autor, paginas, editorial = ""){
        println("$autor y paginas: $paginas")
    }

    //Codigo que se ejecuta al crear un objeto
    //Bloque de inicializacion
    init {
        println(paginas)
    }

    fun prestar(){
        println("Libro en prestamo")
    }
}
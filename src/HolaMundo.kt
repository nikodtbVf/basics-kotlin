import java.lang.NullPointerException

val n = 4

fun main(args: Array<String>) {
   /*
    println("Hello, world!")

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    println(n)*/



    val name = "Nico"
    val lastName = "Villegas"

    println("Tu nombre es: $name $lastName")

    //raw string
    val parrafo = """
        ** Lorem Ipsum is simply dummy text of the printing and typesetting industry.
        ** Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
        when an unknown printer took a galley of type and scrambled it to make a type 
        specimen book. It has survived not only five centuries, but also the leap
        into electronic typesetting, remaining essentially unchanged.
    """.trimIndent()

    println(parrafo.trimMargin("** "))


    val numero = 20
    if (numero.equals(2)) {
        println("Son iguales")
    } else {
        println("No son iguales")
    }

    when(numero) {
        in 1..5 -> println("rango 1 al 5")
        in 1..3 -> println("rango 1 al 3")
        else -> println("ningún rango")
    }

    var i = 1
    // while contadores

    while (i < 10) {
        println("msj $i")
        i++
    }


    i = 1
    do {
        println("msj $i")
    } while (i < 10)


    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")

    for((index,day) in daysOfWeek.withIndex()){
        println("$index :$day")
    }

    daysOfWeek.forEach{
        println(it)
    }

    try {

    } catch (e: NullPointerException) {
        println("PRINT")
    }
    // LLAMADA SEGURA
    var compute: String?  = null
    var longitud : Int? = compute?.length

    //Operador Elvis
    var teclado: String? = null
    var longitudTeclado =  teclado?.length ?: 0
    println("longitud teclado: $longitudTeclado")


    val listWithNull: List<Int?> = listOf(7, null, null, 4)
    println("Lista with null ${listWithNull}")

    val listWithoutNulls: List<Int> = listWithNull.filterNotNull()
    println(listWithoutNulls)


}



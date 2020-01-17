const val EXIT_OPTION = 3
val INGREDIENTS = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

fun main(args: Array<String>) {

 
    val selectedOption = 0;
    var recipes: ArrayList<Recipe> = arrayListOf()
    var readOption: String?
    var recipeName: String?
    var selectedIngredients = mutableListOf<String>()

    while (selectedOption != EXIT_OPTION) {
        showMenu()
        readOption = readLine()

        when(readOption) {
            "1" -> recipes.add(makeRecipe())
            "2" -> showRecipes(recipes)
            else -> println("Invalid Optión. Try Again.")
        }
    }
}

fun showMenu() {
    val initText = """:: Bienvenido a Recipe Maker ::
        
            Selecciona la opción deseada
            1. Hacer una receta 
            2. Ver mis recetas
            3. Salir
            
            Seleccione una opción;
            """.trimIndent()

    println(initText)
}

const val EXIT_OPTION = 3
val INGREDIENTS = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

fun main(args: Array<String>) {

 
    var addingRecipes = true;
    val recipes: ArrayList<Recipe> = arrayListOf()
    var readOption: String? = ""

    while (readOption != "3") {
        showMenu()
        readOption = readLine()

        when(readOption) {
            "1" -> recipes.add(makeRecipe())
            "2" -> showRecipes(recipes)
            "3" -> println("Thank you. Bye")
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

fun makeRecipe() : Recipe {
    var addMoreIngredients = true
    var response: String?
    val recipe = Recipe()
    recipe.name = readRecipeName()

    while(addMoreIngredients) {
        showIngredients()
        println("Please select an Ingredient to add")
        response = readLine()
        var selectedIngredient: Int? = response?.toIntOrNull()

        if (response?.toIntOrNull()?.compareTo(0) == 0){
            addMoreIngredients = false
        } else {
            recipe.addIngredient(INGREDIENTS[selectedIngredient!!])
        }
    }
    return recipe
}

fun readRecipeName() : String? {
    println("Ingresa el nombre de la receta")
    return readLine()
}

fun showIngredients() {
    for((index, ingredient) in INGREDIENTS.withIndex()){
        println("($index+1)- :$ingredient")
    }
    println("0-Finish Recipe")
}

fun showRecipes(recipes : ArrayList<Recipe>) {
    for(recipe in recipes) {
        recipe.printData()
    }
}
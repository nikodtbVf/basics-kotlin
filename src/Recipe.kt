class Recipe(
    var name: String? = null,
    var ingredients: ArrayList<String?> = arrayListOf()
) {


    fun addIngredient(ingredient: String?) {
        ingredients.add(ingredient)
    }

    fun printData() {
        println("Name: $name")
        println("Ingredients: ")

        for ((ingredient, index) in ingredients.withIndex()) {
            println("$index - $ingredient")
        }
    }
}
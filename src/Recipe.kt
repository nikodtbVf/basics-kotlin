class Recipe(
    var name: String? = null,
    var ingredients: ArrayList<String?> = arrayListOf()
) {


    fun addIngredient(ingredient: String?) {
        ingredients.add(ingredient)
    }
}
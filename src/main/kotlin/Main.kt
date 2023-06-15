fun main() {
//    quiz1
    var story=Story(200, listOf("learn well","Be kind","obedience"),12,"English")
story.tellStory("The little Giant")
    var storyTeller=StoryTeller("James",35)
    storyTeller.makeStories()
    var  translator=Translator("Khosa")
    translator.translate()

//quiz2
    var recipe=Recipe(listOf("onions","tomatoes","garlic"),"2ours","boiling",
        "vitamin A")
    recipe.recipe()
    var moroccan=MorocconRecipe("cheese","sour")
    moroccan.moroccan()
    var ethipian=EthiopianRecipe("Injera",)
    ethipian.ethiopian()
    var nigerian=NigerianRecipe("fufu")
    nigerian.nigerian()




}
//quiz1
//**Ancestral Stories:** In many African cultures, the art of storytelling is passed
//down from generation to generation. Imagine you're creating an application that
//records these oral stories and translates them into different languages. The
//stories vary by length, moral lessons, and the age group they are intended for.
//Think about how you would model `Story`, `StoryTeller`, and `Translator`
//objects, and how inheritance might come into play if there are different types of
//stories or storytellers.

//input:length,moral lessons,age_group.
//# process:create diffrent classes for story,story_teller and Translator
//# create attributes  and methods for each class
//# output:languages traslated to,different translators,stories



open class Story(var length:Int, var moralLessons:List<String>,var agegroup:Int,language:String):Translator(language){
    fun tellStory(name:String){
        println("The $name was translated to $language")
    }

}
open class  StoryTeller(var name:String,var Age:Int){
    fun makeStories(){
        println("$name tells his stories really well")
    }

}
open class Translator(var language:String){
    fun translate(){
        println("The story was translated to $language")
    }

}
//quiz2
//**African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.

//input:ingredients,preparation time,cooking method,nutritional information
//process :create classes,create subclasses,create methods
//output:different recipes
class Recipe(var ingredients:List<String>,var preparationTime:String,var cookingMethod:String,var
nutritionalValue:String){
    fun recipe(){
        println("The American Cuisine is cooked for $preparationTime")
    }
}
class MorocconRecipe(var name:String,var taste:String){
    fun moroccan(){
        println("The $name tastes $taste")
    }
}
class EthiopianRecipe(var type:String){
    fun ethiopian(){
        println("The $type is made from flour")
    }

}
class NigerianRecipe(var type:String ){
    fun nigerian(){
        println("The $type is made from cassava")
    }
}
//quiz6
//Implement a class called Student with attributes for name, age, and grades (a
//list of integers). Include methods to calculate the average grade, display the
//student information, and determine if the student has passed (average grade >=
//60). Create objects for the Student class and demonstrate the usage of these
//methods.
 class Student



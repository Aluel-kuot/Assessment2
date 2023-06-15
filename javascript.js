// # **Ancestral Stories:** In many African cultures, the art of storytelling is passed
// # down from generation to generation. Imagine you're creating an application that
// # records these oral stories and translates them into different languages. The
// # stories vary by length, moral lessons, and the age group they are intended for.
// # Think about how you would model `Story`, `StoryTeller`, and `Translator`
// # objects, and how inheritance might come into play if there are different types of
// # stories or storytellers.

// # input:length,moral lessons,age_group.
// # process:create diffrent classes for story,story_teller and Translator
// # create attributes  and methods for each class 
// # output:languages traslated to,different translators,stories

class Story{
    constructor(name,length,ageGroup,moralLesson){
     this .name=name
     this.length=length
     this.ageGroup=ageGroup
     this.moralLesson=moralLesson
    }

}
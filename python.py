# **Ancestral Stories:** In many African cultures, the art of storytelling is passed
# down from generation to generation. Imagine you're creating an application that
# records these oral stories and translates them into different languages. The
# stories vary by length, moral lessons, and the age group they are intended for.
# Think about how you would model `Story`, `StoryTeller`, and `Translator`
# objects, and how inheritance might come into play if there are different types of
# stories or storytellers.

# input:length,moral lessons,age_group.
# process:create diffrent classes for story,story_teller and Translator
# create attributes  and methods for each class 
# output:languages traslated to,different translators,stories




class Story:
    def __init__(self,name,length,age_group,moral_lesson):
        self.name=name
        self.length=length
        self.age_group=age_group
        self.moral_lesson=moral_lesson

    def tell_story(self):
        return f"(The {self.name} has {self.length})"   
story1=Story(name="Coming Home",length="170 pages",age_group=13,moral_lesson="Kindness")

class StoryTeller:
    def __init__(self,name,age):
        self.name=name
        self.age=age

    def teller(self):
       return f"(The {self.name} is {self.age} old)"   
person1=StoryTeller(name="Alice",age=20)
   
class Translator:
    def __init__(self,language):
        self.language=language
    def translate(self):
         return f"(It was translated to {self.language})"   
language1=Translator(language="English")
   

              
                


    
    
        
          

        

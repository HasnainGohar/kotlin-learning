// classes in kotlin


/**
 * basic example of class in kotlin
 */
class person(val name:String,val age:Int)   {
    fun introduceYourself(){
        println("My name is $name and I am $age years old")
    }   
}

/*
how to add methods in class
*/

class rectangle(val length:Double,val width:Double){

    //property
    val area:Double
    get() = length*width

    //method 
    fun perameter():Double{
        return 2*( length*width)
    }
}


/**
 *  Constructor 
 */

 class Cylinder(val radius:Double,val height:Double){
  constructor (radius:Double):this(radius,1.0)  
  fun volume():Double{
    return Math.PI * radius * radius * height   
  }
}

/**
 *  Iheritance
 */

 // base class
 open class Animal(val name:String){
    open fun makeSound(){
        println("$name makes a sound")
    }
 }

 // derived class
 class Dog(name:String):Animal(name){
    override fun makeSound(){
        println("$name barks")
    }
 }


 // INTERFACE

 interface Shape{
     fun draw()
 }
 

 class Triangle:Shape{
    override fun draw() {
        println("Drawing a triangle")
    }
 }




 // Data classes

 data class User(val name:String,val email:String){
    fun displayInfo(){
        println("Name: $name")
        println("Email: $email")
    }
 }




fun main(){
    // val person1 = person("John", 30)
    // person1.introduceYourself()

    // val rectangle1 = rectangle(10.0,20.0)
    // println("Area of rectangle is ${rectangle1.area}")
    // println("Perameter of rectangle is ${rectangle1.perameter()}")

    // val cylinder1 = Cylinder(5.0)
    // println("Volume of cylinder is ${cylinder1.volume()}")

    // val dog1 = Dog("abc")
    // dog1.makeSound()
    // val dog2 = Animal("Max")
    // dog2.makeSound()

    val triangle1 = Triangle()
    triangle1.draw()

    val user1 = User("John","D2B0K@example.com")
    user1.displayInfo()

}



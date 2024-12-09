
/*
we can assign the data type to the variable
by defult the data type is inferred from the value assigned to the variable
and assign the value to the variable will be update according to its data type 
string cannot be reasigned to int and vice versa

*/

/**
 * 
fun main(){
    var a:Int = 10
    var b:Long = 10000L
    var c :Float = 10.0f
    var d :Double = 10.0
    var f:Char = 'a'
    var g:Boolean = true
    var stringLiteral:String = "hello world"
    println("a : $a, b : $b, c : $c, d : $d, f : $f, g : $g, stringLiteral : $stringLiteral")
}
 */


/**
 *  Switch Case in kotlin in litttle different from javascript
 * here it work like that
 */

 fun main(){
    var a = 2
  val day =  when(a){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(day)
}
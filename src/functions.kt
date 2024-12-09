// functions

fun main(){
    /**
     * Adds two integers and returns the result
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of a and b
     */
    fun sum(a:Int,b:Int):Int{
        return a+b
    }
    println(sum(2,10))

/*
this is call lamda functions
the arrow opreater and curly brakets are the lamda in kotlin
*/

    val addtion:(Int,Int)->Int={a,b->a+b}
    println(addtion(0,0))


    /*
    Annonumous functions are functions that don't have a name
    */

    val multiply = fun(a:Int,b:Int):Int{
        return a*b
    }
    println(multiply(2,10))


}
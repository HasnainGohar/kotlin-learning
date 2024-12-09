// Loops



fun main(){

    /**
 * 1. for loop
 * in kotlin for loop is similar to for loop in java
 */

    for(i in 1..10){
        println(i)
    }

    /* 2. for loop with step
    * in kotlin for loop with step work like the cuts for example we want to skip some number in loops 
    * just pas the steps parameter and it will skip the number
    * step-1 will skiped from the loop 
    */

    for(i in 1..10 step 2){
        println(i)
    }


    /* 3. for loop with downTostep */


    for(i in 10 downTo -5){
        println(i)
    }


    /* 4. while loop
    * while loop is similar to while loop in java
    * in kotlin we can use while loop with condition
    */
     var counter =0
      while(counter<=10){
       println("Counter is: $counter")
        counter++
      }
}
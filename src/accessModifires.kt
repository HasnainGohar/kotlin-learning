class PublicClass{
   
        val publicVar:Int = 10
        private val privateVar :Int= 20
        fun showPrivateVar(){
            println(privateVar)
        }
    
}


internal class InternalClass{
    val internalVar :Int = 30
}



fun main(){
    val publicClass = PublicClass()
println(publicClass.publicVar)
// println(publicClass.privateVar)
publicClass.showPrivateVar()
}
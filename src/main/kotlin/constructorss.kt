class Animal(var name:String,var breed:String,var color:String,var age:Int,var size:String){

    fun eat(feed:String){
        println(feed)
    }
    fun sleep(rest:String){
        println(rest)
    }
    fun sit(lay:String){
        println(lay)
    }

}
fun main(){
    var dog1=Animal("boskoo","chiwawa","brown",3,"large")
    var dog2=Animal("chuma","jeshi","white",4,"medium")
    var dog3=Animal("doggie","kdf","black",5,"small")
    println(dog1.breed)
    println(dog2.breed)
    println(dog3.breed)
}
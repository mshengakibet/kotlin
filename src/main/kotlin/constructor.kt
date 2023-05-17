class Dog(var name:String,var breed:String,var color:String,var age:Int,var weight:Int){

    fun speak(){
        println("barking")
    }
}
fun main(){
    var dog1=Dog("tito","chiwawa","white",2,3)
    var dog2=Dog("billy","kie","brown",2,3)
    println(dog1.name)


}
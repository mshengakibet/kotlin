class person{
    //properties/variables/data members/attributes
    var name:String="japhe"
    var age:Int=19
    var location:String="westlands"
    var height:Double=6.0


    //methods/functions

    fun eat(){
        println("eating")
    }
    fun walk(){
        println("walking")
    }

}
fun main(){
    var teacher=person()
    teacher.walk()
    println(teacher.age.toString()+" "+teacher.height.toString()+" "+teacher.location+" "+teacher.name)

}
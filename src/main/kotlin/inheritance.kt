//parent class

open class animal {

    var age=12
    var gender="female"

    fun ismammal(){
        println("its a mammal")
    }
}
//child class/sub classes
class  duck:animal(){
    var color="white"
    fun swim(){
        println("swimming")
    }
}
class fish:animal(){
    var caneat=true
    fun swim(){
        println("swimming")
    }
}
class horse:animal(){
    var caneat=true
    fun run(){
        println("running")
    }
}
fun main(){
    var d=duck()
    println(d.color)


    var f=fish()
    var h=horse()
}
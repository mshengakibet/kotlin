class car{
    var make:String="japanese"
    var model:String="toyota model"
    var color:String="white"
    var drivingspeed:Int=180


    fun drive(){
        println("automatic")
    }
    fun turn(){
        println("90")
    }
    fun stop(){
        println("at 0 speed")
    }
}
fun main(){
    var vehicle1=car()
    println(vehicle1.color)

}

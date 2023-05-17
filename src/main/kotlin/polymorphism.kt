//parent class
open class  shape{
    open fun draw(){
        println("drawing")
    }
}
//child class
class rectangle:shape(){
    override fun draw() {
        println("draw a rectangle")
    }
}
class square:shape(){
    override fun draw(){
        println("draw a square")
    }
}
fun main(){
    var r=rectangle()
    r.draw()

    var s=square()
    s.draw()
}
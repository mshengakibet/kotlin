open class figure{
    var start="find measurements"
    open fun area(){
        println("find the area")


    }
    open fun perimeter(){
        println("find the perimeter")
    }
     open fun draw(){
        println("draw the figure")
    }

}
class Cuboid:figure(){
    var  radius=21
    val pi=3.14
     override fun area(){
        println(pi*radius*radius)
    }
     override fun perimeter(){
        println(pi*radius*2)
    }
     override fun draw(){
        println("draw the circl")
    }
}
open class Rhombus:figure(){
    var width=30
    var height=20
     override fun area(){
        println(height*width)
    }
     override fun perimeter(){
        println(2*(height+width))
    }
    override fun draw(){
        println("draw the Rectangle")
    }
}
class Square:Rhombus(){


}
fun main(){
    var c=Rhombus()
    c.area()
    c.perimeter()

    var r=Cuboid()
    r.perimeter()
    r.area()



}
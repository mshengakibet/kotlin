open class shapee{
    open fun area(){
        println("its area")


    }
}
class circle:shapee(){
    override fun area(){
        println("area of the circle")
    }
}
class triangle:shapee(){
    override fun area(){
        println("area of triangle")
    }
}
class rec2tangle:shapee(){
    override fun area(){
        println("area of rectangle")
    }


}
fun main(){
    var r=rec2tangle()
    r.area()

    var t=triangle()
    t.area()

    var c=circle()
    c.area()







}
import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("enter the radius")
    var radius=read.nextInt()
    var pi=3.14

    var area=pi*radius*radius
    var y=area.toInt()
    println(y)


    println("enter the length")
    var length=read.nextInt()
    println(length)
    println("enter the width")
    var width=read.nextInt()
    println(width)

    var perimeter=2*(length+width)
    println(perimeter)

}
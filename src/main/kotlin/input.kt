import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)
    println("Enter your name:")
    var name= readln()
    println("my name is $name")
    println("Enter your age:")
    var age=read.nextInt()
    println("i am $age years old")
    println("Enter a float")
    var number=read.nextFloat()
    println("the number entered is $number")

}
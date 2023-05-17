import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("enter the number")
    var number=read.nextDouble()
    println(number)

    if (number<0){
        println("the number is negative")
    }
    else if (number>0){
        println("the number is positive")
    }
    else{
        println("the positive number")
    }

}
import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("enter the firstnumber")
    var firstnumber=read.nextFloat()
    println(firstnumber)

    println("enter the secondnumber")
    var secondnumber=read.nextFloat()
    println(secondnumber)
    var resu=firstnumber/secondnumber
    println(resu)

    var re=firstnumber%secondnumber
    println(re)

}
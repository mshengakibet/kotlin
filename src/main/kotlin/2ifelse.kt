import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("enter the firstnumber")
    var fnumber=read.nextDouble()
    println(fnumber)

    println("enter the secondnumber")
    var snumber=read.nextDouble()
    println(snumber)


    println("enter the thirdnumber")
    var tnumber=read.nextDouble()
    println(fnumber)





    if (fnumber>snumber&&fnumber>tnumber){
        println("$fnumber is the greatest")
    }
    else if (snumber>fnumber&&snumber>tnumber){
        println("$snumber is the greatest")

    }
    else{
        println("$snumber is the greatest")
    }
}

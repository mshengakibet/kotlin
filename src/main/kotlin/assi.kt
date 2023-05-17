import java.util.Scanner
fun main(args:Array<String>){
    val Scanner=Scanner(System.`in`)

    println("enter the vowel")
    val c=Scanner.next()[0]


    when (c) {
        'a','e','i','o','u','A','E','I','O','U' -> println("the given character $c is vowel")
        else-> println("the given character $c is consonant")
    }
}
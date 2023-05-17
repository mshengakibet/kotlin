import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)
    println("enter the letter")
    var letter = reader.next().single()

    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
        println("$letter is vowel")


    else{
        println("$letter is a consonant")
    }

}

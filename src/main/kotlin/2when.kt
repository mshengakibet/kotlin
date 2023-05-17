fun main(){
    var numbers=4

    var result=when (numbers){

        1->"plus"
        -2->"negative"
        -3->"negative"
        4->"plus"
        5->"plus"
        else->"invalid number"

    }
    println("number is $result")
}
fun main(){
    var number=5

    var results=when (number){
        1->"one"
        2->"two"
        3->"three"
        4->"four"
        5->"five"
        else->"invalid number"
    }
    println("number is $results")
}
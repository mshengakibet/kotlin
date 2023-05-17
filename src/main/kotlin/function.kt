fun main(){
    //predefined functions
    println("hello mshenga")

    var squareroot=Math.sqrt(256.0)
    println(squareroot)

    var roundoff=Math.round(34.5)
    println(roundoff)
    myFun()
    mshenga()
    details("denno",  19 )
    details("victor", 23 )
    details("brian",  25 )

}
//user.defined functions
fun myFun(){
    println("today is friday")
}
fun mshenga(){
    var num2=5
    var num3=2
    println(num2+num3)
}
fun details(name:String,age:Int){
    var name="japhet"
    var age=20
    println("$name is $age years old")
}











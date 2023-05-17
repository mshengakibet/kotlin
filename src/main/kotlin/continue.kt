fun main(){
    var number=1

    while (number<=10){
        println(number)
        number++

        if (number==8){
            number++

            continue
        }
        println(number)
        number++
    }
}
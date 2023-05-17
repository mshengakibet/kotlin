fun main(){
    var language= arrayOf("python","kotlin","javascript")
    println(language [1] )
    language[1]="c++"
    println(language [1])

    var lang=language.plus("laravel")
    for (x in lang){
        println(x)

        println(language.size)
        println(lang.size)



    }


}
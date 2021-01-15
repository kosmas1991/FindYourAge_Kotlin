fun main(args:Array<String>){
    var name = "Kosmas"
    when(name) {
        "Kosmas" -> {
            println("se lene kosma")}
        "litsa" -> {
            println("se lene litsa")}
        "john" -> {
            println("se lene john")
        }
        else -> {
            println("de kserw pws se lene")
        }
    }
    var age = 101
    when(age) {
        24 -> {
            println("eisai 24 xronwn")
        }
        30 -> {
            println("eisai 30 xronwn")
        }
        in 50..60 -> {
            println("eisai 50-60")
        }
        !in 1..100 -> {
            println("de kserw ti kaneis .. . .? ?  ? /")
        }

    }
    var age2 = if (age==101) age else -1
    println("age2: $age2")
    var age3 = when(age) {
        101 -> {
            println("to age eiani 101")
        }
        else -> {
            println("dont know")
        }
    }
}
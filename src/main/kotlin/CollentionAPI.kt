fun main(args:Array<String>){
    var set = mutableSetOf<Int>(1,2,3,4,5,6)
    set.add(77)
    for(i in set){
        println(i)
    }

    var unmutableSet = setOf(9,8,7,6,5,4,3,2,2,2)
    //unmutableSet.add
    for(i in unmutableSet){
        println(i)
    }
}
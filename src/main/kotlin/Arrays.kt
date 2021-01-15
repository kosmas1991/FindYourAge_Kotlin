fun main(args:Array<String>){
    var myArrayOfNames = Array<String>(3){""}
    println("give me the names")
    for (i in 0..myArrayOfNames.size-1){
        myArrayOfNames[i] = readLine()!!
    }
    for(i in 0..myArrayOfNames.size-1){
        println("myArrayOfNames[$i] = " + myArrayOfNames[i])
    }
    var indexNo2:Array<String> = Array(5){"kog";"lia";"dfd";"dfdf";"dfdf"}
    println("IndexNo2[3] = ${indexNo2[2]}" )
}
fun main(args:Array<String>){
    dispaySomething("Hello big brother")
    println(addTwoNumbers(2.33,4.55))
}

fun dispaySomething(daString:String):Unit {
    println(daString)
}

fun addTwoNumbers(n1:Double,n2:Double):Double{
    return n1+n2
}
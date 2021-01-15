import java.util.*

fun main(args:Array<String>){
    println("Hello, enter your name")
    var name = readLine()
    println("Enter your year of birth, ex. 1991")
    var dateOfBirth = readLine()!!.toInt()
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentYear - dateOfBirth
    println("I ilikia sou einai $age")
}
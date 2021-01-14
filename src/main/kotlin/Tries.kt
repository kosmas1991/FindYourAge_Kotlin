import java.net.Socket
import java.util.*

fun main(args:Array<String>){
    println("Hello, enter your name")
    var name = readLine()
    println("Enter your year of birth, ex. 1991")
    var date_Of_Birth = readLine()!!.toInt()
    var current_Year = Calendar.getInstance().get(Calendar.YEAR)
    var age = current_Year - date_Of_Birth
    println("I ilikia sou einai $age")
}
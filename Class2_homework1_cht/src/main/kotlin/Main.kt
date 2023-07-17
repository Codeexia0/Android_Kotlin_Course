import java.sql.DriverManager.println
import java.util.Scanner

val scanner = Scanner(System.`in`)


fun main() {
    greet(assistantName = "Chatty bot", birthyear = "2023")
    remindName()
    guessAge()
    //count()
    //test()
    //end()
}

fun greet(assistantName : String ,birthyear : String){
    println("Hello! My name is $assistantName. \nI was created in $birthyear")
}

fun remindName(){
    println("Please, remind me your name.")
    val userName = scanner.next()
    println("What a great name you have, $userName!")
}

fun guessAge(){
    println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()

    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}


fun reverseOrder(){
    println("Enter the number to be reversed:")
    var number = scanner.nextInt()
    var reversedNumber = 0
    while (number != 0) {
        println(number.toString())
        val digit = number % 10
        println(digit.toString())
        reversedNumber = reversedNumber * 10 + digit
        println(reversedNumber.toString())
        number /= 10
    }

    println(reversedNumber.toString())
}
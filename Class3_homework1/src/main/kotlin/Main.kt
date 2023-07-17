
import java.util.Scanner

val scanner = Scanner(System.`in`)


fun main() {
//    greet(assistantName = "Chatty bot", birthyear = "2023")
//    remindName()
//    guessAge()
    //reverseOrder()
    count()
    //test()

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
        //println(number)
        val digit = number % 10
       //println(digit.toString())
        reversedNumber = reversedNumber * 10 + digit
        //println(reversedNumber)
        number /= 10
    }

    println(reversedNumber)
}

fun test(){
    val question = "Which sea creature has three hearts?"
    val options = listOf("Shark", "Octopus", "Jellyfish", "Stingray")
    val correctOption = 1 //Octopus

    println(question)
    for (i in options.indices) {
        println("$i. ${options[i]}")
    }


    var selectedOption: Int? = null
    while (selectedOption == null) {
        print("Enter your answer by option number: ")
        val userInput = scanner.nextInt()
        if (userInput !in 0..3) {
            println("Invalid input. Please enter a valid option number.")
        } else {
            selectedOption = userInput
        }
    }
    if (selectedOption == correctOption) {
        println("Correct answer! Congrats")
    } else {
        println("Wrong answer. The correct answer is ${options[correctOption]}.")
    }
}

fun count() {
    println("Enter the countdown number:")
    var number = scanner.nextInt()

    while (number >= 0) {
        println(number)
        number--
    }
}
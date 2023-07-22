import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    pyramid()
}

fun pyramid(){
    println("Enter the height of the pyramid:")
    val Pheight = scanner.nextInt()
    if (Pheight > 0) {
        for (i in 1..Pheight) {
            for (j in 1..Pheight - i) { //distance from left in spaces
                print(" ")
            }
            for (j in 1..i) { //number of starts
                print("* ")
            }
            println()
        }
    } else {
        println("Invalid input. Please enter an integer for the height.")
    }

}
fun main() {
    //----1
   // birthdayGreeting()
    //-----2
//    val greeting = birthdayGreeting()
//    println(greeting)
    //--3
//    val greeting = birthdayGreeting("Rover")
//    println(greeting)
//    println(birthdayGreeting("Rover"))
    //--4
   // println(birthdayGreeting("Rover", 5))
    //println(birthdayGreeting(name = "Rover",age = 5)) // same as above
//--5
    println(birthdayGreeting(age = 5))
}
//----1
//fun birthdayGreeting() { //fun birthdayGreeting() : Unit { which like void
//    println("Happy Birthday, Rover!")
//    println("You are now 5 years old!")
//}
//----2
//fun birthdayGreeting() : String {
//    val nameGreeting = "Happy Birthday, Rover"
//    val ageGreeting = "You are now 5 years old!"
//
//    return "$nameGreeting\n$ageGreeting"
//}
//-----3
//fun birthdayGreeting(name : String) : String {
//    val nameGreeting = "Happy Birthday, $name"
//    val ageGreeting = "You are now 5 years old!"
//
//    return "$nameGreeting\n$ageGreeting"
//}
//----4
//fun birthdayGreeting(name : String, age : Int) : String {
//    val nameGreeting = "Happy Birthday, $name"
//    val ageGreeting = "You are now $age years old!"
//
//    return "$nameGreeting\n$ageGreeting"
//}

//--5 // default name
fun birthdayGreeting(name : String = "Rover", age : Int) : String {
    val nameGreeting = "Happy Birthday, $name"
    val ageGreeting = "You are now $age years old!"

    return "$nameGreeting\n$ageGreeting"
}
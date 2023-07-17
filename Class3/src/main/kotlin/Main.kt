fun main() {
//    var a : String? = "abc" // we put "?" end of the string
//
//    a = null
//
//    var L = a!!.length
//
////    println(a?.length)
//    println(L)
//    ------------------------------


//    val num = arrayOf(1,2,3,4)
//    val num1 = arrayOf<Int>(1,2,3,4)
//    val str = arrayOf("a","v","c","d")
//    num[2] = 9
//    println(num[2])
//    println(num.size)


//    val num2 = listOf(1,2,3,4) //immuteable
//    num2[2] = 9
//    println(num2[2]) //error
//    val num2 = mutableListOf(1,2,3,4) //immuteable
//    num2[2] = 9
//    println(num2[2]) //error
//
//    num2.add(5)
//    println(num2[4])
//
//    num2.add(2,8) //change num2[2] into 8
//    println(num2[2])

//    num2.removeAt(3) //both of them are same
//    num2.remove(4)// same^
//
//    println(num2[2])

//    num2.replaceAll{8}

//    num2.sort()
//    num2.binarySearch(3)
//
//    println(num2.binarySearch(3))


    //----------------------------if condition---------------------//

//    println(1 == 1) // output:true
//    println(1 < 1) // output:false

    val trafficlightColor = "Black"

//    if(trafficlightColor == "Red") {
//        println("Stop")
//    } else if(trafficlightColor == "Yellow"){
//        println("Slow")
//    } else if(trafficlightColor == "Green") {
//        println("Go")
//    } else{
//        println("Invalid traffic-light color")
//    }

    //we can use when() for diff cases

//    when(trafficlightColor){
//        "Red" -> println("Stop")
//        "Yellow" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")

//    val x = 4
//
//    when(x) {
//
////        2 -> println("x is a prime number")
////        3 -> println("x is a prime number")
////        5 -> println("x is a prime number")
////        7 -> println("x is a prime number")
////        instead of using like that we can use like that:
//        2,3,5,7-> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        is Int ->
//        else -> println("x is not a prime number between 1 and 10")
//
//    }
//
    // we can use like that also
//      val message = if(trafficlightColor == "Red") "Stop"
//     else if(trafficlightColor == "Yellow")"Slow"
//     else if(trafficlightColor == "Green") "Go"
//     else "Invalid traffic-light color"

//        val message = when(trafficlightColor){
//        "Red" -> "Stop"
//        "Yellow" -> "Slow"
//        "Green" -> "Go"
//        else -> {
//            "Invalid traffic-light color"
//        }

    //------------for while ------------------

//    for(i in 1..5){
//        print(i) //it will print 12345
//    }
//    for(i in 5 downTo 0){
//        print(i) //it will print 543210
//    }
//    for(i in 16 downTo 1 step 2){
//        println(i) //it will print 16 14 12 10 8 6 4 2
//    }


//    var y = 5
//    while(y > 0){
//        y--
//        println(y) // it will print 5 4 3 2 1 0
//    }


//    do{
//        //
//    }while(y != null)


    //homework 12345 at the end it should give us 54321 use if while for
    //count() 0 to 8 : 0!   1!   2!  3!  4!  5!  6!  8!
    //test() ask a quetion 4 answers and if the answer is correct then congrats if wrong then



        var number = 12345
        var reversedNumber = 0

        while (number != 0) {
            println(number)
            val digit = number % 10
            println(digit)
            reversedNumber = reversedNumber * 10 + digit
            println(reversedNumber)
            number /= 10
        }

        println(reversedNumber)




}
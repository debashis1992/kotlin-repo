fun main(args:Array<String>) {
    println("Your fortune is: ${ getFortuneCookie(getBirthday()) }")
//    getFinalFortuneCookie()
}

fun getFortuneCookie(birthday: Int) : String {
    val fortunes: List<String> = listOf<String>("You will have a great day!",
    "Things will go well for you today.","Enjoy a wonderful day of success","Be humble and all will turn out well",
    "Today is a good day for exercising restraint.","Take it easy and enjoy life!",
    "Treasure your friends because they are your greatest fortune.")

    return when(birthday) {
        in 1..7 -> "You will have a great day"
        28, 31 -> "Things will go well for you today"
        else -> fortunes[birthday.rem(fortunes.size)]
    }

}
//fun getFinalFortuneCookie() {
//    var res: String
//    for(i in 1..10) {
//        res = getFortuneCookie()
//        println("Got Fortune : ${ res }")
//        if(res.contains("Take it easy")) break
//    }
//}

fun getBirthday() : Int {
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}
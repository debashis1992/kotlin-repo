fun main(args: Array<String>) {
    if(args.isNotEmpty()) {
        val str:String = args[0];
        val hh: Int = str.split(":")[0].toInt();
        println("Good ${ if(hh<12) "morning" else "night"}, Kotlin")
    }
    else println("No input was passed in arguments list")
}
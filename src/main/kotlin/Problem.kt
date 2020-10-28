fun main(args: Array<String>) {
    print("Enter your mood: ")
    var mood = readLine() ?: "happy"
    println(whatShouldIDoToday(mood, "sunny", 24))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String{
    var goForWalk = goForWalk(mood, weather, temperature)
    var stayInBed = stayIBed(mood, weather, temperature)
    var goSwimming = goSwimming(mood, weather, temperature)

    return when {
        goForWalk -> "lets go for a walk"
        stayInBed -> "stay in bed"
        goSwimming -> "go swimming"
        else -> "stay home and read"
    }
}

fun goForWalk(mood: String, weather: String, temperature: Int) = mood == "happy" && weather == "sunny"

fun stayIBed(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun goSwimming(mood: String, weather: String, temperature: Int) = temperature > 35


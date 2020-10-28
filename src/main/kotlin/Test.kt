import java.util.*

fun main(args: Array<String>) {
    val rollDice = { Random().nextInt(12) }
    val rollDiceSides = { sides: Int -> Random().nextInt(12) }

    val rollDiceWithSidesFixed = { sides: Int -> {
        if(sides==0) 0
        else Random().nextInt(12)
    }}

    val rollDice2:(Int) -> Int = {sides ->
        if(sides==0) 0
        else Random().nextInt(12)
    }
}

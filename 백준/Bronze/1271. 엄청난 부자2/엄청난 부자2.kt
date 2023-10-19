import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var (a,b) = nextLine().split(' ').map { BigInteger(it) }
    println(a / b)
    println(a % b)
}
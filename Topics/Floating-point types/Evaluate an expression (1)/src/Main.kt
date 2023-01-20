import kotlin.math.pow

fun main() {
    // put your code here
    val x = readLine()!!.toDouble()

    val result = x * (x.pow(2) + x + 1) + 1

    print(result)
}
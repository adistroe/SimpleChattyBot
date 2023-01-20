fun main() {
    // put your code here
    val (a, b, n) = List(3) { readln().toInt() }
    print(
        (a..b).count { it % n == 0 }
    )
}
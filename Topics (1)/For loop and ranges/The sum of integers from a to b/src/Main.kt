fun main() {
    // put your code here
    val (a, b) = List(2) { readln().toInt() }
    var sum = 0
    for (num in a..b) {
        sum += num
    }
    print(sum)
}
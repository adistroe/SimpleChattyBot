fun main() {
    // write your code here
    val (leftFirstRange, rightFirstRange, leftSecondRange, rightSecondRange, num) =
            List(5) { readln().toInt() }
    val firstRange = leftFirstRange..rightFirstRange
    val secondRange = leftSecondRange..rightSecondRange
    print(num in firstRange || num in secondRange)
}
fun bubbleSort(unsortedList: MutableList<Int>): MutableList<Int> {
    val n = unsortedList.size
    var temp: Int
    for (i in 0..<n - 1) {
        for (j in 0..<n - i - 1) {
            if (unsortedList[j] > unsortedList[j + 1]) {
                //swap
                temp = unsortedList[j]
                unsortedList [j] = unsortedList[j + 1]
                unsortedList [j + 1] = temp
            }
        }
    }
    return unsortedList
}

fun main() {
    val unsortedList: MutableList<Int> = mutableListOf(3, 4, -3, 7, 12, 5)
    println (bubbleSort(unsortedList))
}
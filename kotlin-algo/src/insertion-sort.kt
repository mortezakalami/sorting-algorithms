fun main(){
    val unsortedList = mutableListOf(3,-7,6,3,9,2)
    println(
        insertionSort(unsortedList)
    )
}

fun insertionSort(unsortedList:MutableList<Int>):MutableList<Int>{
    val n = unsortedList.size
    for (i in 1..<n){
        val key = unsortedList[i]
        var j = i-1
        while (j >=0 && unsortedList[j] > key){
            unsortedList[j+1] = unsortedList[j]
            j -= 1
        }
        unsortedList[j+1] = key
    }
    return unsortedList
}
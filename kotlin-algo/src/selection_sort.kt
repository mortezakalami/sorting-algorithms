import kotlin.math.min

fun selectionSort(unsortedlist:MutableList<Int>):MutableList<Int>{
    val n = unsortedlist.size
    for (i in 0..<n-1){
        var minindex = i
        for (j in i+1..<n){
            if (unsortedlist[j] < unsortedlist[minindex]){
                minindex = j
            }
        }
        val temp = unsortedlist[i]
        unsortedlist[i]= unsortedlist[minindex]
        unsortedlist[minindex] = temp



    }
    return unsortedlist
}

fun main(){
    val unsortedlist = mutableListOf(3,2,9,-4,4,2)
    println(
        selectionSort(unsortedlist)
    )
}
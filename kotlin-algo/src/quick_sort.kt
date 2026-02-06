import java.util.Collections.swap

fun main(){
    var unsortedlist = mutableListOf(3,6,8,0,-4,-4,2,-4)
    println(
        quickSort(unsortedlist,0,unsortedlist.size-1)
    )
}
fun quickSort(unsortedlist:MutableList<Int>, firstindex:Int , lastindex:Int):MutableList<Int>{
    if (firstindex < lastindex){
        val q = partition(unsortedlist,firstindex,lastindex)
        quickSort(unsortedlist,firstindex,q-1)
        quickSort(unsortedlist,q+1,lastindex)
    }
    return unsortedlist
}

fun partition(unsortedlist:MutableList<Int>, firstindex:Int , lastindex:Int):Int{
    val pivot = unsortedlist[lastindex]
    var i = firstindex - 1
    var j = firstindex
    for (j in firstindex..<lastindex){
        if (unsortedlist[j] <= pivot){
            i++
            val temp = unsortedlist[j]
            unsortedlist[j] = unsortedlist[i]
            unsortedlist[i] = temp
        }
    }
    val temp = unsortedlist[i+1]
    unsortedlist[i+1] = unsortedlist[lastindex]
    unsortedlist[lastindex] = temp
    return i+1


}
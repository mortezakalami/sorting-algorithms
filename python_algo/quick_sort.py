def quickSort(unsortedlist:list[int] , firstindex:int , lastindex:int)->list[int]:
    if (firstindex < lastindex):
        q = partition(unsortedlist, firstindex, lastindex)
        quickSort(unsortedlist, firstindex , q-1)
        quickSort(unsortedlist, q+1 , lastindex)
    return unsortedlist



def partition(unsortedlist:list[int] , firstindex:int , lastindex:int)->int:
    pivot = unsortedlist[lastindex]
    i = firstindex - 1
    for j in range(firstindex , lastindex - 1):
        if unsortedlist[j] <= pivot:
            i += 1
            #swap
            temp = unsortedlist[i]
            unsortedlist[i] = unsortedlist[j]
            unsortedlist[j] = temp
    #swap pivot
    temp = unsortedlist[i+1]
    unsortedlist[i+1] = unsortedlist[lastindex]
    unsortedlist[lastindex] = temp

    return i+1

def main():
    unsortedlist = [5,7,3,-7,4,7,2]
    print(quickSort(unsortedlist , 0 , len(unsortedlist)-1))

main()
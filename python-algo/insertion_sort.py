def insertionSort(unsortedList:list)->list:
    n = len(unsortedList)
    for i in range(1,n):
        key = unsortedList[i]
        j = i-1
        while j>=0 and unsortedList[j] > key:
            unsortedList[j+1] = unsortedList[j]
            j = j - 1
        unsortedList[j+1] = key
    return unsortedList


def main():
    unsortedList = [5,2,7,1,9,-9,2]
    print(insertionSort(unsortedList))

main()
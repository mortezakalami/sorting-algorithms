def selection_sort(unsortedlist:list[int])->list[int]:
    n = len(unsortedlist)
    for i in range(0, n-1):
        minindex = i
        for j in range(i+1,n):
            if unsortedlist[j] < unsortedlist[minindex] :
                minindex = j
        temp = unsortedlist[i]
        unsortedlist[i] = unsortedlist[minindex]
        unsortedlist[minindex] = temp
    return unsortedlist

def main():
    unsortedlist = [1, 5, -2, 6, 7, 3, 8, 4]
    print(selection_sort(unsortedlist))

main()


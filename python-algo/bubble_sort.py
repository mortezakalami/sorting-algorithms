def bubbleSort(unsorted_list:list[int])->list[int]:
    n = len(unsorted_list)

    for i in range (0,n-1): 
        for j in range(0,n-1-i): 
            if unsorted_list[j] > unsorted_list[j+1]: 
                #swap 
                temp = unsorted_list[j+1] 
                unsorted_list[j+1] = unsorted_list[j] 
                unsorted_list[j] = temp 
    return unsorted_list 

def main(): 
    unsorted_list=[3,5,7,4,4,7,2] 
    print(bubbleSort(unsorted_list)) 

main()
#Sort An Array of 0s, 1s and 2s

def sortArray(arr, n):
    low, mid, high = 0, 0, n - 1
    
    while mid <= high:
        if arr[mid] == 0:
            arr[low], arr[mid] = arr[mid], arr[low]
            low += 1
            mid += 1
        elif arr[mid] == 1:
            mid += 1  
        else:  
            arr[mid], arr[high] = arr[high], arr[mid] 
            high -= 1

def main():
    n = int(input())  
    arr = list(map(int, input().split()))  
    
    sortArray(arr, n)
    
    print(" ".join(map(str, arr)))  

if __name__ == "__main__":
    main()

#Implement Lower Bound

def lowerBound(arr: [int], n: int, x: int) -> int:

    left, right = 0, n
    while left < right:
        mid = (left + right) // 2
        if arr[mid] >= x:
            right = mid
        else:
            left = mid + 1
    return left

def main():
    n = int(input())
    arr = list(map(int, input().split()))
    x = int(input())
    print(lowerBound(arr, n, x))

if __name__ == "__main__":
    main()

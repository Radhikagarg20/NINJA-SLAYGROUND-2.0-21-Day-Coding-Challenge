#Binary Search

def search(nums: [int], target: int):
    left, right = 0, len(nums) - 1
    
    while left <= right:
        mid = (left + right) // 2
        
        if nums[mid] == target:
            return mid  
        elif nums[mid] < target:
            left = mid + 1 
        else:
            right = mid - 1  
    
    return -1 

def main():
    n = int(input()) 
    nums = list(map(int, input().split()))  
    target = int(input()) 
    
    print(search(nums, target))

if __name__ == "__main__":
    main()

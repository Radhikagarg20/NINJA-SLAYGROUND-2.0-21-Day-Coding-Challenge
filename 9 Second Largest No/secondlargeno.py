#Second Largest Number

def getSecondOrderElements(n: int,  a: [int]) -> [int]:

    largest = second_largest = -float('inf')
    smallest = second_smallest = float('inf')

    for num in a:
        if num > largest:
            second_largest = largest
            largest = num
        elif num > second_largest and num != largest:
            second_largest = num
        
        if num < smallest:
            second_smallest = smallest
            smallest = num
        elif num < second_smallest and num != smallest:
            second_smallest = num

    pass
    
    second_largest = second_largest if second_largest != -float('inf') else -1
    second_smallest = second_smallest if second_smallest != float('inf') else -1

    return [second_largest, second_smallest]

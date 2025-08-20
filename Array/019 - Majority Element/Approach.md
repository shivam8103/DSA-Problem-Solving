# Brute Force (Sorting)
- Sort the array
- The element at the middle index will be the element which occur most number of times. 

### Time Complexity
- `O(nlogn)`

### Space Complexity
- `O(1)`

---

# Improved (Hashing)
- Create a hashmap, and store each value and their occurance. key = element, value = how many times it appeared.
- After storing select the value with highest no. of occurance.

### Time Complexity
- `O(n)` for traversing the array. 

### Space Complexity
- `O(n)`

---

# Optimal Appraoch (Boyer-Moore)
- Create 2 variables, `count` and `result`.
- `result` will store the possible answer, and count will help to decide the result. 
- If count is 0. Assign the current element to the result.
- If the current element is equal to the (possible)result increase the count by 1 
- If current element is different than the (possible)result decrease the count by 1. 
- This way we will get the possible result with highest count. 

### Time Complexity 
- `O(n)`

### Space Complexity 
- `O(1)`
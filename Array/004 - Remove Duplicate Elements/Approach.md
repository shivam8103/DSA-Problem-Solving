# Two-Pointer Approach


1. **Take two variables** `i` and `j`, both initialized to index `0`.

2. **Start traversing** the array using pointer `i`.

3. For each element:
   - If `arr[i] == arr[j]`  
     → Do nothing, just increment `i` to skip the duplicate.
   - If `arr[i] != arr[j]`  
     → Increment `j`  
     → Copy the new unique element: `arr[j] = arr[i]`

4. After the loop ends, `j + 1` will give the **count of unique elements**.

---

## ✅ Final Step

- Return `j + 1` as the **number of unique elements** in the array.
- The **first `j + 1` elements** of the array now contain all unique elements in order.

---


## ⏱️ Time & Space Complexity

| Metric           | Value       |
|------------------|-------------|
| Time Complexity  | `O(n)`      |
| Space Complexity | `O(1)`      |

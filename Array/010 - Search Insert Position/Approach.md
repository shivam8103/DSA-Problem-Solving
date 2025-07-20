# Approach 

## 🧠 Brute Force Approach
<details>

### Approach:
1. Traverse the array from left to right.
2. If the current element is equal to the target, return its index.
3. If the current element is greater than the target, return the current index.
4. If the loop ends without finding a suitable position, return the length of the array (insert at the end).

### ⏱ Time Complexity:
> **O(n)** - In the worst case, we may traverse the entire array.

### 💾Space Complexity: 
> **O(1)** - No extra space is used.
</details>
---

## 🚀 Optimal Approach (Binary Search)

<details>

### Approach:
1. Use binary search on the sorted array.
2. Initialize two pointers: `low = 0` and `high = nums.length - 1`.
3. While `low <= high`:
   - Compute `mid = (low + high) / 2`.
   - If `nums[mid] == target`, return `mid`.
   - If `nums[mid] < target`, move `low = mid + 1`.
   - If `nums[mid] > target`, move `high = mid - 1`.
4. If the loop ends without finding the target, return `low` as the insert position.

### ⏱ Time Complexity:
> **O(logn)** - Binary search reduces the search space by half at each step.

### 💾Space Complexity: 
> **O(1)** - No additional space is used.
</details>

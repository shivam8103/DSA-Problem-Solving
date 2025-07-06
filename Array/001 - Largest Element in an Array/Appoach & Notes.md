## 🥇 Approach 1: Brute Force

- Sort the array in ascending order.
- Return the last element of the sorted array (since it will be the largest).

### ⏱ Time Complexity:
- **O(n log n)** – Sorting an array takes `O(n log n)` time.

---

## 🥈 Approach 2: Optimal Solution

- Create a variable `largest` and initialize it with the first element of the array.
- Iterate through the array:
  - If any element is greater than `largest`, update it.
- Return `largest` at the end.

### ⏱ Time Complexity:
- **O(n)**

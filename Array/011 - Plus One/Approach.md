## Approach

1. Start from the last digit.
2. If the digit is less than 9, add 1 and return the array.
3. If the digit is 9, set it to 0 and move to the previous digit (carry 1).
4. If all digits are 9, create a new array with one extra digit and set the first digit to 1.

---

## Complexity

- **Time Complexity:** `O(n)`  
  We may need to check all the digits in the worst case (e.g., `[9, 9, 9]`).

- **Space Complexity:** `O(1)`  
  We don't use any extra space in most cases.  
  Only when all the digits are 9 do we create a new array of size `n + 1`.

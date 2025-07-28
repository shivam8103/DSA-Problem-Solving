
## Brute Force Approach

* Create a temporary array of size `n + 1` (where `n` is the length of the original array), and initialize all elements to `0`.
* Traverse the original array. For each element, mark the corresponding index in the `temp[]` array as `1`, indicating that the element is present.

* For example, if the element `3` is present in the original array, set `temp[3] = 1`.
* After traversing the original array, iterate over the `temp[]` array. If any index has a value of `0`, that means the corresponding number is missing from the original array. Return that index as the result.


### ⏱ Time Complexity: **O(2n)**

(One pass through the original array and one pass through the temp array)

### 🧠 Space Complexity: **O(n)**

(Additional array of size `n + 1` used)

---

Absolutely! Here's a refined explanation of the **optimal approach** based on your code:

---

## ⚡ Optimal Approach (Sum Formula Method)

* The problem guarantees that the array contains `n` distinct numbers from `0` to `n`, with exactly **one missing**.
* The sum of the first `n` natural numbers (including `0`) can be calculated using the formula:

  $$
  \text{expectedSum} = \frac{n \cdot (n + 1)}{2}
  $$
* Traverse the array and compute the **actual sum** of its elements.
* Subtract the actual sum from the expected sum. The result is the **missing number**.

---

### ⏱ Time Complexity: **O(n)**

(One pass through the array to calculate the actual sum)

### 🧠 Space Complexity: **O(1)**

(No extra space used — just a few integer variables)

---
## ⚡ Optimal Approach 2 (Using XOR)

* We know that the XOR of the same number results in 0.  
  For example: `1 ^ 1 = 0` or `2 ^ 2 = 0`

* So, we can create two variables: `xorExpected` and `xorActual`.

* `xorExpected` will store the XOR of all numbers from `0` to `N` (where `N` is the length of the array).

* `xorActual` will store the XOR of all elements present in the array.

* Finally, if we XOR `xorExpected` with `xorActual`, all the matching numbers will cancel each other out (since `a ^ a = 0`), and the missing number will be left. Return that number.

---

### ⏱ Time Complexity: **O(n)**  
### 🧠 Space Complexity: **O(1)**

---

> **Note:** The XOR method has the same time and space complexity as the Summation method. However, the Summation formula (`n(n+1)/2`) can lead to integer overflow for large values of `n`, while XOR avoids this risk. Therefore, XOR is slightly more robust than the Summation method.




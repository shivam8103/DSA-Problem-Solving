# Approach

## Brute Force
<details>
<summary>Click to Expand</summary>

- Create a temporary array `temp[]` of the same size as the original array.  
  (In Java, elements are initialized to `0` by default.)

- Traverse the original array and copy all **non-zero** elements into `temp[]`, starting from index `0`.

- The remaining positions in `temp[]` will stay as `0`, effectively placing all zeros at the end.

- Finally, copy all elements from `temp[]` back into the original array.

---

### ⏱ Time Complexity:
> **O(n + n)** = **O(2n)** → **O(n)**

### 💾 Space Complexity:
> **O(n)** – Extra array `temp[]` is used.

</details>

---

## Optimal Solution
<details>
<summary>Click to Expand</summary>

- Find the index of the **first zero** in the array and store it in variable `j`.

- From index `j + 1` onward:
  - If a **non-zero** element is found at index `i`, **swap** it with the element at index `j`.
  - Increment `j` to point to the next zero location.

- This ensures all non-zero elements are pushed forward while zeros shift to the end — in-place and efficiently.

---

### ⏱ Time Complexity:
> **O(n)** – One pass to find the first `0`, another to perform swaps.

### 💾 Space Complexity:
> **O(1)** – In-place swaps, no extra space used.

</details>

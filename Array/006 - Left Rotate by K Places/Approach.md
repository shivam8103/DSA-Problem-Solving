## 🥉 Approach 1: Brute Force

<details>
<summary>Click to expand</summary>

- Rotate the array one element at a time, `k` times.
- Each left rotation shifts all elements by one position.

### ⏱ Time Complexity:
> **O(n * k)** – Each rotation takes `O(n)`, repeated `k` times.

### 💾 Space Complexity:
> **O(1)** – No extra space used.

</details>


## 🥈 Approach 2: Improved (Using Temporary Array)

<details>
<summary>Click to expand</summary>

- Create a temporary array and store the first `k` elements.
- Shift the remaining elements (`k` to `n-1`) to the left.
- Copy the stored `k` elements to the end of the array.

### ⏱ Time Complexity:
> **O(n)** – One pass to store, one to shift, one to copy.

### 💾 Space Complexity:
> **O(k)** – Temporary array of size `k` is used.

</details>



## 🥇 Approach 3: Optimal (Reversal Algorithm)

<details>
<summary>Click to expand</summary>

- This approach is based on a observation that if we reverse the array in different parts we can achieve left shift.

### Steps:
1. Reverse the first `k` elements: `reverse(0, k-1)`
2. Reverse the remaining `n-k` elements: `reverse(k, n-1)`
3. Reverse the entire array: `reverse(0, n-1)`

**Example:**  
Given array = `{1, 2, 3, 4, 5, 6, 7, 8}`, and `k = 3`

**Step 1:** reverse(0, 2) → {3, 2, 1, 4, 5, 6, 7, 8} =- O(K)

**Step 2:** reverse(3, 7) → {3, 2, 1, 8, 7, 6, 5, 4} = O(N-K)

**Step 3:** reverse(0, 7) → {4, 5, 6, 7, 8, 1, 2, 3} = O(N)

Now the array is rotated by 3 places to the left.

### ⏱ Time Complexity:
> **O(2N)** – Three full reversals.

### 💾 Space Complexity:
> **O(1)** – All operations are in-place.

</details>


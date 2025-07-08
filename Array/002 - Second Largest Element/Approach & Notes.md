## 🥇 Approach 1:

<details>
<summary>Brute Force</summary>

- Sort the array.
- Return arr.length - 2.

### ⏱ Time Complexity:
> **O(n log n + n)** – Sorting takes `O(n log n)` and scanning for duplicate largest element `O(n)`.

</details>



## 🥈 Approach 2:

<details>
<summary>Improved Two-Pass Approach</summary>

- **Pass 1:** Traverse the array to find the lar = **largest than arr[i]**.
- **Pass 2:** Traverse the array again to find the slar = **largest than arr[i] but smaller than max(lar)**.
- If no such element exists, return `-1`.

### ⏱ Time Complexity:
> **O(n + n) = O(n)** – Two linear scans.

</details>



## 🥉 Approach 3:

<details>
<summary>Optimal One-Pass Approach</summary>

- Initialize two variables: `lar = -1`, `slar = -1`
- Traverse the array:
  - If `arr[i] > lar`:  
    → `slar = lar`, `lar = arr[i]`
  - Else if `arr[i] < lar && arr[i] > slar`:  
    → `slar = arr[i]`
- Return `slar` at the end.

### ⏱ Time Complexity:
> **O(n)** – Single pass through the array.

</details>

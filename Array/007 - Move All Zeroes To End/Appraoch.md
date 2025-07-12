# Appraoch

## Brute Force
<details>
<summary>click</summary>
- Create a temporary array `temp[]` of same size of the original array. By default all elements in java is initialized by 0 if not initialized.

- Copy all the non zero elements of original array to  `temp[]` from the beginning.

- Now, the temp[] have some zeroes at the last which was not disturbed. This temp[] becuase the resultant array as all the zeroes are placed in last ane non zeres at beginning.

- Copy `arr[i] = temp[i]`

### ⏱ Time Complexity:
> **O(n + n)**

### 💾 Space Complexity:
> **O(n)** – Extra array `temp[]` is used.

</details>

## Optimal Solution
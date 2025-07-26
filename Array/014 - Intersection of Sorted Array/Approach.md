# Brute Force Approach:

* For each element in `arr1[]`, do a **linear search** in `arr2[]`.

* To **avoid adding duplicate elements** from `arr2[]`, maintain an **additional array** called `vis[]` (of the same size as `arr2[]`) and initialize all elements as `0`.

* If an element from `arr2[]` is added to the result, mark `vis[j] = 1` to indicate it has been **visited/used**.

* Next time, while iterating over `arr2[]`, **only consider elements where `vis[j] == 0`** (i.e., not already used in a previous match).

> Note: This ensures that:

* Each element in `arr2[]` is used **at most once**.
* Duplicate values in `arr1[]` can still match if there are available duplicates in `arr2[]`.

### Time Complexity : ``O(n1 * n2)``

### Space Complexity : ``O(n2)``

---

# Optimal Solution:


Perfect. Here's a clean, **note-ready writeup** for the **Optimal Approach** corresponding to your code:

---

### ✅ **Optimal Approach: Two-Pointer Technique**

* Use **two pointers**, `s1` and `s2`, starting at index `0` for `arr1[]` and `arr2[]` respectively.
* Traverse both arrays:

  * If `arr1[s1] == arr2[s2]`: It's a match → add to result, move both pointers.
  * If `arr1[s1] < arr2[s2]`: Move `s1++` (smaller element might match later).
  * Else, move `s2++`.

### Time Complexity:

* If **both arrays are sorted**:
  ➤ **O(n1 + n2)** — linear traversal.

* If arrays are **unsorted**, we need to sort them first:
  ➤ **O(n1 log n1 + n2 log n2)**

* So, total time:
  ➤ `O(n1 log n1 + n2 log n2 + n1 + n2)`

### Space Complexity:

* **O(min(n1, n2))** — for the result list.
* Also mention: an extra `int[]` is created (of the same size as `ArrayList`) to return the result in array form.

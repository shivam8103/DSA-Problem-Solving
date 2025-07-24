# Appraoch

## Brute Force Approach - Using TreeSet
<details>

1. **Initialize a `TreeSet<Integer>`** to store the union of both arrays.
2. **Insert all elements** from `arr1` and `arr2` into the `TreeSet`.
3. `TreeSet` automatically:

   * Removes duplicates
   * Keeps the elements sorted
4. **Create a result array** (`int[]`) of size `set.size()`.
5. **Copy elements** from the `TreeSet` into the result array using an iterator or enhanced `for` loop.

---

###  **Time Complexity (TC):**

Let:

* `n = arr1.length`
* `m = arr2.length`

```java
O((n + m) × log(n + m))
```

---

### **Space Complexity (SC):**

```java
O(n + m)
```
</details>

## Optimal Solution - Using Two Pointer and ArrayList

<details>

1. Use two pointers `i` and `j` to iterate through `arr1` and `arr2` simultaneously.
2. At each step, compare `arr1[i]` and `arr2[j]`:

   * Add the smaller element to the result (if it’s not a duplicate).
   * Move the corresponding pointer.
   * If both are equal, add one of them and move both pointers.
3. After the main loop, handle any remaining elements in either array.
4. Store the union in an `ArrayList<Integer>` and return it.

> This assumes both input arrays are **sorted**.

---

### **Time Complexity (TC):**

```java
O(n1 + n2)
```


### **Space Complexity (SC):**

```java
O(n1 + n2)
```
</details>
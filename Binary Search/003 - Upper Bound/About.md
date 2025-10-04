
# Upper Bound


## Problem Statement

Given a **sorted array** of integers `nums` and an integer `x`, write a program to find the **upper bound** of `x`.

The **upper bound** of `x` is defined as the **smallest index `i`** such that:

> `nums[i] > x`

If no such index is found, return the **size of the array**.

---

## Example 1

**Input:**
```
nums = [1, 2, 2, 3]
x = 2
```

**Output:**
```
3
```

**Explanation:**  
Index `3` is the smallest index such that `nums[3] > x`.

---

## Example 2

**Input:**
```
nums = [3, 5, 8, 15, 19]
x = 9
```

**Output:**
```
3
```

**Explanation:**  
Index `3` is the smallest index such that `nums[3] > x`.

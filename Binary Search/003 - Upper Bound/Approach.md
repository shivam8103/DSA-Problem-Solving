### **Lower Bound**

* Check if `arr[i] >= key`.
* If `arr[i] == key`, it is a valid answer, but we **don’t return immediately**.
* Keep iterating to find the **smallest possible index** that satisfies the condition.

---

### **Upper Bound**

* Similar to lower bound, but `arr[i] == key` is **not considered**.
* We only want to return the **first element strictly greater than the key**.
* Continue iterating until the **smallest index** with `arr[i] > key` is found.

---

### **Key Differences**

* **Lower Bound:** `arr[i] >= key` → includes elements equal to the key.
* **Upper Bound:** `arr[i] > key` → only strictly greater elements are considered.

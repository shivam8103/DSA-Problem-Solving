# Problem Statement

Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.

>**Note**: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.


---

</details>
<details>
<summary>Examples</summary>

## Examples

### Example 1:
**Input:**  
`arr[] = [2, 2, 2, 2, 2]`  
**Output:**  
`[2]`  
**Explanation:**  
All the elements are `2`, so only one instance is kept.

---

### Example 2:
**Input:**  
`arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]`  
**Output:**  
`[1, 2, 3, 4, 5]`  
**Explanation:**  
Duplicates are removed, and the original order is preserved.

---

### Example 3:
**Input:**  
`arr[] = [1, 2, 3]`  
**Output:**  
`[1, 2, 3]`  
**Explanation:**  
All elements are already distinct. No changes made.


</details>

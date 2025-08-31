# Problem: LeetCode #14 (Longest Common Prefix)

## Brute Appraoch:

<details>

- Loop over each string one by one
- Then, loop over characters of string starting from charAt(0) to end until there is common character. 
- Remeber, to store the recent character in a variable, that makes comparing in each string easier

### Time Complexity = O(n^2)

### Space Complexity = O(1)

</details>

## Optimal Approach:

<details>

- First, sort the array of strings.
- After sorting, the first and last strings in the array will be the most different.
- This means we only need to compare characters of the first and last strings until they mismatch, instead of checking all strings one by one.

| Before Sort | -> | After Sort |
|-------------|----|------------|
| Cluster     | -> | Club       |
| Clue        | -> | Clue       |
| Clutch      | -> | Clumsy     |
| Club        | -> | Cluster    |
| Clumsy      | -> | Clutch     |

- Now, just compare "Club" (first) and "Clutch" (last).
- Their common prefix gives the answer for the whole array.

### Time Complexity = O(nlogn) - sorting

### Space Complexity = O(1)

</details>
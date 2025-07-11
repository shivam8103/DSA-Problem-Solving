# Code

- Store the first element in a temporary variable

- Shift each element one position to the left:
For every index i from 0 to arr.length - 2, assign arr[i] = arr[i + 1]- Once the array is traversed at    `arr.length-1` put value store at temp variable

- Place the original first element (from the temp variable) at the last index of the array.


**Time Complexity** : O(N)

**Space Complexity** : O(1)

> Note: Space used in the code is O(N) as an array is used. But when asked about extra space required to solve the problem, it is O(1).
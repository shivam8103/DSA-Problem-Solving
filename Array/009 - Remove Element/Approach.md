# Approach


1. Initialize a variable result to 0.
    - This variable will track the index where the next non-k value should be placed.

2. Loop through the array using a standard for loop.

3. Check each element:
    - If the current element is not equal to k, copy it to the result index.
    - Then, increment result by 1.

4. Return result at the end.
    - This value represents the new length of the array with all occurrences of k removed.



## Working

**Input: arr =** ``[3,2,2,3]``, **k =** ``3``

**Loop steps:**
- arr[0] == 3 → skip
- arr[1] == 2 → arr[0] = 2, result = 1
- arr[2] == 2 → arr[1] = 2, result = 2
- arr[3] == 3 → skip

**Final result =** ``2``

**Modified array (first 2 elements):** ``[2, 2]``

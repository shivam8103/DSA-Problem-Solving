# Brute Force Approach - Try every possible Subarray
<details>

1. Try every possible subarray

```
    (1,1) , (1,2), (1,3), (1,n)
            (2,2), (2,3), (2,n)
                   (3,3), (3,n)
                     .....(n,n)
```

2.  Do 2 loops to create every subarray possible


```
for (i=0 -> arr.length){
    for(j=i -> arr.length){

    }
}
```

3. Find sum using another loop
``` 
for(k=i -> j+1){
    sum
}
```

4. After calculating sum. Check if sum is equal to key or not. 
5. If sum is equal to key, then also check if length of current subarray is greater than previous length or not. 
6. Return length or a new resultant array from `(i -> j+1)`

### Time Complexity = `O(n*n*n)`
### Space Complexity = `O(1)`
</details>

## Improved
<details>

1. To reduce time complexity, we can calculate sum along with the 2nd loop and not create a 3rd loop for sum calculation.
### Time Complexity = `O(n*n)`
### Space Complexity = `O(1)`
</details>


## Optimal (using prefix sum and hashmap)
<details>

1. Use a hashmap to store the prefix sum 

| Array      | 10 | 7  | 5  | 2  | 1  | -10 |
|------------|----|----|----|----|----|-----|
| Prefix Sum | 10 | 17 | 22 | 24 | 25 | 15  |

If we get the prefix sum = k and the CurrentLength (i+1) is greater than maxLength, then update the max length = i+1

2. Store the prefix sum in hashmap (key=prefixSum, value=index)
- If currentSum - hash(Key) = k(our target), and currentLength > maxLength. Update the maxLength = (i-hash(value))

| HashKey | -> | HashValue |
|---------|----|-----------|
| 10      | -> | 0         |
| 17      | -> | 1         |
| 22      | -> | 2         |
| 24      | -> | 3         |
| 25      | -> | 4         |
| 15      | -> | 5         |

### > Time Complexity = `O(n)`
### > Space Complexity = `O(n)` - hashmap
</details>
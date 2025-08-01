# Brute Approach
- For each element, count how many times it appears by scanning the entire array again.
- Return the element which appears only once. 
### Time Complexity = O(n*n)
### Space Complexity = O(1)

---

# Improved Appraoch - Using Hashing (Direct indexing with array)
- Create a frequency array (`hash[]`) where the index represents the element from the original array.
- Traverse the input array and increment the count at the corresponding index in the hash array.
- Finally, scan the hash array and return the index where the count is 1.
### Time Complexity = O(3n)
### Space Complexity = O(n)

## Improved Appraoch - Using HashMap
- Use a HashMap where the key is the element from the original array, and the value is its frequency (number of occurrences).
- Traverse the array to populate the map.
- Then, iterate through the map to find and return the key with a value equal to 1.
### Time Complexity = O(2n)
### Space Complexity = O(n)

# Optimal Appraoch - Using XOR 
- Use the XOR operation: when a number is XORed with itself, the result is 0, and any number XORed with 0 remains unchanged.
- Since all numbers except one appear twice, XORing all elements will cancel out the duplicates, leaving only the unique number.
- Return the final result after XORing all elements.
### Time Complexity = O(n)
### Space Complexity = O(n)
# Problem LeetCode #9 Palindrome Number

---

## Brute Approach.
- Convert the integer to a string.
- Then use 2 pointer appraoch to compare the first and last character of the string. 

### > Time Complexity O(n)
### > Space Complexity O(n) - Another string is used.

---
## Optimal Appraoch 
- Create another integer reverse=0;
- Get last digit(original%10) from original integer and put it in reverse. Then remove the last digit (original/10).
- At last compare the original integer (x) with reverse.

### > Time complexity O(logn) How?
For a 3 digit number, the maximum possible value is 999. So log(n) will be there when we iterate from 1 to 999. But what we did was, we iterate for only 3 times, so the time complexity will be O(logn) not O(n).

### > Space Complexity O(1) - No extra space used. 
# Increment Large Integer Represented as an Array

## Problem Description
You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the `i`th digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading `0's`.

Increment the large integer by one and return the resulting array of digits.

---

### Examples

#### Example 1:
**Input:**  
`digits = [1,2,3]`  
**Output:**  
`[1,2,4]`  
**Explanation:**  
The array represents the integer `123`.  
Incrementing by one gives `123 + 1 = 124`.  
Thus, the result should be `[1,2,4]`.

#### Example 2:
**Input:**  
`digits = [4,3,2,1]`  
**Output:**  
`[4,3,2,2]`  
**Explanation:**  
The array represents the integer `4321`.  
Incrementing by one gives `4321 + 1 = 4322`.  
Thus, the result should be `[4,3,2,2]`.

#### Example 3:
**Input:**  
`digits = [9]`  
**Output:**  
`[1,0]`  
**Explanation:**  
The array represents the integer `9`.  
Incrementing by one gives `9 + 1 = 10`.  
Thus, the result should be `[1,0]`.

---

### Constraints
- `1 <= digits.length <= 100`
- `0 <= digits[i] <= 9`
- `digits` does not contain any leading `0's`.

---

### Solution Approach

1. Traverse the `digits` array from the last digit (least significant) to the first (most significant).
2. If the current digit is less than `9`, increment it and return the array.
3. If the current digit is `9`, set it to `0` and continue to the next most significant digit.
4. If all digits are `9`, create a new array with one extra digit, set the first digit to `1` (rest are `0`), and return it.

---

### Complexity Analysis
- **Time Complexity:** `O(n)` where `n` is the length of the array.
- **Space Complexity:** `O(1)` additional space if no extra array is required; `O(n)` if a new array is created for all `9's`.

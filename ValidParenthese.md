
# Valid Parentheses Checker

This program determines whether a given string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'` is valid. 

## Criteria for a Valid String:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket must have a corresponding open bracket of the same type.


## Examples

### Example 1:
**Input:** 
```plaintext
s = "()"
```
**Output:** 
```plaintext
true
```

### Example 2:
**Input:** 
```plaintext
s = "()[]{}"
```
**Output:** 
```plaintext
true
```

### Example 3:
**Input:** 
```plaintext
s = "(]"
```
**Output:** 
```plaintext
false
```

### Example 4:
**Input:** 
```plaintext
s = "([])"
```
**Output:** 
```plaintext
true
```

## Constraints:
- `1 <= s.length <= 10^4`
- `s` consists of parentheses only: `'()[]{}'`.



# Distinct Dog Barking Patterns
## Problem Statement  
You are monitoring a group of dogs.  

- A dog barks **once** → `"B"`  
- A dog barks **twice** → `"BB"`  
- A dog barks **three times** → `"BBB"`  
- **Silence** is represented by `"."`.  

Your task is to **find and return an integer** representing how many **distinct types of dogs** are present based on their barking patterns.  

---

## **Input**  
- A string `input1` containing barking patterns and silence (`"."`).  

## **Output**  
- An **integer** representing the number of **distinct barking patterns**.  

---

## **Example**  
### **Input:**  
```
B...B...BB...B...BBB
```

### **Processing:**  
1. Extract barking sequences by splitting the input at `"."`:  
   ```
   ["B", "B", "BB", "B", "BBB"]
   ```
2. Find the **unique** barking patterns:  
   ```
   {"B", "BB", "BBB"}
   ```
3. **Count the distinct barking patterns** → `3`

### **Output:**  
```
3
```

---

## **Constraints**  
- The input will only contain uppercase `"B"` and `"."`.  
- The barking patterns will be separated by one or more `"."`.  
- The string will always contain at least one `"B"`.  

---

```
import java.util.HashSet;

public class DogBarkCounter {
    public static int countDistinctDogBarks(String input1) {
        HashSet<String> uniqueBarks = new HashSet<>();
        String[] barks = input1.split("\\.+"); // Split by one or more dots (silence)

        // Add non-empty barking patterns to the set
        for (String bark : barks) {
            if (!bark.isEmpty()) {
                uniqueBarks.add(bark);
            }
        }

        return uniqueBarks.size();
    }

    public static void main(String[] args) {
        // Example input
        String input1 = "B...B...BB...B...BBB";

        // Call the function and print the result
        System.out.println(countDistinctDogBarks(input1)); // Expected output: 3
    }
}
```

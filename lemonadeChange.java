class Solution {
    public boolean lemonadeChange(int[] bills) {
          int fiveDollarCount = 0; // Count of $5 bills
        int tenDollarCount = 0;  // Count of $10 bills

        for (int bill : bills) {
            if (bill == 5) {
                fiveDollarCount++; // Increase count for $5 bill
            } else if (bill == 10) {
                if (fiveDollarCount > 0) {
                    fiveDollarCount--; // Provide $5 change
                    tenDollarCount++;   // Increase count for $10 bill
                } else {
                    return false; // Cannot provide change
                }
            } else if (bill == 20) {
                // Prefer to give one $10 and one $5 if possible
                if (tenDollarCount > 0 && fiveDollarCount > 0) {
                    tenDollarCount--; // Use one $10 bill
                    fiveDollarCount--; // Use one $5 bill
                } else if (fiveDollarCount >= 3) {
                    fiveDollarCount -= 3; // Use three $5 bills
                } else {
                    return false; // Cannot provide change
                }
            }
        }
return true; // Successfully provided change to all customers
    }
    
}
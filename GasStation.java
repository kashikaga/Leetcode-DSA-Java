public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            // If current gas is negative, we cannot start from 'startIndex'
            if (currentGas < 0) {
                startIndex = i + 1; // Move start index to the next station
                currentGas = 0; // Reset current gas
            }
        }

        // If total gas is less than total cost, return -1
        return totalGas < totalCost ? -1 : startIndex;
    }


    }

    
import java.util.ArrayList;
import java.util.List;

public class PascalTriangleRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // Initialize the first element of the row
        row.add(1);
        
        // Calculate the values for the current row
        for (int i = 1; i <= rowIndex; i++) {
            // Calculate the current value based on the previous value
            // Using the formula: C(n, k) = C(n, k-1) * (n - k + 1) / k
            // where C(n, k) is the binomial coefficient
            long value = (long) row.get(i - 1) * (rowIndex - i + 1) / i;
            row.add((int) value);
        }
        
        return row;
    }

    
    
}
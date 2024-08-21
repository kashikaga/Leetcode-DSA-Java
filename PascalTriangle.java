import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                // The first and last row elements are always 1
                if (col == 0 || col == row) {
                    currentRow.add(1);
                } else {
                    // Each triangle element is the sum of the two elements above it
                    int value = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                    currentRow.add(value);
                }
            }
            triangle.add(currentRow);
        }

        return triangle;
    }

   }
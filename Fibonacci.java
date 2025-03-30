//Java program computes and prints the first n Fibonacci numbers
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Fibonacci {
   static List<Integer> fibonacciNumbers(int n) {
      List<Integer> ans = new ArrayList<>();
      if (n > 0) ans.add(0);
      if (n > 1) ans.add(1);

      for (int i = 2; i < n; i++) {
         ans.add(ans.get(i - 1) + ans.get(i - 2));
      }
      return ans;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.print("Enter the number of Fibonacci terms: ");
      int n = sc.nextInt();
      sc.close();

      List<Integer> res = fibonacciNumbers(n);
      System.out.println(res);
   }
}

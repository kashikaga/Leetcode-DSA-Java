//brute force
import java.util.*;
public class maxSubarraySum{
public static void maxSubarraySum(int numbers[]){
int currSum=0;
int maxSum=Integer.MIN_VALUE;

for(int i=0;i<numbers.length;i++){
int start=i;
for(int j=i;j<numbers.length;j++){
int end=j;
currSum=0;
for(int k=start;k<=end;k++){
currSum+=numbers[k];
}
System.out.println(currSum);
if(maxSum<currSum){
maxSum=currSum;
}
//System.out.println();
}
System.out.println("max Sum="+maxSum);
}
}
public static void main(String args[]){
int numbers[]={2,4,6,8,10};
maxSubarraySum(numbers);
}
}


//prefix array
import java.util.*;
public class maxSubarraySum{
public static void maxSubarraySum(int numbers[]){
int currSum=0;
int maxSum=Integer.MIN_VALUE;
int prefix[]=new int[numbers.length];

prefix[0]=numbers[0];
for(int i=1;i<prefix.length;i++){
prefix[i]=prefix[i-1]+numbers[i];
}

for(int i=0;i<numbers.length;i++){
int start=i;
for(int j=i;j<numbers.length;j++){
int end=j;
currSum= start==0? prefix[end]: prefix[end]- prefix[start-1];

System.out.println(currSum);
if(maxSum<currSum){
maxSum=currSum;
}
}
System.out.println("max Sum="+maxSum);
}
}
public static void main(String args[]){
int numbers[]={1,-2,6,-1,3};
maxSubarraySum(numbers);
}
}

//kadanes
import java.util.*;
public class kadanes{
public static void kadanes(int numbers[]){
int cs=0;
int ms=Integer.MIN_VALUE;

for(int i=0;i<numbers.length;i++){
cs=cs+numbers[i];
if(cs<0){
cs=0;
}
ms=Math.max(cs,ms);
}
System.out.println("max subarray Sum="+ ms);
}

public static void main(String args[]){
int numbers[]={-2,-3,4,-1,-2,1,5,-3};
kadanes(numbers);
}
}

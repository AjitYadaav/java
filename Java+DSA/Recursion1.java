import java.util.*;
public class Recursion1 {

    //Q. Print the Sum of first N natural number using recursion...
    public static void printSum(int i, int n,int sum){
        //Base case
        if(i==n){
            sum+=n;
            System.out.println("The sum of first "+n+" terms is :"+sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    public static int printFactorial(int n){
        if(n==1){
            return 1;
        }
        return n*printFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you wants to sum:");
        int n=sc.nextInt();
        printSum(1,n,0); 
        int fact=printFactorial(n);
        System.out.println("the factorial is "+fact);
        sc.close();
    }
}

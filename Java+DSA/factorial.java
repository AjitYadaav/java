import java.util.*;
public class factorial {
    public static int printFactorial(int N){
        int fact=1; 
        for(int i=1; i<=N; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the number:");
         int n=sc.nextInt();
         
         int fact=printFactorial(n);
         System.out.println("factorial of is "+fact);
         sc.close();
    }
}

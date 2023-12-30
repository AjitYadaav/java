import java.util.*;
public class sum_using_funcions {
    public static int sumOfNum(int a ,int b){
        int c=a+b;
        return c;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b= sc.nextInt();
        int sum=sumOfNum(a,b);
        System.out.println("the sum of two number is : "+sum);

        sc.close();
    } 
}

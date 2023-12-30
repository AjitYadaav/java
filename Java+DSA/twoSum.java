import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target:");
        int target=sc.nextInt();
        // System.out.println("Enter the size of the arrays: ");
        // int size()
        int nums[]={4,5,2,9,3};
       
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=1+i;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    System.out.print("["+i+","+j+"]");
                }
            }
        }






        sc.close();
    }
}

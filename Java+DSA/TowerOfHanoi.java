import java.util.*;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String Dest){
           
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+Dest);
            return;
        }

        towerOfHanoi(n-1, src, Dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+Dest);

        towerOfHanoi(n-1, helper, src, Dest);
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Disk:");
        int n=sc.nextInt();
        towerOfHanoi(n,"Source","Helper","Destination" );

        sc.close();
    }
}

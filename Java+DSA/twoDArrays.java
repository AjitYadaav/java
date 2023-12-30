import java.util.*;
public class twoDArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the cols:");
        int cols=sc.nextInt();
        
        //Defining a 2D Arrays;
        int arr[][]=new int [rows][cols];
        //taking input from user.
        for(int i=0;i<rows; i++){
            for(int j=0; j<cols ; j++){
              arr[i][j]=sc.nextInt();
            }
        }
        // output 
        System.out.println("2D Matrix is : ");
        for(int i=0 ; i<rows ; i++){
             for(int j=0; j<cols ; j++){
                System.out.print(arr[i][j]+" ");
             }
             System.out.println();
        }

        //Q. Take a matrix as input from the user .Search for a given number x and print the indices at which it occurs.

        //searching and element of the matrix
        System.out.print("Enter the key");
        int key=sc.nextInt();

        for(int i=0; i<rows ; i++){
             for(int j=0 ; j<cols; j++){
                if (arr[i][j]==key ){
                    System.out.println("the index of the key is  "+"("+i+","+j+")");
                }
             }
        }
        sc.close();
    }
}

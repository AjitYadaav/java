import java.util.*;
public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size= sc.nextInt();
        
        //Defining an arrray
        int arr[]=new int[size];;
        //Taking input from user
        for(int i=0; i<size; i++){
            System.out.print("Enter arr["+i+"]:");
            arr[i]=sc.nextInt();
        }

        // output of the array
        System.out.print("The elements of the array are: ");
        for(int i=0; i<size ; i++){
            System.out.print(arr[i]+" ");
        }

       // Q.Take an arrys as input from the user. Search for a given Number x and print the index at which it occur.
         System.out.print("Enter the key:");
         int key= sc.nextInt();
       //searching 
       for(int i=0 ; i<size;i++){
        if(arr[i]==key){
            System.out.println("the index of the key is "+i);
        }
      
    }
   
     sc.close();  

    }
}

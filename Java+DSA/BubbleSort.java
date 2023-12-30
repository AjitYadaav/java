import java.util.*;
public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printSortedArray(int arr[]){
       System.out.print("Array after sorting:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={8,7,5,3,1};
        System.out.print("Array before sorting:");
        printArray(arr);
        System.out.println();
        //Bubble Sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                  // swap
                  int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        printSortedArray(arr);
    }
}

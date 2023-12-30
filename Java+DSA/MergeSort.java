import java.util.*;
public class MergeSort {

    public static void conquer(int arr, int si , int mid , int ei ){
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
               
                merged[x++]=arr[idx1++];

            }
            else{
                  merged[x++]=arr[idx2++];
            }
        }
    }
    public static void divideArray(int arr[],int si , int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divideArray(arr, si, mid);
        divideArray(arr, mid+1 , ei);
    }
    public static void main(String[] args) {
       int arr[]={4,5,3,2,9,4};
       int n=arr.length;
       
    }
}

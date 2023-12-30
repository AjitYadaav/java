public class Recur_isSorted {
    public static boolean isArraySorted(int arr[],int idx ){
        if(idx==arr.length-1){
            return true;
             
        }
        if(arr[idx]<arr[idx+1]){
           return isArraySorted(arr, idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,8};
       System.out.println("the given array is sorted :"+ isArraySorted(arr, 0));
   
    }
}

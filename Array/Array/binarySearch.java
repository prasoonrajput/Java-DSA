package Array;

public class binarySearch {
    public static int BinarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
             if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;

    }


    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 13, 14, 15, 16, 17, 18 };
        int key = 153;
        System.out.println("the index of key value is the " + BinarySearch(arr, key));

    }
}

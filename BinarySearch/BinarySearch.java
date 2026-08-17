package BinarySearch;

public class BinarySearch {
    
    public static void main(String[] args) {
        int[] arr = { -18, -2, -1, 0, 5, 6, 9, 10, 16, 17, 20};
        int target = -2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }


    //return the index
    //return -1 if the index does not exist 
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; might be possible thet (start + end) exceeds the renge of integer in java
            int mid = start + (end - start) /2;

            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found 
                return mid;
            }
        }
        return  -1;
    }
}

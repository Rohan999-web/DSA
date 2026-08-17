
//     public static void main(String[] args) {
//         int[] arr = {7, 2, 15, 4, 9};
//         int answer = smallestelemet(arr);
//         System.out.println(answer);
        
//     }

//     public static int smallestelemet(int[] arr){
//         int min = arr[0];
//         for(int i = 1; i < arr.length; i++)
//             if (arr[i] < min){
//                 min = arr[i];
//             }
                
        
//         return min;
// }
// }


// public class main{
//     public static void main(String[] args) {
//         int[] arr = {7, 2, 15, 4, 9};
//         int answer = secondlargest(arr);
//         System.out.println(answer);
//     }

//     public static int secondlargest(int[] arr){
//         int largest = arr[0];
//         int secondlargest = arr[1];

//         for(int i = 1; i < arr.length; i++){
//             if(arr[i] > largest){
//                 secondlargest = largest;
//                 largest = arr[i];
//             }
//             else if(arr[i] > secondlargest)
//                 secondlargest = arr[i];
//         }
//         return secondlargest;
//     }
// }


// public class main{
//     public static void main(String[] args) {
//         int[] arr = {9,2,15,4,9};
//         reverseArray(arr);
//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i] + " ");
//         }
        
//     }
    
//     public static void reverseArray(int[] arr){
//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right){
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }
        
//     }
// }


// public class main{
//     public static void main(String[] args) {
//         int[] arr = {2, 7, 8, 5, 10, 11};
//         EvenOdd(arr);
//     }

//     public static void EvenOdd(int[] arr){
//         int evenCount = 0;
//         int oddCount = 0;

//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] % 2 == 0)
//                 evenCount++;
//             else
//                 oddCount++;
//         }
//         System.out.println("Even = " + evenCount);
//         System.out.println("Odd = " + oddCount);
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         int[] arr = {-2, 5, -7, 1, 0 ,10};
//         Count(arr);
//     }

//     public static void Count(int[] arr){
//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;

//         for(int i = 0; i < arr.length; i++){

//             if(arr[i] > 0){
//                 positiveCount++;
//             }
//             else if(arr[i] < 0){
//                 negativeCount++;
//             }
//             else{
//                 zeroCount++;
//             }
//         }

//         System.out.println("Positive = " + positiveCount);
//         System.out.println("Negative = " + negativeCount);
//         System.out.println("Zero = " + zeroCount);
//     }
// }


// public class main{
//     public static void main(String[] args) {
//         int[] arr = {2, 4, 2, 5, 2, 8};
//         frequency(arr, 2);


//     }

//     public static void frequency(int[] arr, int x){
//         int frequencyCount = 0;

//         for (int i = 0; i < arr.length; i++){

//             if(arr[i] == x){
//                 frequencyCount++;
//             }
//         }
//         System.out.println("Frequecy = "+ frequencyCount);
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 4};
//         Sum(arr);


//     }

//     // public static void Sum (int[] arr){
//     //     int sum = 0;

//     //     for (int i = 0; i < arr.length; i++) {
//     //         sum = sum + arr[i];
//     //     }
//     //     System.out.println("Sum =" + sum);
//     // }

//     public static void Sum(int[] arr){
//         int sum = 0;
//         double avg = 0;
//         int product = 1;

//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];

//             product = product * arr[i];
        
//         }
//         // avg = (double) sum/arr.length;
        
        
//         System.out.println("Product =" + product);
//     }
    
// }



// public class main{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 5, 4, 6};
//         isSorted(arr);

//     }

//     public static void isSorted(int[] arr){

//         for (int i = 0; i < arr.length - 1; i++) {
            
//             if(arr[i] > arr[i + 1]){
//                 System.out.println("Array is Not Sorted");
//                 return;
//             }
//         }
//         System.out.println("Sorted");
//     }

// }


// public class main{
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40};
//         reverseArray(arr);

//     }

//     public static void reverseArray(int[] arr){
//         int left = 0;
//         int right = arr.length - 1;

//         while(left < right){
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// public class main{
//     public static void main(String[] args) {
//         int[] arr = {0, 5, 0, 2};
//         moveZeroes(arr);

//     }

//     public static void moveZeroes(int[] arr){
        
//         int j = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] !=0){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;

//                 j++;
//             }
//         }
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
        
//     }
// }


//REMOVE DUPLICATES

// public class main{
//     public static void main(String[] args) {
//         int[] arr = {1, 1, 2, 2, 3};
//         removeDuplicate(arr);

//     }

//     public static void removeDuplicate(int[] arr){
//         int j = 0;

//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i] != arr[j]){
//                 j++;
//                 arr[j] = arr[i];
//             }
//         }
//         for(int i = 0; i <=j; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//


//Pattern 5: Running Minimum (Greedy)
//Problem: Best Time to Buy and Sell Stock (LeetCode 121)

// public class main{
//     public static void  main(String[] args) {
//         int[] arr = {7,1,5,3,6,4};
//         System.out.println(profit(arr));
//     }

//     public static int profit(int[] arr){
//         int minPrice = arr[0];
//         int maxProfit = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] < minPrice){
//                 minPrice = arr[i];
//             }else{
//                 int profit = arr[i] - minPrice;

//                 if(profit > maxProfit){
//                     maxProfit = profit;
//                 }
//             }
//         }
//         return maxProfit;
//     }
    
// }


// Prefix Sum
// Build Prefix sum Array 

// public class main{
//     public static void main(String[] args) {
//         int[] arr = {2, 4, 6, 8, 10};
//         int[] prefix = buildPrefix(arr);
        
//         for(int num : prefix) {
//             System.out.print(num + " ");
//         }
//     }

//     public static int[] buildPrefix(int[] arr){
//         int[] prefix = new int[arr.length];
//         prefix[0] = arr[0];

//         for(int i = 1; i < arr.length; i++){
//             prefix[i] = prefix[i - 1] + arr[i];
//         }
//         return  prefix;
//     }
// }


//Problem: Pivot Index (LeetCode 724)

// public class main{
//     public static void main(String[] args) {
//         int[] arr = {1, 7, 3, 6, 5, 6};
//         int pivot = pivotIndex(arr);

//         System.out.print(pivot);

//     }

//     public static int pivotIndex(int[] arr){
//         int sum = 0;

//         for(int num : arr){
//             sum += num;
//         }
//         int totalSum = sum;
//         int leftSum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             int rightSum = totalSum - leftSum - arr[i];

//             if(leftSum == rightSum){
//                 return i;
//             }
//             leftSum += arr[i];

//         }
//         return -1;

//     }
// }


//Sliding Window

// public class main{
//     public static void main(String[] args) {
//         int[] arr = {2, 1, 5, 1, 3, 2};
//         int k = 3;
//         int answer = maxSumSubarray(arr, k);
//         System.out.print(answer);

//     }

//     public static int maxSumSubarray(int[] arr, int k){
//         int windowSum = 0;
//         int maxSum = 0;


//         for(int i = 0; i < k; i++){
//             windowSum += arr[i];
//         }
//         maxSum = windowSum;

//         for(int i = k; i < arr.length; i++){
//             windowSum = windowSum - arr[i-k] + arr[i];
//             if(windowSum > maxSum){
//                 maxSum = windowSum;
//             }
//         }
//         return maxSum;
        
//     }
// }


//Binary Search

public static int binarySearch(int[] arr, int target){
    int left = 0;
    int right = arr.length - 1;
    

    while(left <= right){

        int mid = (left + right) / 2;
    
        if(arr[mid] == target){
        return mid;
        }
        else if (target > arr[mid]){
            left = mid + 1;
        }
        else{
            right = mid - 1;
        }
        
    }
    return -1;
}

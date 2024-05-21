// public class SortArray {

    // //Better Appraoch - Using Count 
    // public static void arraySort(int arr[], int n){
    //     int count0 = 0;
    //     int count1 = 0;
    //     int count2 = 0;
    //     for(int i=0; i<n; i++){
    //         if(arr[i]==0){
    //             count0 ++;
    //         }
    //         else if(arr[i]==1){
    //             count1++;
    //         }
    //         else if (arr[i]==2) {
    //             count2++;           
    //         }
    //     }
    //     for(int i=0; i<count0; i++){
    //         arr[i]=0;
    //     }
    //     for(int i=count0; i<count0+count1; i++){
    //         arr[i]=1;
    //     }
    //     for(int i=count1+count2; i<n; i++){
    //         arr[i]=2;
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println("i am a sorting an array");
    //     int arr[] = {0, 1, 0, 2, 2, 1, 0, 2, 1};
    //     int n = 9;
    //     arraySort(arr, n);
    //     for(int i=0; i<n; i++){
    //         System.out.print(arr[i]);
    //     }
    // }
    

    //Optimal Approach - Dutch National Falg Algorith Using Three Pointers
//     public static void arraySort(int arr[], int n) {
//         int low = 0;
//         int mid = 0;
//         int high = n - 1; // Initialize high to last index
//         while (mid <= high) {
//           if (arr[mid] == 0) {
//             int temp = arr[low];  // Store value at low in temp
//             arr[low] = arr[mid];
//             arr[mid] = temp; 
//             low++;
//             mid++;
//           } else if (arr[mid] == 1) {
//             mid++; // Move mid for elements with value 1
//           } else {
//             int temp = arr[mid];  // Store value at mid in temp
//             arr[mid] = arr[high];
//             arr[high] = temp;     
//             high--;
//           }
//         }
//       }
//     public static void main(String[] args) {
//             System.out.println("i am a sorting an array");
//             int arr[] = {0, 1, 0, 2, 2, 1, 0, 2, 1};
//             int n = 9;
//             arraySort(arr, n);
//             for(int i=0; i<n; i++){
//                 System.out.print(arr[i]);
//             }
// }
// }

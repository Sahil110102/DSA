public class BubbleSort {

    public static void bubble_sort(int []arr, int n ){
        for(int i=n-1; i>=0 ;i--){

            for(int j=0; j<n-1;j++){
                
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.println("After Sorting");
        for(int j=0; j<n; j++){
            System.out.print(arr[j] +" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={2, 5, 6,8, 3,9, 4};
        int n= arr.length;

        System.out.println("Before Sorting");
        for(int j=0; j<n; j++){
            System.out.print(arr[j] +" ");
        }
        System.out.println("");
        bubble_sort(arr, n);
    }
}

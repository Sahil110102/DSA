public class Selection {

    public static void selection_sort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int mini= i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }   
            int temp = arr[mini];
            arr[mini]= arr[i];
            arr[i]= temp;
        }
        System.out.println("After Selection Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {10, 4, 30, 5, 3, 7, 9, 2};
        int n = 8;

        System.out.println("Before Selection Sorting");
        for(int i =0; i< n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(" ");
        selection_sort(arr, n);

    }
}
package DividenConquer;
// For implementing merge sort we will follow 3 steps recursively
// 1) Divide the array 2 equal halves
// We can find the mid index by the formula (si + (ei-si)/2)
// This is equal to (si+ei)/2
// 2) Now sort the left and right arrays
// 3) Now merge the 2 sorted arrays
public class mergesort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-1909};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp array

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // For remaining elements in left or right
        // left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // copy temporary elements into original array
        for (k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
}

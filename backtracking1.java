// Here We will use backtracking to assign values to the array one by one 1,2,3,4,5
// then while the values get returned we will decrease them by 2

public class backtracking1{
    public static void backtracking(int arr[],int i,int val){
    //base condition
    if (i==arr.length){
        printArr(arr);
        return;
    }

    // recursive step
    arr[i]=val;
    backtracking(arr,i+1,val+1);
    arr[i]-=2;
    
    }

    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr []= new int[5];
        backtracking(arr,0,1);
        printArr(arr);
    }
}

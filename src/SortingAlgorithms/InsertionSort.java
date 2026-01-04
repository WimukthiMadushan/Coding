package SortingAlgorithms;

public class InsertionSort {
    public void sort(int[] arr){
        for(int i = 1;i < arr.length; i++){
            int key = arr[i];
            int j;
            for(j = i-1; j >= 0; j--){
                if(key < arr[j]){
                    arr[j+1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1] = key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}

package SortingAlgorithms;

public class BubbleSort {

    public void sort(int[] arr){
        for(int j = 0; j <= arr.length-1; j++){
            for(int i = 0; i < arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void improvedSort(int[] arr){
        boolean swapped;
        for(int j = 0; j < arr.length-1; j++){
            swapped = false;
            for(int i = 0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

}

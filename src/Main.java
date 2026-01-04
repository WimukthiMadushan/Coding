import CommanQuestions.ArrayReverse;
import SortingAlgorithms.BubbleSort;
import SortingAlgorithms.InsertionSort;


public class Main {
    public static void main(String[] args) {
        int[] array = {2,4,1,67,33,49,10,2,90,100,21,32,34,56,0};
        //var bubbleSort = new BubbleSort();
        //bubbleSort.improvedSort(array);

        //var insertionSort=new InsertionSort();
        //insertionSort.sort(array);

        var arrayReverse = new ArrayReverse();
        arrayReverse.reverse(array);
    }
}
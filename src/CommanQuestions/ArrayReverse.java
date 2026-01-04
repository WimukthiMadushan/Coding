package CommanQuestions;

public class ArrayReverse {
    public void reverse(int[] numbers){
        for(int i = 0; i < numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }


}

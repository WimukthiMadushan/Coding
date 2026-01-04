package CommanQuestions;

public class IsPrime {
    public boolean isPrime(int num) {
        if(num==1)
            return false;
        if(num==2)
            return true;
        for(int i = 2; i <= num - 1; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}

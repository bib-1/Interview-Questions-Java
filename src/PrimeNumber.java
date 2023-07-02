public class PrimeNumber {
    public static boolean isPrime(int num) {

        //0 and 1 are not Prime
        if(num == 0 || num == 1){
            return false;
        }

        //2 is Prime
        if(num == 2){
            return true;
        }

        for(int i = 2; i/2 < num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}

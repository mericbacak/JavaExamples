package BasicPrograms;

public class PrimeExample {
    public static void main(String[] args){
        int i,m;
        int n=3;//it is the number to be checked
        m=n/2;
        for (i = 2; i <= m; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime number");
                break;
            }
        }
        System.out.println(n + " is prime number");
    }
}

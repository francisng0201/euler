
public class problem10 {
    public static void main(String[] args){
        int x=0;     
        double sum=0;
        for (x = 2;x<=2000000;x++){
        	if (x%2!=0){
        	if (isPrime(x)) {
        		sum+=x;
        	}
        	}
        }
        System.out.println(sum+2);
    }
    
    private static boolean isPrime(long x) {
        for ( int i = 3 ; i*i <= x ; i+=2 ) {
            if ( x % i == 0 ) {
                return false;
            }               
        }
        return true;
    }
}

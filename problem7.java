
public class problem7 {
	static int N = 10001;
    public static void main(String[] args){
        int x;
        int i = 2;     
        for ( x = 3 ; ; x+=2 ) {
            if ( isPrime(x) ) {              
                if ( i == N )
                    break;
                i++;
            }
        }
        System.out.println(x);
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

public class problem2 {
 public static void main(String[] args){
     long i=1L;
     long c=1L,b=1L,a=0L;
     long total=0L;
     while(i<4000000	){
    	 c=b+a;
    	 if (c % 2 ==0) total +=c; 
    	 a=b;
    	 b=c;
    	 i++;
      }
    System.out.println(total);
     }
 }

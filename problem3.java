public class problem3 {
	public static void main(String[] args){
		 long number= 600851475143L;
		 long i=2L;
		 int j =1;
		 while (number>1)
		 {
		 while (number % i == 0)
		 {
			 number /= i;
		 }
		 i++;
		 if (i*i>number)
		 {
			 System.out.println(number);
			 j=1;
			 break;
		 }
	}
		 if (j==0)
			 System.out.println(i-1);
}}

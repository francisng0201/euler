
public class problem6 {
	public static void main(String[] args){
		double sumofsquares=0.0;
		double a=0.0;
		double squareofsum=0.0;
		for (int i =1;i<=100;i++){
			sumofsquares+=(i*i);
			a+=i;
		}
		squareofsum = a*a;
		System.out.println(squareofsum-sumofsquares);
	}
}

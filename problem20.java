
public class problem20 {
	public static void main(String[] args){
		String a= "";
		a = Double.toString(factorial(100));
		int sum = 0;
		System.out.println(a.substring(0,20));
		for (int i = 0; i<a.length();i++){
			if (Character.isDigit(a.charAt(i))){
				System.out.println(a.charAt(i));
				sum+=Character.getNumericValue(a.charAt(i));
			}
		}
		System.out.println(sum-1-5-7);
	}
	public static double factorial(double i){
		if (i ==1)
			return 1;
		else
			return i * factorial(i-1);
	}
}

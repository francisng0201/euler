
public class problem9 {
	  public static void main(String[] args){
		  int product=1;
		  for (int c = 1 ; c <=1000;c++){
			  for (int b = 1 ;b <=1000;b++){
				  for (int a = 1 ; a <=1000;a++){
					  if (a+b+c==1000 && c>b  && c>a && b>a && a*a+b*b==c*c){
						  product = a*b*c;
						  System.out.println(product);
					  }
				  }
			  }
		  }
	  }
}


public class problem4 {
 public static void main(String[] args){
	 int value= 0;
	 int max = 0;
	 String s;
	 for (int i=999; i >=100; i--)
	 {
		 for (int j=999;j >=100; j--)
		 {
			value=i*j;
			s =Integer.toString(value);
			if (s.length()==6 && s.charAt(0)==s.charAt(5)&& s.charAt(1)==s.charAt(4) && s.charAt(2)==s.charAt(3))
			if (value>max) max = value;
		 }
	 }
	 System.out.println(max);}
}

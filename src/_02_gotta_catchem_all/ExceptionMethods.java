package _02_gotta_catchem_all;

public class ExceptionMethods {
	Double quotient(double a, double b) throws IllegalArgumentException{
		int c = 0;
		c += a/b;
		if(b == 0.0){
			throw new IllegalArgumentException();
		}
		return (double) c;
	}
	String reverseString(String s) throws IllegalStateException{
		String temp = "";
		if (s.length() > 0) {
			for (int i = s.length() - 1; i >= 0; i--) {
				temp += s.substring(i, i + 1);
			}
			return temp;
		}
		else {
			throw new IllegalStateException();
		}
		
		
	}
}
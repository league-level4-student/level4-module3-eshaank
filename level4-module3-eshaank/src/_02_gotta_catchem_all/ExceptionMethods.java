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
}

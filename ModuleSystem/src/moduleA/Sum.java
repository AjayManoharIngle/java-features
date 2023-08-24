package moduleA;
import moduleC.Multiplication;

public class Sum {
	
	public static int add(int...x) {
		int sum = 0;
		for(int i : x) {
			sum = sum+i;
		}
		return sum+Multiplication.mult(10,20);
	}
	
	public static Multiplication multObj() {
		return new Multiplication();
	}

}

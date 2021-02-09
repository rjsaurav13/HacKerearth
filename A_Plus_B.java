import java.util.*;
import java.math.BigInteger;  

class TestClass {
    public static void main(String args[] ) throws Exception {
      	Scanner scanner = new Scanner(System.in);
		

		for (int i = 0; i < 7; i++) {
			BigInteger sum;
			BigInteger a = scanner.nextBigInteger();
			BigInteger b = scanner.nextBigInteger();
			sum = a.add(b); 
			System.out.println(sum);
		}
		scanner.close();

    }
}

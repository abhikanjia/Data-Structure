import java.util.Scanner;
import java.math.BigInteger;

public class SumOf255DigitNumber{
	public static void main(String[] args) {
		System.out.println("Enter Only Numbers : ");
		Scanner sc = new Scanner(System.in);
		BigInteger sum;
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);

		sum = b1.add(b2);

		System.out.println(sum);
	}
}
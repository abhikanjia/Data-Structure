import java.util.Scanner;

public class Swap_number{
	public static void main(String[] args) {
		swapping s1=new swapping();
		s1.swap();
	}

}

class swapping{
	void swap(){

		Scanner sc=new Scanner(System.in);
		int temp;
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("-----before swapping-----");
		System.out.println("first number is "+a+" and second number is "+b);
		temp=a;
		a=b;
		b=temp;

		System.out.println("-----after swapping-----");
		System.out.println("first number is "+a+" and second number is "+b);

	}
}
import java.util.Scanner;

public class Fact_Recursion{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();

			System.out.println("factorial is "+calcFact(n));
		
	}
	static int calcFact(int n){

			if(n==0){
				return 1;
			}
			else if(n==1){
				return 1;
			}
			else {
				return n*calcFact(n-1);
			}
		}
}
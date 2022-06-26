import java.util.Scanner;

public class Prime_Number{
	public static void main(String[] args) {
		boolean flag=false;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		

		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				
				flag=true;
				break;
			}
		}

		if(flag==true){
			System.out.println(n+" is not prime number");
		}
		else{
			System.out.println(n+" is prime number");
		}
	}
}
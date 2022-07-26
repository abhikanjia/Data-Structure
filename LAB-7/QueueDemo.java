import java.util.*;
import java.io.*;


 

class enter_queue{
		int [] arr=new int[100];
		int front=-1;
		int rear=-1;
	void enqueue(int n){
		if(front>99){
			System.out.println("QUEUE OVERFLOW");
		}
		else{
		front++;
		arr[front]=n;
		}
	}

	int dequeue(){
		if(front<=-1){
			System.out.println("QUEUE UNDERFLOW");
			return 0;
		}
		return arr[++rear];
	}
}
public class QueueDemo{
	public static void main(String[] args) {
		enter_queue q1=new enter_queue();
		Scanner sc=new Scanner(System.in);
		while(true){
             System.out.println("\n1.for enqueue\n2.for dequeue\n3. for Exit");
             int n=sc.nextInt();
             if(n==1){
                System.out.print("Enter a value for enqueue: ");
               q1.enqueue(sc.nextInt());
             }
             else if (n==2){
                System.out.println("Element dequeued is: "+q1.dequeue());
             }
             
             else if(n==3){
                break;
             }
         }

		
	}
}
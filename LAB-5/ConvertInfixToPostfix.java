
import java.util.*;
import java.io.*;

public class ConvertInfixToPostfix{
	static ConvertInfixToPostfix c1=new ConvertInfixToPostfix();
	public static void main(String[] args) {
		String exp="a+b";
		
		System.out.println(c1.ItoP(exp));
	}

	char [] arr=new char[100];
	static int top=-1;

	public void push(char n){
		if(top>=100){
			System.out.println("STACK OVERFLOW");
		}
		else{
			top++;
			arr[top]=n;
	}
}

	public char pop(){
		if(top<0){
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		return arr[top--];

	}


	public char peek(){
		if(top<0){
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		return arr[top];
	}

	 public int precedenc(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2; 
            case '^':
            return 3;
        }
        return ch;
    }

	
	public String ItoP(String exp){

		String result="";
		char c;

		for(int i=0;i<exp.length();i++){
			 c=exp.charAt(i);

			if(Character.isLetterOrDigit(c)){
				result+=c;
			}

			else if(c=='('){
				c1.push(c);
			}

			else if(c==')'){
				while(c1.peek()!='('){
					result+=pop();
				}
					c1.pop();
				
			}

			else{
				while(top!=-1 && !(c1.peek()=='(') && precedenc(c)<=precedenc(c1.peek()))
					result+=c1.pop();
					c1.push(c);
			}
		}



		while(top!=-1){
			result +=c1.pop();
		}
		return result;
	}
}

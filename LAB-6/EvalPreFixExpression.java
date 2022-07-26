import java.util.Scanner;

public class EvalPreFixExpression {

    static EvalPreFixExpression e1 = new EvalPreFixExpression();
    int[] arr1 = new int[100];
    static int top = -1;

    public void push(int n) {
        if (top >= 99) {
            System.out.println("Stack Overflow");
        }
        top++;
        n = arr1[top];
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
        }
        return arr1[top--];
    }

    static int Eval(String infix) {
        int v1 = 0;
        for (int i = 0; i < infix.length(); i++) {
            v1 = infix.charAt(i);

            if (Character.isLetter(v1)) {
                e1.push(v1);
            } else {
                int val1 = e1.pop();
                int val2 = e1.pop();


                switch (v1) {
                    case '+':
                        e1.push(Integer.parseInt(String.valueOf(val1 + val2)));
                        break;
                    case '-':
                        e1.push(Integer.parseInt(String.valueOf(val1 - val2)));
                        break;
                    case '*':
                        e1.push(Integer.parseInt(String.valueOf(val1 * val2)));
                        break;
                    case '/':
                        e1.push(Integer.parseInt(String.valueOf(val1 / val2)));
                        break;

                }
            }

        }
        return e1.pop();
    }

    public static void main(String[] args) {
        System.out.println("Enter Expression : ");
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        System.out.println("Ans : " + e1.Eval(infix));
    }
}
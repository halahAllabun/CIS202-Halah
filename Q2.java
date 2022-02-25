import java.util.*;
public class main {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the problrm: ");
        char[] problem = scanner1.nextLine().toCharArray();
        int Length = 0;

        for(char x: problem){
            if(!Character.isWhitespace(x)){
                queue1.enqueue(new Node((int) x));
                Length++;
            }
        }
        evaluate(queue1, Length);
    }

    private static void evaluate(Queue tokenQueue, int num){
        Scanner scanner2 = new Scanner(System.in);
        Stack stack1 = new Stack();
        for(int i=1; i<=num; i++){
            Node token = tokenQueue.dequeue();
            switch(token.variable){
                case (int)'+':
                case (int)'-':
                case (int)'/':
                case (int)'*':
                    performBinaryOp((char)token.variable, stack1);
                    break;
                case '=':
                    System.out.println("The result is: " + stack1.peek().variable);
                    break;
                default:
                    stack1.push(new Node(token.variable - '0'));
            }
            if(i!=num-1){
                System.out.print("Click ENTER to continue,Enter -0.1 to cancel: ");
                String cancel = scanner2.nextLine().strip();
                if(cancel.equals("-0.1")){
                    break;
                }
            }
        }
    }

    private static void performBinaryOp(char operation, Stack stack1){
        int x1 = stack1.pop().variable;
        int x2 = stack1.pop().variable;
        Node newNode;

        switch(operation){
            case '+':
                newNode = new Node(x2+x1);
                break;
            case '-':
                newNode = new Node(x2-x1);
                break;
            case '/':
                newNode = new Node(x2/x1);
                break;
            case '*':
                newNode = new Node(x2*x1);
                break;
            default:
                throw new IllegalArgumentException("ERROR: Unknown operator "+ operation );
        }
        stack1.push(newNode);
    }
}
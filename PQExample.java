import java.util.*;
import java.util.PriorityQueue;  
public class PQExample {
    public static void main (String [] args) {
   
        PriorityQueue<Integer> PQ1 = new PriorityQueue<Integer>();
        Scanner S1 = new Scanner(System.in);
        
        PQ1.add(109);
        PQ1.add(302);
        PQ1.add(208);
        PQ1.add(301);
        PQ1.add(204);
       
        System.out.println("To show how many is left till it's your turn: ");
        System.out.println("Enter the first 3 numbers of your work ID");
        System.out.println("[CEO: 1XX, Head department: 2XX, Manager:3XX, .etc..]");
        int num1 = S1.nextInt();
        PQ1.add(num1);
        
        System.out.println("------------------");
        
        while (!PQ1.isEmpty()) {
            System.out.println(PQ1.remove());
        }

    }
     
}
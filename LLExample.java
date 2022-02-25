import java.util.*; 
public class LLExample {
    public static void main (String [] args) {
        
        LinkedList<String> LL1 = new LinkedList<String>(); 
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        LL1.add("item1");
        LL1.add("item2");
        LL1.add("item3");
        LL1.add("item4");
        
        System.out.println("List of items: " + LL1); 
       
        System.out.println("Write ( 1 ) if you want to add an item, write ( 2 ) if you want to delete an item: ");
        int choice = input1.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("Enter the item: ");
                String IP1 = input2.nextLine();
                LL1.add(IP1);
                System.out.println("List of items after adding: " + LL1); 
                break;
            
            case 2:
                System.out.println("Enter the item: ");
                String IP2 = input2.nextLine();
                LL1.remove(IP2);
                System.out.println("List of items after deleting: " + LL1); 
                break;
        }
        
        
        
    }
    
}

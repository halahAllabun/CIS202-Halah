import java.util.*; 
public class TSExample {
    public static void main (String [] args) {
        
        TreeSet<String> TS1 = new TreeSet<String>();
        
        TS1.add("*CEO");
        TS1.add("*Vice President");
        TS1.add("A's Header department");
        TS1.add("A's Manager");
        TS1.add("B's Header department");
        TS1.add("B's Manager");
        TS1.add("C's Header department");
        TS1.add("C's Manager");
        
        //WE HAVE TO PRINT CEO + VICE EVERYTIME. 
        System.out.println(TS1);
        System.out.println("");
        
        TreeSet<String> sSet = new TreeSet<String>(); 
    
        Set<String> sSet1 = TS1.subSet("*CEO", true, "*Vice president", true);
        System.out.println("Highset positions in the company: "+ sSet1);
        
        Set<String> sSet2 = TS1.subSet("A's Header department", true, "A's Manager", true);
        System.out.println("Dep A: "+ sSet1 + sSet2);
        
        sSet2 = TS1.subSet("B's Header department", true, "B's Manager" , true);
        System.out.println("Dep B: "+sSet1 + sSet2);
        
        sSet2 = TS1.subSet("C's Header department", true, "C's Manager" , true);
        System.out.println("Dep C: "+sSet1 + sSet2);
    
    }
    
 }

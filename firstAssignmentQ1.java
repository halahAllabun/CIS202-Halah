import java.util.*;
 import java.lang.*;
public class firstAssignmentQ1 {   
    public static void main (String [] args) throws InterruptedException {
        
        int [] Array = new int [10000000];
        int [] keys = new int [50000];
        
        int [] LSteps = new int [50000];
        double [] LTime = new double [50000];
        
        int [] BSteps = new int [50000];
        double [] BTime = new double [50000];
        
        
        //RAMDOM:
        int max=10000;
        int min=1;
     
        //Random values for Array
        for(int i=0; i<Array.length; i++){
            Array[i]= (int) (Math.random()*(max-min+1)+min); }
            
                
        
        //Sorting the Array
        Sort(Array);
        
        
        //Random values for keys
        for(int i=0; i<keys.length; i++) {
            keys[i]= (int) (Math.random()*(max-min+1)+min);  }
        
        
        //LINEAR SEARCH
            linearSearch(Array, keys, LSteps, LTime);
            
        

        
        //BINARY SEARCH
            binarySearch(Array, keys, BSteps, BTime);
            
        
        
        //Cases for linear search
        
        System.out.println("Best case of linear search is: " + bestCase(LSteps));
        
        int avgCaseLinear = averageCase(LSteps);
        if(avgCaseLinear<0) { Math.abs(avgCaseLinear); }
        System.out.println("Average case of linear search is: " + avgCaseLinear);
       
        System.out.println("Worst case of linear search is: " + worstCase(LSteps));
        
        System.out.println(" ");
        
        //Cases for time in Linear search
        
        System.out.println("Best case of time in linear search is: " + (bestCaseT(LTime))+ " milliseconds");
        
        double avgCaseLinearTime = averageCaseT(LTime);
        System.out.println("Average case of time in linear search is: " + avgCaseLinearTime+ " milliseconds");
       
        System.out.println("Worst case of time in linear search is: " + (worstCaseT(LTime))+ " milliseconds"); 
        
        System.out.println(" ");
        
        //Cases for Binary search
        
        System.out.println("Best case of binary search is: " + bestCase(BSteps));
        
        int avgCaseBinary = averageCase(BSteps);
        System.out.println("Average case of binary search is: " + avgCaseBinary);
       
        System.out.println("Worst case of binary search is: " + worstCase(BSteps));
        
        System.out.println(" ");
        
       //Cases for time in Binary search
        
        System.out.println("Best case of time in binary search is: " + (bestCaseT(BTime))+ " milliseconds");
        
        double avgCaseBinaryTime = averageCaseT(BTime);
        System.out.println("Average case of time in binary search is: " + avgCaseBinaryTime+ " milliseconds");
       
        System.out.println("Worst case of time in binary search is: " + (worstCaseT(BTime))+ " milliseconds"); 
        
        
        
        
    }
    
    public static void linearSearch(int [] Array, int [] keys, int [] LSteps, double [] LTime) {
        
        
            for(int i=0; i<keys.length; i++) {    
                int numOfStepsL=0;
                long startTimeLinear = Calendar.getInstance().getTime().getTime();
                for(int j=0; j<Array.length; j++) {
                    numOfStepsL++;
                    if(keys[i]==Array[j]) { 
                        break; }
                    }  
                    
                LSteps[i]=numOfStepsL;
                
                long endTimeLinear = Calendar.getInstance().getTime().getTime(); 
                LTime[i]= ( endTimeLinear - startTimeLinear );
                }
            
    }
    
    public static void Sort(int [] Array) {
            
        
        for(int x=0; x<Array.length; x++) {
           int minx=Array[x];
           int indexMinx=x;
           
           for(int j=x+1; j<Array.length; j++) {
               if (minx>Array[j]) {
                   minx=Array[j];
                   indexMinx=j; }
                }
            
            
               if(indexMinx != x) {
                   Array[indexMinx] = Array[x];
                   Array[x] = minx; } 
        }
        
    }
    
    
    public static void binarySearch(int [] Array, int [] keys, int [] BSteps, double [] BTime) {
        
        int numOfStepsB=0;
        int low=0;
        int high=Array.length-1; 
        for(int i=0; i<keys.length; i++) {
           long startTimeBinary = Calendar.getInstance().getTime().getTime();
           while(low<=high) {
              numOfStepsB++;
              int m=(low+high)/2;
            
              if(keys[i]<Array[m]) {
                 high=m-1; }
              
              else if(keys[i]==Array[m]) {
                 break; }
                
              else 
                low=m+1;
            } 
        
        BSteps[i]=numOfStepsB;
        
        long endTimeBinary = Calendar.getInstance().getTime().getTime();
        BTime[i]= (endTimeBinary-startTimeBinary);
        
       }
    }
    
    public static int bestCase(int [] steps) {
        int min=steps[0];
        for(int i=1; i<steps.length; i++) {
            if(steps[i]<min) {
                 min=steps[i]; }
        }
        return min;
    }
    
    public static int averageCase(int [] steps) {
        int sum=0;
        for(int i=0; i<steps.length; i++) {
            sum+=steps[i];
        }
        return sum/steps.length;
    }
    
    public static int worstCase(int [] steps) {
        int max=steps[0];
        for(int i=1; i<steps.length; i++) {
            if(steps[i]>max) {
                 max=steps[i]; }
        }
        return max;
    }
    
    public static double bestCaseT(double [] time) {
        double minTime=time[0];
        for(int i=1; i<time.length; i++) {
            if(time[i]<minTime) {
                 minTime=time[i]; }
        }
        return minTime;
    }
    
    public static double averageCaseT(double [] time) {
        double sumTime=0;
        for(int i=1; i<time.length; i++) {
            sumTime+=time[i];
        }
        return sumTime/time.length;
    }
    
    public static double worstCaseT(double [] time) {
        double maxTime=time[0];
        for(int i=1; i<time.length; i++) {
            if(time[i]>maxTime) {
                 maxTime=time[i]; }
        }
        return maxTime;
    }
}

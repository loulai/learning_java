
public class Test {
	
	public static void main(String[] args) { 
       int n, k; 
       int max = 3;
       for (n = 0; n < max; n++) {  
    	   for (k = 0; k <= max; k++) {  
    		 if (n > k)
                System.out.print(" G ");
             else if (n < k)
                System.out.print(" L ");
             else
                System.out.print(" E ");
          }
          System.out.println();
       }
       
       
    }
    

}

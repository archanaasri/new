package length;

import java.util.Iterator;

public class Lengthindex {
	public static void main(String[] args) {
		String s = "Anbil Muthu Mari Amman";
		
	    String[] x= s.split(" ");
        for (int i = 0; i < x.length; i++) {
         System.out.println(x[i]);

      
	} 
        String[] y = s.split(" ", 2);
        for (String word : y) {
       	 System.out.println(word);
   		
	}
        String[] a = s.split(" ",4 );
        for (String words : a) {
        	System.out.println(words);
			
		}
        
		}			
		}
	



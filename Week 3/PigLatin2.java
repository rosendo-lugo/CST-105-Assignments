import java.util.Scanner;


public class PigLatin2 {		
	    private static Scanner trans; 

		public static void main (String[] args) {	    	
	    	        trans = new Scanner( System.in );
	    	        String Sentence="";
	    	        
	    	        do {  
	    	            String[] words; 
	    	            System.out.print("Enter your sentence below: ");
	    	            Sentence = trans.nextLine(); 
	    	            words = Sentence.split(" "); 
	    	            for (String word : words) { 
	    	            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
	    	            System.out.print(word + "way ");             
	    	            else
	    	            System.out.print(word.substring(1)+word.substring(0,1)+"ay "); 
	    	    		System.out.println("Original Word: " + word);
	    	        }	    	
	    	            
	    	        System.out.println();
	    } 
	    	        while(!Sentence.equals("quit"));     	        
	 }
}
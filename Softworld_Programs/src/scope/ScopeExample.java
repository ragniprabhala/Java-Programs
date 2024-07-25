package scope;

public class ScopeExample 
{
	

	   
	    static int classVar = 10;

	    
	    public static void main(String[] args) {
	        
	        int methodVar = 20;

	        System.out.println("Inside main method:");
	        System.out.println("classVar: " + classVar); 
	        System.out.println("methodVar: " + methodVar); 

	       
	        {
	            
	            int blockVar = 30;

	            System.out.println("\nInside block:");
	            System.out.println("classVar: " + classVar); 
	            System.out.println("methodVar: " + methodVar); 
	            System.out.println("blockVar: " + blockVar); 
	        }

	        //System.out.println("blockVar: " + blockVar); // Error: blockVar cannot be accessed outside the block
	    }

	    
	    public static void anotherMethod() {
	        // System.out.println("methodVar: " + methodVar); // Error: methodVar cannot be accessed outside the main method
	    }
	}


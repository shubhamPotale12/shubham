package sp;

public class Program4
 {
  public static void main(String[] args)
  {
	//  *
	// **
	//***  
	  //this is updated code by vikas
	  int space =2;
	  int star=1;
	  
	  for (int i = 1; i <=3; i++) 
	  {
		 
		  for (int j = 1; j <=space; j++)
		  {
			System.out.print(" ");
		  }
		  
		  for (int k = 1; k <=star; k++) 
		  {
			System.out.print("*");
		  }
		  
		  System.out.println();
		  
		  space--;
		  
		  star++;
		  
		
	  }
  }
	
 }

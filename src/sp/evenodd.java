package sp;

import java.util.Scanner;

public class evenodd {
	
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the no");
		 int num=s.nextInt();
		 
		 if (num%2==0) {
			System.out.println("enter   no is even");
		} else {
			System.out.println("enter   no not is even");
		}
	}

}

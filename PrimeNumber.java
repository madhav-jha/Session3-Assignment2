package session3.assignment2;

import java.util.Scanner;

public class PrimeNumber {
	
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
       long number = sc.nextLong();
       int i=0;
    	   if(number == 2)
    		   System.out.println(number+" is a prime number...");
    	   else
    		   for(i=2; i<=number; i++){
    			   if(number%i == 0)
    				   break;
    		   }
    	   if(i != number)
    		   System.out.println(number+" is not a prime number...");
    	   else
    		   System.out.println(number+" is a prime number..."); 
       
    	   }
      

}

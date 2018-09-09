package Important_Concepts;

import java.util.Arrays;

public class largest_smallest_interger {

	public static void main(String[] args) {
		int input[]={-10,23,45,-16,56,78,55};
        int largest=input[0];
        int smallest=input[0];
        
        for(int i=1;i<input.length;i++){
        	
        	 if (input[i]>largest){
        		 
        		  largest=input[i];
        		 
        	 }
        	 else if(input[i]<smallest){
        		 
        		 smallest= input[i];
        	 }
        }
        System.out.println("input array is -->"+Arrays.toString(input));
        
        System.out.println("Largest number is -->"+largest);
        System.out.println("Smallest number is -->"+smallest);
	}

}

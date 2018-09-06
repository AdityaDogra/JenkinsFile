package Important_Concepts;

public class Reverse_Integers {

	public static void main(String[] args) {
      long num =12345;
      System.out.println("The original integer is--->"+num);
      long rev =0;
      
      while (num!=0){
    	  
    	  rev = rev*10 + num%10;
    	  num = num/10;
    	  
      }
        System.out.println("The reversed integer is--->"+rev);
	}

}

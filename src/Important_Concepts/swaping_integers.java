package Important_Concepts;

public class swaping_integers {

	public static void main(String[] args) {
		int a= 123;
		int b= 45;
		System.out.println("the original value of ---> a="+a);
		System.out.println("the original value of ---> b="+b);

		a= a+b;
		b= a-b;
		a=a-b;
		
		System.out.println("After sweaping the value of ---> a="+a);
		System.out.println("After sweaping the value of---> b="+b);
	}

}

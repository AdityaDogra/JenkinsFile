package Important_Concepts;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s= "Aditya Dogra";
		String Rev = "";
		System.out.println("the Actual string is-->" + s );
		int length= s.length();
		for (int i = length-1;i>=0;i--){
			Rev = Rev+(s.charAt(i));
			
		}
System.out.println("the reversed string is-->" + Rev );
	}

}

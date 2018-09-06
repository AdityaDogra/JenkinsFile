package Important_Concepts;

public class Regular_expression {

	public static void main(String[] args) {
		
		String s ="!@#$%^&* Aditya !@#$% Dogra 3425435";
		System.out.println("garbage string is--->" +s);
      // remove these unwanted things
		
		String corrected = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("Useful string is--->"+corrected);
		
	}

}

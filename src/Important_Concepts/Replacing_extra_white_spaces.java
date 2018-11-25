package Important_Concepts;

public class Replacing_extra_white_spaces {

	public static void main(String[] args) {
			

	        String input= "I  love   my    country       ";
	        System.out.println(input.length());
	        String output=input.replaceAll("\\s+", " ").trim();
	        System.out.println("The output is : "+output);
	        System.out.println(output.length());


	}

}

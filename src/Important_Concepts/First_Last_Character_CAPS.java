package Important_Concepts;

public class First_Last_Character_CAPS {

	public static void main(String[] args) {
		String output="";
		String input= "i love my country";
		System.out.println("The input is : "+input);
		//Splitting string into array of strings
		String inputarray[]= input.split(" ");
		for(int i=0;i<inputarray.length;i++){
			String a=inputarray[i];
			int b=a.length();
			//converting first character to upper case
			String firstcap=Character.toUpperCase(a.charAt(0))+a.substring(1);
			// using length of the each string to convert the last character to upper case
			String firstlastcap=firstcap.substring(0, firstcap.length()-1)+Character.toUpperCase(firstcap.charAt(b-1));
			//using concat to create a new string
			output= output.concat(firstlastcap+" ");
		}
		// using trim to remove the last extra space
		input=input.replaceAll(input, output).trim();
		System.out.println("The output is: "+input);
	}

}

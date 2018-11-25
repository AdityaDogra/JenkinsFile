package Important_Concepts;

public class First_Last_Character_CAPS {

	public static void main(String[] args) {
		String output="";
		String input= "i love my country";
		System.out.println("The input is : "+input);
		String inputarray[]= input.split(" ");
		//System.out.println(inputarray.length);
		for(int i=0;i<inputarray.length;i++){
			String a=inputarray[i];
			int b=a.length();
			String firstcap=Character.toUpperCase(a.charAt(0))+a.substring(1);
			String firstlastcap=firstcap.substring(0, firstcap.length()-1)+Character.toUpperCase(firstcap.charAt(b-1));
			output= output.concat(firstlastcap+" ");
		}
		input=input.replaceAll(input, output).trim();
		System.out.println("The output is: "+input);
	}

}

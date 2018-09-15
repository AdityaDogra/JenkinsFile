package Important_Concepts;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

public class first_and_last_character_of_string_caps {

	public static void main(String[] args) {
		String input= "i love my country";
		String firstcaps= WordUtils.capitalize(input);
		System.out.println(firstcaps);
		String reversefull= StringUtils.reverse(firstcaps);
		System.out.println(reversefull);
		String firstcaps2= WordUtils.capitalize(reversefull);
		System.out.println(firstcaps2);
		String reversefull2= StringUtils.reverse(firstcaps2);
		System.out.println(reversefull2);
	}

}

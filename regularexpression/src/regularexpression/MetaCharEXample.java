package regularexpression;

import java.util.regex.*;

public class MetaCharEXample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(digits)
		System.out.println(Pattern.matches("\\d", "abc"));
		
		System.out.println(Pattern.matches("\\d", "1"));
		
		System.out.println(Pattern.matches("d", "4443"));
		System.out.println(Pattern.matches("\\d", "323abc"));
		//(non-digit)
		System.out.println("metacharacters D........");
		System.out.println(Pattern.matches("\\D", "ABC"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "4443"));
		System.out.println(Pattern.matches("\\D", "323abc"));
	}

}

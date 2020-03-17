package one;

import java.util.regex.Pattern;

public class UserMainCode 
{
	public static void validatePassword(String str)
	{
			System.out.println(Pattern.matches("((?=.*\\d)(?=.*[@#$%!])(?=.*[A-Z]).{6,20})", str));
		
	}
}

package three;

import java.util.regex.Pattern;

public class UserMainCode 
{
	public static void colorValidator(String s)
	{
		System.out.println
		(Pattern.matches("^#([A-Fa-f0-9]{6})$", s));
	}
}

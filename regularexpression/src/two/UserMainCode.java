package two;

import java.util.regex.Pattern;

public class UserMainCode 
{
	public static void validateFormat(String str)
	{
		String s1="[P][R][O]([a-zA-Z]{4})([0-9]{3})";
		String s2="[F][I][N]([a-zA-Z]{4})([0-9]{3})";
		String s3="[T][e][s][t]([a-zA-Z]{4})([0-9]{3})";
		if(Pattern.matches(s1,str)||Pattern.matches(s2,str)
				||Pattern.matches(s3,str))
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
				
	}
}

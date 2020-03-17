package regularexpression;
import java.util.regex.*;
public class CharacterExample
{
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("[xyz]{3}","xyz"));
		System.out.println(Pattern.matches("[^xyz]","x"));
		System.out.println(Pattern.matches("[xyz]","xxyyyyyz"));
	}
}

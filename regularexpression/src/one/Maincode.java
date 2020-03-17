package one;

import java.util.Scanner;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maincode {

	public static void main(String[] args) 
	{//boolean flag=;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password to Validate");
		String str=sc.next();
		//UserMainCode.validatePassword(str);
		String str1="((?=.*\\d)(?=.*[@#$%!])(?=.*[a-zA-Z]).{6,})";
	Boolean b=Pattern.matches(str1,str);
	//Matcher matcher=pattern.matcher(str);

	if(b)
	{
	
		System.out.println("sucessful");
	}
	else
	{
		System.out.println("unsucessful");
	}
		//System.out.println(Pattern.matches(str1,str));
	}

}

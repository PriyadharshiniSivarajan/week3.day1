package week3.day1;

public class CompareStrings {

	public static void main(String[] args) {

		String str1="I am Learning Java";
		String str2="I am learning java";
		{
		if(str1==str2)
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println("== cannot be used for string");
		}
		}
		if(str1.equals(str2))
		{
			System.out.println("Case is  ignored");
		}
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Case is ignored 1 and 2 are same");
		}


	}

}

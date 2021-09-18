package week3.day1;

public class replaceCharacter {

	public static void main(String[] args) {
		String str ="I am working with Java8";
	    System.out.println(str.length());
		//repleces the string with given string
		String str1 = str.replaceAll("8","11");
		System.out.println("The repleaced string is "+str1);
		//concatenation operator
		System.out.println(str+"#");
		char[] q = str.toCharArray();
		for(int i=5;i<=13;i++)
		{
			System.out.print(q[i]);
		}
	}

}

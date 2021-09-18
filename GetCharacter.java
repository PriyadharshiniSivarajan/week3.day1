package week3.day1;

public class GetCharacter {

	public static void main(String[] args) {
		String text = "Java Exercise";
		char[] q = text.toCharArray();
		for(int i=0;i<(q.length );i++)
		{
			if(q[i]=='E') {
				System.out.println("The index is:"+i);
			}
			if(q[i]=='s'){
					System.out.println("The indes os 's' is "+i);
		}
		

	}

}
}
 
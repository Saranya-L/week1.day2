package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value1="Madam";
		int length1=value1.length();
		String value2="";
		
		for(int i=(length1-1);i>=0;i--)

		{
			value2=value2+value1.charAt(i);
		}
		

	 System.out.println("String1 "+value1+ "\nString2 "+value2);
		if(value1.equalsIgnoreCase(value2))
		{
			System.out.println("It is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}
}


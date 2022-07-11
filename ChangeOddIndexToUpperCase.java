package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] name=test.toCharArray();
		int length=name.length;

		for(int i=0;i<length;i++)
		{
			if(i%2!=0) {
				//to convert a character to upper case
				name[i]=Character.toUpperCase(name[i]);
				
						}	
		}
		System.out.print(name);
	}

}

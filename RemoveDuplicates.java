package week1.day2;

import java.util.StringTokenizer;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String breaktext[];
		int count=0;
		breaktext=text.split(" ");
		String finaltext="";

		for(int i=0;i<breaktext.length;i++)
		{
			for(int j=i+1;j<breaktext.length;j++)
			{
				if(breaktext[i].equals(breaktext[j]))
				{
					count=count+1;	
				if(count!=0)
				{
					breaktext[j]="";
				}
				}
				}
			if(count!=0)
			{
				count=0;
			}
		}
		for (String word : breaktext) 
		{
			finaltext=finaltext+" "+word;
		}
		System.out.println(finaltext);
	}

}

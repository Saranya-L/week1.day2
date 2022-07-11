package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {3,76,24,5,7,81};
		int[] array2= {9,45,7,3,24,83,67,34,91};

		int length1=array1.length;
		int length2=array2.length;

		for(int i=0;i<length1;i++)
		{
			for(int j=0;j<length2;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}
			}
		}

	}

}

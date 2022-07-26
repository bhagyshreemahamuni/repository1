package ascending;

import java.util.Arrays;

public class exampl1 {
	public class stringarraysort 
	{
		public static void main(String[] args) 
		{
			String [] str= {"Priya","Neha","suresh","Kajal","Pankaj","Aarti"};
			System.out.println("Original array: ");
			for(String s: str)
			{
				System.out.print(s+" ");
			}
			
			//sort array in ascending order
			// Aarti  Kajal Neha Pankaj Priya Suresh
			System.out.println();
			System.out.println("Sorted array in ascending order");
			Arrays.sort(str);
			for(String s:str)
			{
				System.out.print(s+" ");
			}
		}
	}

}

package unknown;
import java.util.*;
public class a1 {
	
	public static String findMostFrequentWord(String str)
	{
		int count=0,tempCount=0;
		String temp = null;
		String strArray[] = str.split(" ");

		for(int i=0;i<strArray.length;i++)
		{
			for(int j=0;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j]))
				{
					tempCount++;
				}
			}
			if(tempCount > count)
			{
				count = tempCount;
				temp = strArray[i];
			}
			tempCount = 0;	
		}

		return temp;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String store = findMostFrequentWord(str);

		System.out.println(store);

		sc.close();
	}

}

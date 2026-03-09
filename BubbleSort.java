import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  	{
    	int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum;

		//Loop once for each pass, where passes is one less than the number of items.
		for (passes = 1; passes < myNums.length; passes++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for (comparisons = 0; comparisons < (myNums.length - passes); comparisons++)
			{
				//If they are out of order, swap the values
				if (myNums[comparisons] > myNums[comparisons + 1])
				{
					tempNum = myNums[comparisons];
					myNums[comparisons] = myNums[comparisons + 1];
					myNums[comparisons + 1] = tempNum;
				}
			}
			//End Loop for comparisons
    
			//The next pass will use one less comparison
		}

		System.out.println(Arrays.toString(myNums));


		System.out.println(Arrays.toString(bubbleSort(myNums)));
  	}

	public static int[] bubbleSort(int[] jim){
		int passes;
		int comparisons;
		int tempNum;

		for (passes = 1; passes < jim.length; passes++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for (comparisons = 0; comparisons < (jim.length - passes); comparisons++)
			{
				//If they are out of order, swap the values
				if (jim[comparisons] > jim[comparisons + 1])
				{
					tempNum = jim[comparisons];
					jim[comparisons] = jim[comparisons + 1];
					jim[comparisons + 1] = tempNum;
				}
			}
			//End Loop for comparisons
    
			//The next pass will use one less comparison
		}

			return jim;
		}
}

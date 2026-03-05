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
		//End Loop for passes
		System.out.print("[");

		for (int i = 0; i < myNums.length; i++)
		{
			System.out.print(myNums[i] + ", ");
		}

		System.out.print(" no more]");


  	}
}

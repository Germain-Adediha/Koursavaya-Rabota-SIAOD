
import java.util.*;

public class MaxNumber {

	
	static void printLargest(Vector<String> arr)
	{

		Collections.sort(arr, new Comparator<String>()
		{
			
			@Override public int compare(String X, String Y)
			{

				// first append Y at the end of X
				String XY = X + Y;

				// then append X at the end of Y
				String YX = Y + X;

			
				// Now see which one of the two formed number is greater
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});

		Iterator it = arr.iterator();

		while (it.hasNext())
			System.out.print(it.next());
	}

	public static void main(String[] args)
	{

		Vector<String> arr;
		arr = new Vector<>();
		arr.add("1114");
		arr.add("546");
		arr.add("748");
		arr.add("600");
		printLargest(arr);
	}
}

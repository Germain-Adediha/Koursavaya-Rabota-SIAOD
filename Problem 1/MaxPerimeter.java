import java.io.*;
import java.util.*;

public class MaxPerimeter
{

	// Function to count all possible triangles with arr[] elements
	static int maxperimeter(int arr[], int n)
	{
		
	int perimetr=0;
	int maxP=0;
		// The three loops select three different values from array
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
	 
				// The innermost loop checks for  the triangle property
				for (int k = j + 1; k < n; k++)
	
					
					// somme de deux cotes doit etre superieur au troisieme cote
					if (
						arr[i] + arr[j] > arr[k]
						&& arr[i] + arr[k] > arr[j]
						&& arr[k] + arr[j] > arr[i]){
						
						perimetr=arr[i] + arr[j] + arr[k];
					if(perimetr>maxP ){
					maxP=perimetr;
					}
					}

			}
		}
		return maxP;
		
	}
	
	
	public static void main(String[] args)
	{
		int [] arr = {1,2,1 ,6,8,5,10};
		int size = arr.length;
	  Arrays.sort(arr);
	  //Arrays.toString(arr);
	  System.out.println(Arrays.toString(arr));
		System.out.println( "Maximun perimeter : "+ maxperimeter(arr, size));
	}
}



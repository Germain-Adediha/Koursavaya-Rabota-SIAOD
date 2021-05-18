import java.util.*;

public class LongestPalindromeSubStr{

// Function to print a subString str[low..high]
static void printSubStr(String str, int low, int high)
{
	for (int i = low; i <= high; ++i)
		System.out.print(str.charAt(i));
}


// Cette fonction donne le plus long palindrome retrouvee dans un string 
static void  longestPalSubstr(String str)
{
	
	int n = str.length(); // longueur du string

	// tout les string de longueur 1 sont des palindromes
	int maxLength = 1, start = 0;

	// Nested loop to mark start and end index
	for (int i = 0; i < str.length(); i++) {
		for (int j = i; j < str.length(); j++) {
			int flag = 1;

			// Recherche de palindrome
			for (int k = 0; k < (j - i + 1) / 2; k++)
				if (str.charAt(i + k) != str.charAt(j - k))
					flag = 0;

			// Palindrome
			if (flag!=0 && (j - i + 1) > maxLength) {
				start = i;
				maxLength = j - i + 1;
			}
		}
	}

	System.out.print("Longest palindrome subString is: ");
	printSubStr(str, start, start + maxLength - 1);

	// affichage de la longueur du palindrome
//	return maxLength;
}


public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	longestPalSubstr(str);
//	System.out.print("\nLength is: ", + longestPalSubstr(str));
}
}


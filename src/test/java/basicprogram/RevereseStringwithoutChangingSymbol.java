package basicprogram;

public class RevereseStringwithoutChangingSymbol {
	public boolean isAlphabet(char value)
	{
		if ((value >= 'a' && value <= 'z') || 
            (value >= 'A' && value <= 'Z'))
		{
			return true;
		}
		return false;
	}
	public void reverseAlphabet(String text)
	{
		// Get number of characters in text
		int n = text.length();
		// Before replace text
		System.out.print(" Before : " + text);
		int low = 0;
		int high = n - 1;
		String first = "";
		String last = "";
		while (low < high)
		{
			if (isAlphabet(text.charAt(low)) == true &&
                isAlphabet(text.charAt(high)) == true)
			{
				// Both char is Alphabet
				first = first + text.charAt(high);
				last = text.charAt(low) + last;
				low++;
				high--;
			}
			else
			{
				if (isAlphabet(text.charAt(low)) == false)
				{
					first = first + text.charAt(low);
					low++;
				}
				if (isAlphabet(text.charAt(high)) == false)
				{
					last = text.charAt(high) + last;
					high--;
				}
			}
		}
		first += last;
		// Display result
		System.out.print("\n After : " + (first) + " \n");
	}
	public static void main(String[] args)
	{
		RevereseStringwithoutChangingSymbol task = new RevereseStringwithoutChangingSymbol();
		// Test A
		task.reverseAlphabet("(e)x>chan?gi@n!g");
		
	}
}
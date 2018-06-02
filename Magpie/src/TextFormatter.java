
public class TextFormatter {
	private String line; //line to format
	public TextFormatter (String lineToFormat) 
	{
		line = lineToFormat;
	}
	/**
	 * Finds the first single instance of str in line,
	 * starting at the position of start
	 * @param str the string of length 1 to find.
	 * Guaranteed to be at length 1.
	 * @param start the position to start searching
	 * @return the index of the first single is found or -1 if it is not found
	 */
	
	public int findString (String str, int start)
    {
      int psn = line.indexOf(str, start);
      while (psn >= 0) {
        //  find the string of length 1 before and after the instance found
        String before = "";
        String after = "";
        if (psn > 0)
          before = line.substring(psn - 1, psn);
	   if (psn < line.length() - 1)
	     after = line.substring(psn + 1, psn + 2);
	   //  If the before and after are different from
	   //  this string, we've found the position.
	   if (!before.equals(str) && !after.equals(str))
		   return psn;
	   //  If not, look for the next position
	   psn = line.indexOf (str, psn + 1);
     }
     //  Otherwise, the string isn't found.
     return -1; 
   }
	
	/**
	 * Coin the number of times single instances of str appear in the line.
	 * @param str the string to find.
	 * Guaranteed to be length 1
	 * @return the number of times the string appears in the line
	 */
	
	private int countStrings (String str)
	{
		int count = 0;
		  int psn = 0;
		  while (findString (str, psn) >= 0)
		  {
			count++;
			psn = findString (str, psn) +1;
		  }
		  return count;
	}
	
}

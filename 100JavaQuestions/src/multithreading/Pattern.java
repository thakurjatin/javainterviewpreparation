package multithreading;

class Pattern
{
  
	public static void main (String[] args)
	{

	  int n = 5;
	  pattern(n, 2);
	}
	static void printrow(int num)
	{
	 
	  if (num == 0)
	    return;
	  System.out.print ("* ");
	
	  
	  printrow(num - 1);
	}
	 
	static void pattern(int n, int i)
	{
	 
	  if (n == 0)
	    return;
	  printrow(i);
	  System.out.println();
	
	  pattern(n - 1, i + 1);
	}
	
	}




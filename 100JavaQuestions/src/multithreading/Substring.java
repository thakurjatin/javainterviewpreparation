package multithreading;

class Substring {
	  static String X,Y;
	  public static void main(String[] args)
	  {
		
	    int i, j;
	     X = "abcde";
	     Y = "bdgek";
	
	    i = X.length();
	    j = Y.length();
	
	    System.out.println(recursion(i, j, 0));
	  }
	  
	  static int recursion(int a, int b, int num)
	  {
	
	    if (a == 0 || b == 0)
	    {
	      return num;
	    }
	
	    if (X.charAt(a - 1)  == Y.charAt(b - 1))
	    {
	      num = recursion(a - 1, b - 1, num + 1);
	    }
	    num = Math.max(num, Math.max(recursion(a, b - 1, 0),recursion(a - 1, b, 0)));
	    return num;
	  }
	  
	  
	}
	

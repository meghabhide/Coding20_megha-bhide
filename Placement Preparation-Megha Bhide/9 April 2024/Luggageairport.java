import java.util.*;
class Luggageairport
{
  static int weightMachine (int N, int weights[],int T)
  {
    int amount = 0, i;
    for (i = 0; i < N; i++)
    {
	   amount++;
	   if (weights[i] > T)
	   {
	      amount++;
	    }
    }
    return amount;
  }

  public static void main (String[]args)
  {
    System.out.println("Enter the input:");
    Scanner sc = new Scanner (System.in);

    int n = sc.nextInt ();
    int weights[]= new int[n];
    
    for(int i=0; i<n; i++)
      weights[i] = sc.nextInt();
    
    int t = sc.nextInt ();
    
    System.out.println("Output:"); 
    System.out.println (weightMachine(n, weights, t));
    
      
  }

}
public class Prime
{
  public static void main (String[]args)
  {
    int n = 97, count = 0;
      
 
    for (int i = 1;i <= n; i++)
      {
	if (n % i == 0)
         {
	  count++;
         }
      }
  
 
    if(count==2)
      System.out.println ("The given  number is  prime Number");

    else
      System.out.println ("The given  number  is  not prime Number");
  
  }
}
public class PrimeInRange
{
  public static void main (String[]args)
  {
    int a=5,b=17,i,j;
      
 
    for ( i = a;i <= b; i++)
      {

      for(j=2;j<=i;j++)
         {
          if(i%j==0)
             break;
            
         }
      if (i == j)
       
	        System.out.println (i);

       }  
        
  }
}
  
 
    
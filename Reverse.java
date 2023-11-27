public class Palindrome
 {
   public static void main (String[]args)
   {
     
     int n =12021, s = 0, c, r;

       c = n;
    
     while (n> 0)
       {
     	r = n % 10;
     	s = s * 10 + r;
     	n /= 10;
       };

     if (c == s)
       System.out.println (Number is Palindrome");
     else
       System.out.println (Number is not Palindrome");
   }
 }
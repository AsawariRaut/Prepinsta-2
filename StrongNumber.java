class StrongNumber
{
public static void main(String args[])
{
  int f=1;
  int sum=0;
  int n=125;
  int num=n;

  
while(n>0)
{
   int d=n%10;
   for(int i=1;i<=d;i++)
{
  f=f*i;
}
sum=sum+f;
n=n/10;
}
if(num==sum)
{
System.out.println("Strong Number ");
}
else
{
System.out.println("Not Strong Number"); 
}

}
}



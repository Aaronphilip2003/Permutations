/*PROGRAM TO CALCULATE NUMBER OF PERMUTATIONS */
import java.io.*;
class Main {
  static int fact(int n)throws IOException
{
  int f=1;
  for(int i=1;i<=n;i++)
  {
    f*=i;
  }
  return f;


}
  public static void main(String[] args)throws IOException 
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=0,nfact=0,nmrfact=0,r=0,nmr=0,ans=0;
    System.out.println("Enter the value of n:");
    n=Integer.parseInt(br.readLine());
    nfact=fact(n);
    System.out.println("Enter the value of r");
    r=Integer.parseInt(br.readLine());
    nmr=n-r;
    if(nmr>0)
    {
      nmrfact=fact(nmr);
    }
    else if(nmr==0)
    {
      nmrfact=1;
    }
    else
    {
      System.out.println("NOT DEFINED");
    }
    ans=(nfact)/(nmrfact);
    System.out.println("Number of Permutations:"+ans);


  }
}
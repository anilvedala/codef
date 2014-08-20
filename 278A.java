import java.util.Scanner;
public class Dist
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
String b=sb.nextLine();
String a[]=b.split(" ");
int d[]=new int[n];
for(int i=0;i<n;i++)
{
d[i]=Integer.parseInt(a[i]);
}
String e=sb.nextLine();
String f[]=e.split(" ");
int s1=Integer.parseInt(f[0]);
int t=Integer.parseInt(f[1]);
int sum=0;
if(s1<=t)
{
for(int i=s1-1;i<=(t-2);i++)
                                           {
										   sum=sum+d[i];
										   }
										   }
else
{
int p=s1;
s1=t;
t=p;
for(int i=s1-1;i<=(t-2);i++)
                                           {
										   sum=sum+d[i];
										   }
										   }

										   int totsum=0;
for(int i=0;i<n;i++)
{totsum=totsum+d[i];
}	
int totsum1=totsum-sum;		   
if(sum<=totsum1)
{
  System.out.println(sum);
}
else
{
  System.out.println(totsum1);
}
}
}
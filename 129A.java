import java.util.Scanner;
public class Steal{
public static void main(String ae[]){
Scanner sb=new Scanner(System.in);
String s= sb.nextLine();
int n=Integer.parseInt(s);
String s1=sb.nextLine();
String f[]=s1.split(" ");
int a[]=new int[n];
int sum=0,count=0;
for(int i=0;i<n;i++)
          {a[i]=Integer.parseInt(f[i]);
      sum=sum+a[i];
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		  int o=sum-a[i];
		  if(o%2==0)
		  {count=count+1;
		  }
		 } System.out.println(count);
		  }
		  }
		  

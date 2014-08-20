import java.util.Scanner;
public class Read{
public static void main(String ae[]){
Scanner sb=new Scanner(System.in);
String s= sb.nextLine();
int n=Integer.parseInt(s);
String s1=sb.nextLine();
String f[]=s1.split(" ");
int a[]=new int[7];
int sum=0;
int i;
for( i=0;i<7;i++)
{
a[i]=Integer.parseInt(f[i]);

}

while( sum<n)
                 {
				 for(int i=0;i<7;i++)
                            {sum=sum+a[i];
							if(sum>=n){ System.out.println(i+1);
							   break;
							 }}
			 
			  }
			  }
			  }
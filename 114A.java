import java.util.Scanner;
public class Cifera
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int k=Integer.parseInt(s);
String s1=sb.nextLine();
int l=Integer.parseInt(s1);
int m=k;
int i=0;
while(m<l) {
          m=m*k;
		  i++;
		  }
		  if(m==l) {
		          System.out.println("YES");
				  System.out.println(i);
				  }
		   else {
		           System.out.print("NO");
				   }
				   }
				   }
				   
				  
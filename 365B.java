import java.util.Scanner;
public class Fib
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
String p=sb.nextLine();
String p1[]=p.split(" ");
int a[]=new int[n];
for(int i=0;i<n;i++) {
        a[i]=Integer.parseInt(p1[i]);
		}
		if(n==1||n==2) { System.out.print(n);}
		else {
		    int c=2;
			 int max=2;
		     for(int j=2;j<n;j++) {
			          if(a[j]==(a[j-1]+a[j-2]) ){c++;}
                       else {
                                 if(c>max) {
                                             max=c;
                                              c=2;
                                               }c=2;
                       }
                  }
     				   if(c>max) {
                                             max=c;}
						System.out.print(max);
						}
						}}
						
       
import java.util.Scanner;
public class B439{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int n=Integer.parseInt(s2[0]);
int x=Integer.parseInt(s2[1]);
String s3=sb.nextLine();
String s4[]=s3.split(" ");
int a[]=new int[n];
for(int i=0;i<n;i++){
                 a[i]=Integer.parseInt(s4[i]);
	  int j=i;
	  while(1>0){if(j==0) break;
	   if(a[j]<a[j-1]){
	                int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
					j--;
					if(j==0) break;
					}
		 
		else break;
        }
		}
int c=0;
for(int i=0;i<n;i++){
       c=c+x*a[i];
	   if(x>1) x--;
	   }
	   System.out.print(c);
	   }}
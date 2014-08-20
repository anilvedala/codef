import java.util.Scanner;
public class A435{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int n=Integer.parseInt(s2[0]);
int m=Integer.parseInt(s2[1]);
String s3=sb.nextLine();
String s4[]=s3.split(" ");
int c=0,p1=0;
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(s4[i]);
	}
	int i=0;
while(i<n){
        int p=m;
		c++;
		while(a[i]<p){
		          p=p-a[i];
		          i++;
				  p1=1;
				  if(i>=n) break;
				  }
				  if(p1==0) i++;
				  
		}
		System.out.print(c);
		}
		}
import java.util.Scanner;
public class Mashmok
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String s1[]=s.split(" ");
int n=Integer.parseInt(s1[0]);
int m=Integer.parseInt(s1[1]);
String s2=sb.nextLine();
int a[]=new int[n];
String s3[]=s2.split(" ");
int d=0;
int o=0;
for(int i=0;i<m;i++) {
     d=Integer.parseInt(s3[i]);
	 for(o=d-1;o<n;o++) {
	                if(a[o]>0) {break;}
					else {a[o]=d;}
					}
					}
for(int i=0;i<n;i++) {
System.out.print(a[i]+" ");
}
}
}

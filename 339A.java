import java.util.Scanner;
public class Helpful{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s3=s1.replace('+',' ');
String s2[]=s3.split(" ");
int h=0;
int a[]=new int[s2.length];
for(int i=0;i<s2.length;i++){
       a[i]=Integer.parseInt(s2[i]);
	   int j=i;
   	   while(1>0){
	   if(j==0) break;
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
		String s="";
		for(int i=0;i<s2.length-1;i++){
		  s=s+a[i]+"+";
		  }
		  System.out.print(s+a[s2.length-1]);
		  }}
import java.util.Scanner;
public class A389{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
int n=Integer.parseInt(s1);
String s3[]=s2.split(" ");
int a[]=new int[n];
for(int i=0;i<n;i++){
  a[i]=Integer.parseInt(s3[i]);
  }
 int b[]=new int[n-1];
 while(1>0){
 for(int i=0;i<n;i++){
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
		int min=200;
		int k=0;
	for(int i=0;i<n-1;i++){
	       b[i]=a[i+1]-a[i];
		   if(b[i]<min){min=b[i];k=i+1;}
		   }
		   if(min!=0){
		   a[k]=a[k]-a[k-1];}
		   else {System.out.print(n*a[0]);break;}
		   }}}
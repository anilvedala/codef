import java.util.Scanner;
public class Point{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
String s11[]=s1.split(" ");
int n=Integer.parseInt(s11[0]);
int k=Integer.parseInt(s11[1]);
String s3[]=s2.split(" ");
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(s3[i]);
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
		if(n>k){
		     System.out.print((a[n-k-1]+1)+" "+a[n-k-1]);
		     }
		else if(n==k){
		     System.out.print("0 0");
			  }
		else{
		System.out.print("-1");
		}}}

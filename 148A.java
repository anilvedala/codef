import java.util.Scanner;
public class Market{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
String s3=sb.nextLine();
String s4=sb.nextLine();
String s5=sb.nextLine();
int k=Integer.parseInt(s1);
int l=Integer.parseInt(s2);
int m=Integer.parseInt(s3);
int n=Integer.parseInt(s4);
int d=Integer.parseInt(s5);
int a[]=new int[d];
int c=0;
if((n==1)||(m==1)||(l==1)||(k==1)){
                     System.out.print(d);
					 }
else{
    int g=k-1;
	while(g<d){
	      if(a[g]==0){a[g]=1;c++;}
		  g=g+k;
		  }
		  g=l-1;
		while(g<d){
	      if(a[g]==0){a[g]=1;c++;}
		  g=g+l;
		  }
g=m-1;
		while(g<d){
	      if(a[g]==0){a[g]=1;c++;}
		  g=g+m;
		  }		  
g=n-1;
		while(g<d){
	      if(a[g]==0){a[g]=1;c++;}
		  g=g+n;
		  }
		  
		  System.out.print(c);}
		  }}
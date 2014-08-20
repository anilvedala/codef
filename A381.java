import java.util.Scanner;
public class A381{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s3=sb.nextLine();
String s2[]=s3.split(" ");
int n=Integer.parseInt(s1);
int a[]=new int[n];
for(int i=0;i<n;i++){
     a[i]=Integer.parseInt(s2[i]);
	 }
	 int i=0,j=n-1;
	 int q=0,w=0;
	 for(int y=0;y<n;y++){
	    if(y%2==0){
		if(a[i]>=a[j]){
		              q=q+a[i];
					  i++;
					  }
		else{
		           q=q+a[j];
				   j--;
				   }
		}
		else{
		if(a[i]>=a[j]){
		              w=w+a[i];
					  i++;
					  }
		else{
		           w=w+a[j];
				   j--;
				   }
		}
		}
		System.out.print(q+" "+w);
		}}
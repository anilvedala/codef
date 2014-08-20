import java.util.Scanner;
public class Jeff{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
String s2=sb.nextLine();
String s3[]=s2.split(" ");
int a[]=new int[2];
int h=0;
for(int i=0;i<n;i++){
    h=Integer.parseInt(s3[i]);
	if(h==5){ 
	     a[0]++;
		 }
	else{
	    a[1]++;
		}
	}
	int q=(a[0])/9;
	if(a[1]>0){
	             if(q==0){
				       System.out.print("0");
					   }
				 else{
				        String d="";
				        for(int u=0;u<q;u++){
						 d=d+"555555555";
						 }
						 for(int u=0;u<a[1];u++){
						 d=d+"0";
						 }
						 System.out.print(d);
						 }
	             }
	else{
	          System.out.print("-1");
			  }
			  }
			  }
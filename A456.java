import java.util.Scanner;
import java.util.Arrays;
public class A456{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 int n=Integer.parseInt(s),flag=0;
			 int a[]=new int[n];
			 for(int i=0;i<n;i++){
			  String s1=sb.nextLine();
			  String s2[]=s1.split(" ");
			  a[Integer.parseInt(s2[0])-1]=Integer.parseInt(s2[1]);
			  }
			  int m=a[0];
			  for(int i=1;i<n;i++){
			     if(a[i]<m){
				        flag=1;
						break;
						}
				 else{
				     m=a[i];
					 }
					 }
				if(flag==1){
				    System.out.print("Happy Alex");
					}
				else{
				   System.out.print("Poor Alex");
				   }
				   }}
			 
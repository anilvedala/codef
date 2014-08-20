import java.util.Scanner;
import java.io.*;
public class B454{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);try{

String s1=sb.nextLine();
String s2=sb.nextLine();
String s3[]=s2.split(" ");

  int n=Integer.parseInt(s1);
  int a[]=new int[n];
  int c=0;
    for(int i=0;i<n;i++){
  	  a[i]=Integer.parseInt(s3[i]);
      }
	 int j=0;
	 while(a[j]<=a[j+1] && j<n-1){j++;}
	 int u=j;
	 j=n-1;
	 while(a[j]<=a[j-1] && j>0){j--;c++}
	 int v=j;
	 if(u==v){
	  System.out.print(c);
     }
  else{
	 System.out.println("-1");
    }
  }
  catch (Exception e) {
  	
  }
   }
   }     
	         
	           
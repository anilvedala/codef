import java.util.Scanner;
import java.lang.*;
public class A443{
public static void main(String ar[]){
  Scanner sb=new Scanner(System.in);
  String s1=sb.nextLine();

  String s3[]=s1.split(", ");
  int a[]=new int[26];
for(int i=0;i<s3.length;i++){
	
	String s4=s3[i]+"";
	if (i==0) {
     if(s4.charAt(1)==' ' || s4.charAt(1)=='}') break;
     else{
       a[((int) s4.charAt(1))-97]++;	
	   }
	 }
	else{
	a[((int) s4.charAt(0))-97]++;
    }
    }
int count=0;
for (int i=0;i<26;i++) {
	if(a[i]>0) count++;
	}
System.out.print(count);
}}
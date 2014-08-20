import java.util.Scanner;
public class Amusing{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
String s3=sb.nextLine();
int a[]=new int[26];
for(int i=0;i<s1.length();i++){
       a[(int)s1.charAt(i)-65]++;
	   }
for(int i=0;i<s2.length();i++){
       a[(int)s2.charAt(i)-65]++;
	   }
int b[]=new int[26];
for(int i=0;i<s3.length();i++){
       b[(int)s3.charAt(i)-65]++;
	   }
	   int flag=0;
for(int i=0;i<26;i++){
    if(a[i]!=b[i]) {flag=1;break;}}
	if(flag==0){System.out.print("YES");}
	else{System.out.print("NO");
	
	}}}
import java.util.Scanner;
public class A230{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int s=Integer.parseInt(s2[0]);
int n=Integer.parseInt(s2[1]);
int i=0,flag=0;
for(i=0;i<n;i++){
String s3=sb.nextLine();
if(flag==0){
String s4[]=s3.split(" ");
int x=Integer.parseInt(s4[0]);
int y=Integer.parseInt(s4[1]);
if(s>x) {s=s+y;}
else {flag=1;}
}}
if(flag==0){System.out.print("YES");
 }
 else{System.out.print("NO");}
 }}

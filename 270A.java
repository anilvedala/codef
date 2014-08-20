import java.util.Scanner;
public class Fence{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
int a[]=new int[n];
for(int i=0;i<n;i++){
       String s2=sb.nextLine();
	   int p=Integer.parseInt(s2);
	   int h=(360)%(180-p);
	   if(h==0) {a[i]=1;}
	   }
for(int i=0;i<n;i++){
     if(a[i]==1){
          System.out.println("YES");
           }
     else{
          System.out.println("NO");
      }
}}}	  
import java.util.Scanner;
public class Market{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
int a[]=new int[n];
String s1=sb.nextLine();
String s2[]=s1.split(" ");
for(int i=0;i<n;i++){
  a[i]=Integer.parseInt(s2[i]);
  }
int min=75000;
  for(int i=0;i<n;i++){
    int b[]=new int[a[i]];
	String h=sb.nextLine();
	int c=0;
	if(a[i]==1){
	             c=  (Integer.parseInt(h))*5;   
				 }
	else{
	   String h1[]=h.split(" ");
	   for(int w=0;w<a[i];w++){
	             c=(Integer.parseInt(h1[w]))*5+c;
				 }
				 }
				 c=c+15*a[i];
				 if(c<min){min=c;}
	    
		}
		System.out.print(min);
		}}
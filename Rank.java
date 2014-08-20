import java.util.Scanner;
public class Rank{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
int at[]=new int[n-1];
String w=sb.nextLine();
String d[]=w.split(" ");
int sum=0;
for(int u=0;u<n-1;u++){
                                     at[u]=Integer.parseInt(d[u]);
									 }
String h=sb.nextLine();
String qw[]=h.split(" ");
int a=Integer.parseInt(qw[0]);
int b=Integer.parseInt(qw[1]);
for(int t=(a-1);t<=(b-2);t++){
sum=sum+at[t];}
System.out.println(sum);
}
}
								 
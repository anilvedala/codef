import java.util.Scanner;
public class Next
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String e[]=s.split(" ");
int n=Integer.parseInt(e[0]);
int k=Integer.parseInt(e[1]);
String d=sb.nextLine();
String b[]=d.split(" ");
int c[]=new int[n];
for(int i=0;i<n;i++){
c[i]=Integer.parseInt(b[i]);
}
int count=0;
for(int i=0;i<n;i++){
if((c[i]>=c[k-1])&c[i]>0)
count=count+1;
}
System.out.println(count);
}
}
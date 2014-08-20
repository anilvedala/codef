import java.util.Scanner;
public class A426{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int n=Integer.parseInt(s2[0]);
int s=Integer.parseInt(s2[1]);
String s3=sb.nextLine();
String s4[]=s3.split(" ");
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(s4[i]);
	}
int i=0,sum=0,flag=0;;
for(i=0;i<n;i++){
    sum=sum+a[i];
	if(sum>s) {
	                  if(flag==0){
					     sum=sum-a[i]+a[++i];
						 flag=1;
						 if(sum>s) break;
						 }
					  else break;
					   }
    if(sum<=s && flag==0 && i==n-2)  break;
	}
	if(((i==n-2)&&(flag==0))||(i==n)) {System.out.print("YES");}
	else        {System.out.print("NO");}
	}}
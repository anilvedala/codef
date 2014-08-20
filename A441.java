import java.util.Scanner;
public class A441{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int n=Integer.parseInt(s2[0]);
int v=Integer.parseInt(s2[1]);
int c=0;
int a[]=new int[n];
for(int i=0;i<n;i++){
          String s3=sb.nextLine();
		  String s4[]=s3.split(" ");
		  for(int j=1;j<s4.length;j++){
		          
		          int b=Integer.parseInt(s4[j]);
				  if(b<v){
				               c++;
							   a[i]=1;
							   break;
							   }
				  }
		  }
System.out.println(c);
for(int i=0;i<n;i++){
  if(a[i]==1){
                 System.out.print(i+1+" ");
				 }
  }
  }}
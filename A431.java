import java.util.Scanner;
public class A431{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int a[]=new int[4];
for(int i=0;i<4;i++){
   a[i]=Integer.parseInt(s2[i]);
   }
 String s3=sb.nextLine();
 int y=0;
 for(int i=0;i<s3.length();i++){
     int u=(int) (s3.charAt(i));
	 u=u-48;
	 if(u==1){
	           y=y+a[0];
			   }
	 if(u==2){
	           y=y+a[1];
			   }
			    if(u==3){
	           y=y+a[2];
			   }
			    if(u==4){
	           y=y+a[3];
			   }
			   }
			   System.out.print(y);
			   }}
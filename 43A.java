import java.util.Scanner;
public class Football
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
int c=1,d=0;
String s2="";
String s3="";
String s1="";
      if(n==1){
           s1=sb.nextLine();
           System.out.print(s1);
           }
      else{
           s1=sb.nextLine();
           for(int i=0;i<n-1;i++) {
           s2=sb.nextLine();
           if(s1.equals(s2)==true) {c++;}
           else {d++;s3=s2+"";}
           }
	       if(c>d){
            System.out.print(s1);
			}
			else{
			System.out.print(s3);
			}
			}
			}
			}
			
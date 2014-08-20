import java.util.Scanner;
public class Palindromic
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String s1[]=s.split("(?!^)");
int a=Integer.parseInt(s1[0]);
int b=Integer.parseInt(s1[1]);
int c=Integer.parseInt(s1[3]);
int d=Integer.parseInt(s1[4]);
if((a==0)&&(b>5)) {
                          System.out.print("10:01");
						  }
else if((a==1)&&(b==5)&&(c>=5)&&(d>=1)){
                          System.out.println("20:02");
						  }
						  else if((a==1)&&(b>5)) {   System.out.print("20:02");
						  }
else if((a==2)&&(b==3)&&(c>=b)&&(d>=a)){
                        System.out.print("00:00");
                       }
else if((a==2)&&(b==3)&&(c==b)&&(d<a)){
                        System.out.println("23:32");
                       }					   
else if((c>=b)&&(d>=a)) {
                         System.out.print(a+""+(b+1)+":"+(b+1)+""+a);
						 }
else {
                  System.out.print(a+""+b+":"+b+""+a);
				  }
				  }
				  }
				  

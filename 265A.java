import java.util.Scanner;
public class Colorful
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String t=sb.nextLine();
int a=0,c=1;
while(a<t.length()) {
       if(s.charAt(c-1)==t.charAt(a)) {
	                                  c++;
									   }
									   a++; }
									   System.out.print(c);
									   }
									   }
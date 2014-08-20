import java.util.Scanner;
public class Candle{
public static void main(String ae[]){
Scanner sb=new Scanner(System.in);
String s= sb.nextLine();
String a1[]=s.split(" ");
int a=Integer.parseInt(a1[0]);
int b=Integer.parseInt(a1[1]);
int count=0;
while(a>=b){
                   a=a-b;
				   count=count+b;
				   a=a+1;
				   }
                     
				   System.out.println(count+a);
								}
}								
                             
                                

import java.util.Scanner;
public class Help
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int i=0;
while(s.charAt(i)!='.') {
                 i++;
				
				 }
				 if(s.charAt(i-1)=='9') {
				               System.out.print("GOTO Vasilisa.");
							   }
			     else{
				  if(s.charAt(i+1)>='5') {
				               String t1=""+s.charAt(i-1);
							   int t=Integer.parseInt(t1)+1;
							   System.out.print(s.substring(0,i-1)+t);
							   }
				  else {
				           System.out.print(s.substring(0,i));
						   }
						   }}}
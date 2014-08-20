import java.util.Scanner;
public class Half{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int w=Integer.parseInt(s);    
if((w%2)!=0)   {
                          System.out.println("NO");
                         }
if(w==2){
System.out.println("NO");
                         }
if((w>2)&(w%2==0))		{	
System.out.println("YES");
}
}
}			 
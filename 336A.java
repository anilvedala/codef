import java.util.Scanner;
public class Vasily{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p=sb.nextLine();
	   String q[]=p.split(" ");
	   int x=Integer.parseInt(q[0]);
	   int y=Integer.parseInt(q[1]);
	   if((x>=0)&&(y>=0))  {System.out.print("0  " +(x+y)+" "+(x+y)+" 0");}
	   else if((x>=0)&&(y<=0))  {System.out.print("0 "+(-x+y)+" "+(x-y)+" 0");}
	   else if((x<=0)&&(y<=0))  {System.out.print((x+y)+" 0 0 "+(x+y));}
	   else                                     {System.out.print((x-y)+" 0 0 "+(-x+y));}
	   }
	   }
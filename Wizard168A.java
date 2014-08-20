import java.util.Scanner;
public class Wizard{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  String p1[]=p.split(" ");
	  int n=Integer.parseInt(p1[0]);
	  int x=Integer.parseInt(p1[1]);
	  int y=Integer.parseInt(p1[2]);
	  float a=(float) (n* y)/((float) 100);
	  int b=(int) a;
	     if(x<=b){    
			          if((a-b)>0) {
						       System.out.print(b+1-x);
						       }
	                  else  {
			                    System.out.print(b-x);
						       }
						}
		else  {
						  System.out.print("0");
				 }
						  }
						  }
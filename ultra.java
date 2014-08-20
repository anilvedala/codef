import java.util.Scanner;
public class Con1{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  String t[]=p.split("(?!^)");
	  String y=sb.nextLine();
	  String s[]=y.split("(?!^)");
	  int d=t.length;
	  int i=0;
	  while(i<d) {
	       int j=Integer.parseInt(t[i]);
		   int k=Integer.parseInt(s[i]);
		   if(j!=k) {
		               System.out.print(1);
					   }
					   else {
					               System.out.print(0);
								    }
									i++;
									}
				
					   }
					   }
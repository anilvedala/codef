import java.util.Scanner;
public class Word{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p1= sb.nextLine();
	  int n=p1.length();
	  String p=p1.toLowerCase();
	  String h=p1.toUpperCase();
	  int c1=0,c2=0;
	  for(int i=0;i<n;i++) {
	      if(p1.charAt(i)==p.charAt(i)) { 
		                                  c1++;
										  }
	     if(p1.charAt(i)==h.charAt(i)) { 
		                                  c2++;
										  }
		}
		if(c1>=c2) {
		                  System.out.print(p);
						  }
		else {
		               System.out.print(h);
					   }
					   }
					   }
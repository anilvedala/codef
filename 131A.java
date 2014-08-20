import java.util.Scanner;
public class Caps{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int i=0;
	
	  if((65<=((int)p.charAt(0)))&&(((int)p.charAt(0))<=90)) {
	                 
	                 while((i<p.length())&&((65<=((int)p.charAt(i)))&&(((int)p.charAt(i))<=90))) { 
					      i++;
						  }
					 if(i==p.length()) {
					      System.out.print(p.toLowerCase());
						  }
					 else {
	                     System.out.print(p);
	                     }
	          		}
    else  { 
	            i=1;
              	while((i<p.length())&&((65<=((int)p.charAt(i)))&&(((int)p.charAt(i))<=90))) { 
					      i++;
						  }
	           if(i==p.length()) {
						 i=1;
						 String r[]=p.split("(?!^)");
						 String e=r[0].toUpperCase();
						 while(i<p.length()) {
						           e=e+r[i].toLowerCase();
								   i++;
								   }
						 System.out.print(e);
						 }
			  else {
			          System.out.print(p);
					  }
				}
				}}
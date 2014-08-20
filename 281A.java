import java.util.Scanner;
public class Capitalization{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=p.length();
	  String w[]=p.split("(?!^)");
	  w[0]=w[0].toUpperCase();
	  String h="";
	  for(int i=0;i<n;i++) {
	        h=h+w[i];
			}
		
	            System.out.print(h);
}}				
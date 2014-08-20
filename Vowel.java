import java.util.Scanner;
public class Vowel{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p1= sb.nextLine();
	  int n=p1.length();
	  String p=p1.toLowerCase();
	  String h="";
	  for(int i=0;i<n;i++) {
	   if((p.charAt(i)=='a')||(p.charAt(i)=='e')||(p.charAt(i)=='i')||(p.charAt(i)=='o')||(p.charAt(i)=='u')||(p.charAt(i)=='A')||(p.charAt(i)=='E')||(p.charAt(i)=='I')||(p.charAt(i)=='O')||(p.charAt(i)=='U')) {
	           h=h+"";
			   }
			   else {
			 
	           h=h+"."+p.charAt(i);
			   
			   }
			   }
			   System.out.print(h);
			   }
			   }
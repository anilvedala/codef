import java.util.Scanner;
public class Translation{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p=sb.nextLine();
	  String q=sb.nextLine();
	  String rev="";
	  for(int i=p.length()-1;i>=0;i--) {
	          rev=rev+p.charAt(i);
			  }
			  if(rev.equals(q)==true) {
			   System.out.print("YES");
			   }
			   else {
			    System.out.print("NO");
				}
				}
				}
	import java.util.Scanner;
	public class Gender{
	public static void main(String ae[]){
		  Scanner sb=new Scanner(System.in);
		  String p= sb.nextLine();
		  String t[]=p.split("(?!^)");
		  int c[]=new int[26];
		  int i=0,coun=0;
		  while(i<t.length) {
						char s=t[i].charAt(0);
						int d=(int) (s) -'a';
						c[d]++;
						i++;
						 }
						 for(i=0;i<26;i++) {
							   if(c[i]>0){coun++;}
							   }
							   if(coun%2==0) {
									   System.out.println("CHAT WITH HER!");}
									   else {
										System.out.println("IGNORE HIM!");
										}
										}
										}
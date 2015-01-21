import java.util.Scanner;
import java.util.Arrays;
public class A208{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 String s1="";
			 for(int i=0;i<s.length();i++){
			            if(s.charAt(i)=='W' && i!=s.length()-1){
						              
									if(s.charAt(i+1)=='U' && i!=s.length()-2){
									      if(s.charAt(i+2)=='B'){i=i+2;if(i!=s.length()-3 && s1.length()!=0 && s1.charAt(s1.length()-1)!=' ') s1=s1+" ";}
										  else{
										       
										       s1=s1+s.charAt(i)+s.charAt(i+1);
											   i=i+1;
											   }
										   }
									else{
									      s1=s1+s.charAt(i);
										  }
										  }
						else{
									       s1=s1+s.charAt(i);
										   }
										   }
						System.out.print(s1);
						}}
									      
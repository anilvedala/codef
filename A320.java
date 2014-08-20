import java.util.Scanner;
public class A320{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=s1.length();
int i=0;
while(i<n){
     if(s1.charAt(i)=='1'){
			  i++;
			  if(i==n){
			     System.out.print("YES");
                 break;
				 }
			  else if(s1.charAt(i)=='4'){
                 i++;
			     if(i==n){
				    System.out.print("YES");
					break;
					}
				if(s1.charAt(i)!='4' && s1.charAt(i)!='1'){
                    System.out.print("NO");
					break;
					}
				else if(s1.charAt(i)=='1'){i--;}
				if(i==n-1) {System.out.print("YES");break;} i++;
				}
      }
	else {
	         System.out.print("NO");
			 break;
            }			
	}
	}}
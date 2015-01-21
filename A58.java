import java.util.Scanner;
import java.util.Arrays;
public class A58{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 int a=0;
			 for(int i=0;i<s.length();i++){
			    if(a==0){
				           if(s.charAt(i)=='h') a++;
						   }
				else if(a==1){
				            if(s.charAt(i)=='e') a++;
						   }
				else if(a==2){
				            if(s.charAt(i)=='l') a++;
						   }
				else if(a==3){
				            if(s.charAt(i)=='l') a++;
						   }
				else if(a==4){
				            if(s.charAt(i)=='o') {a++;break;}
						   }
						   }
				if(a==5){System.out.print("YES");}
				else{System.out.print("NO");}
				}}
				
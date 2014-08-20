import java.util.Scanner;
public class A382{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
int c1=0,c2=0,flag=0;
for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)=='|'){
	         flag=1;
			 }
	 else{
	        if(flag==0) c1++;
			else             c2++;
			}
	}
	
	String s4="";
	if(c1+s2.length()==c2){
	      for(int i=0;i<s1.length();i++){
                 if(s1.charAt(i)=='|'){
	                   s4=s4+s2+"|"; 
			           }
				else{
				       s4=s4+s1.charAt(i);
					   }
					   }
		 System.out.print(s4);
		 }
	else if(c2+s2.length()==c1){
	      System.out.print(s1+s2);
		  }
	else{
	      System.out.print("Impossible");
		  }
		  }}
		  
		 
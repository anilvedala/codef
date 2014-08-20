 import java.util.Scanner;
public class A158{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s3=sb.nextLine();
String s2[]=s3.split(" ");
int n=Integer.parseInt(s1);
int a=0,b=0,c=0,d=0;
int h=0,count=0;
for(int i=0;i<n;i++){
      h=Integer.parseInt(s2[i]);
	  if(h==4) {a++;}
	  if(h==3){b++;}
	  if(h==2){c++;}
	  if(h==1){d++;}
	  }
	  count=count+a+b;
	  if(d>b){d=d-b;}
	  else{d=0;}
	  if(c%2==0){count=count+c/2;}
	  else{count=count+c/2+1;if(d>=2){d=d-2;}}
	  if(d>=0){
	               if(d%4==0){count=count+d/4;}
				   else{count=count+d/4+1;}
				   }
				   System.out.print(count);}}
	  

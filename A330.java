import java.util.Scanner;
public class A330{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int r=Integer.parseInt(s2[0]);
int c=Integer.parseInt(s2[1]);
int count=0;
String f[]=new String[r];
String t="";
for(int i=0;i<c;i++){
       t=t+".";
	   }
for(int i=0;i<r;i++){
      f[i]=sb.nextLine();
	 	  }
	  int len=r;
for(int i=0;i<len;i++){	  
         if(f[i].equals(t)){
		                count=count+c;
						f[i]=f[len-1]+"";
						len--;
						}}
for(int i=0;i<c;i++){
      int j=0;
	  for(j=0;j<len;j++){
	     if(f[j].charAt(i)=='S') break;
		 }
		 if(j==len){count=count+len;}
		 }
		 System.out.print(count);
		 }}
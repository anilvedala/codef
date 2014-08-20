import java.util.Scanner;
public class Fixed{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
int a[]=new int[n];
int k=0,c=0;
int b[]=new int[n];
String h=sb.nextLine();
String j[]=h.split(" ");
for(int y=0;y<n;y++){  
									 a[y]=Integer.parseInt(j[y]);
									 if(a[y]==y) {c++;}
									 else  {
									          b[k]=y;
											   k++;
											   }
									 }
int flag=0;
for(int u=0;u<k;u++){
  if(a[a[b[u]]]==b[u]) {flag=1;break;}
   }
if(c!=n){if(flag==1){System.out.print(c+2);}
else{System.out.print(c+1);}}   
else{
      System.out.print(c);
	  }
	  }
	  }
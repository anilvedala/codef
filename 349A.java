import java.util.Scanner;
public class Cinema{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
String s2=sb.nextLine();
String s3[]=s2.split(" ");
int a[]=new int[2];
int h=0,flag=0;
for(int i=0;i<n;i++){
      h=Integer.parseInt(s3[i]);
	  if(h==25){
	          a[0]=a[0]+1;
			  }
	  else if(h==50){a[1]=a[1]+1;
	          if(a[0]>=1){
			          a[0]=a[0]-1;
					  }
			  else {flag=1;break;}
			  }
	 else{
	         if((a[0]>=1)&&(a[1]>=1)){
			          a[0]=a[0]-1;
					  a[1]=a[1]-1;
					  }
			else if(a[0]>=3){a[0]=a[0]-3;}		  
			 else{
			        flag=1;break;}
					}
					}
		if(flag==1){
		 System.out.print("NO");
		 }
		else{
		System.out.print("YES");}
		}}
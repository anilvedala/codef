import java.util.*;
public class B230{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 int n=Integer.parseInt(s);
			 String s1=sb.nextLine();
			 String s2[]=s1.split(" ");
			 int a1[]=new int[1000001];
			 long a=0L;
			 for(int i=0;i<n;i++){
			    a=Long.parseLong(s2[i]);
				if(a%2==0 && a!=4){System.out.println("NO");}
				else{
				int p=1;
				double d=Math.sqrt(a);
				
				if((d-(int) d)==0){
				          if(d%2==0 && d!=2) {System.out.println("NO");}
				          else{
						         if(a1[(int) d]==1){System.out.println("YES");}
								 else if(a1[(int) d]==2){System.out.println("NO");}
								 else{
								 for(int h=2;h<=Math.sqrt(d);h++){
						         if(((int) d)%h==0){ p=0;break;}
								 }
						  if(p==0 || d==1){System.out.println("NO");a1[(int) d]=2;}
						  else{System.out.println("YES");a1[(int) d]=1;}}
						  }}
				else{
				       System.out.println("NO");
				}
					   
			 }}
					   }}
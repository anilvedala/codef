import java.util.Scanner;
public class C285{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
String s3[]=s2.split(" ");
int n=Integer.parseInt(s1);
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(s3[i]);
	  int j=i;
	  while(1>0){
	      if(j==0) break;
	      if(a[j]<a[j-1]){
	                int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
					j--;
					if(j==0) break;
					}
		 else break;
        }
		}
		int c=0;
for(int i=0;i<n;i++){
       if(a[i]<=0){
	               if(i==0){
        				c=c+1-a[i];
						a[i]=1;
						}
		          else{
  				          c=c+a[i-1]+1-a[i];
                          a[i]=a[i-1]+1;				   
				         }
	             }
      else{
	      if(i!=0){
	       if(a[i]<=a[i-1]) {c=c+a[i-1]+1-a[i];a[i]=a[i-1]+1;}
           else if(a[i]>n) {c=c+a[i]-n;a[i]=n;}
		   }
		   else if(i==0){ if(a[i]>n) {a[i]=n;c=c+a[i]-n;}}
		  }
	  }
System.out.print(c);
}}		


		
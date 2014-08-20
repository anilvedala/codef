import java.util.Scanner;
public class B160{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
int n=Integer.parseInt(s1);
int n1=2*n;
int m=Integer.parseInt(s2);
int a[]=new int[n1];
int b[]=new int[n1];
for(int i=0;i<n1;i++){
 if(i<n){
         a[i]=m%10;
		 m=m/10;
		 }
else{
        b[i-n]=m%10;
		m=m/10;
		}
		}
for(int i=0;i<n;i++){
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
for(int i=0;i<n;i++){
     int j=i;
	  while(1>0){
	      if(j==0) break;
	      if(b[j]<b[j-1]){
	                int t=b[j];
					b[j]=b[j-1];
					b[j-1]=t;
					j--;
					if(j==0) break;
					}
		 else break;
        }
		}
		int flag=1;
	int i=n-1,j=n-1;
	while(flag==1){
	     if(a[i]>=b[j]){flag=0;}
		 else{
		         i--;
				 j--;
				 if(i==0) break;
				 }
			}
	if(flag==1){
	     System.out.print("YES");
		 }
	else{
	flag=1;
	i=n-1;
	j=n-1;
	while(flag==1){
	     if(a[i]<=b[j]){flag=0;}
		 else{
		         i--;
				 j--;
				 if(i==0) break;
				 }
			}
	if(flag==1){
	     System.out.print("YES");
		 }
	else{
	  System.out.print("NO");
	  }}}}
	
	
	
import java.util.Scanner;
public class A432{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
String s3[]=s1.split(" ");
String s4[]=s2.split(" ");
int n=Integer.parseInt(s3[0]);
int k=Integer.parseInt(s3[1]);
int a[]=new int[n];
for(int i=0;i<n;i++){
  a[i]=Integer.parseInt(s4[i]);
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
k=5-k;
int l=0;
while(l<n &&a[l]<=k){
      l++;
	  }
	  System.out.print(l/3);
	  }}
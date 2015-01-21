import java.util.Scanner;
public class A150{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
String s2=sb.nextLine();
String s3[]=s2.split(" ");
int a[]=new int[n];
int sum=0;
for(int i=0;i<n;i++){
       a[i]=Integer.parseInt(s3[i]);
	   sum=sum+a[i];
	  int j=i;
	  while(1>0){if(j==0) break;
	  if(a[j]>a[j-1]){
	                int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
					j--;
					if(j==0) break;
					}
		else break;
        }
		}
	int i=0,sum1=0;
	while(1>0){
	    sum1=sum1+a[i];i++;
		if(sum1>(sum-sum1)) break;
		
		}
		System.out.print(i);
		}}

import java.util.Scanner;
public class Business{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
int k=Integer.parseInt(s1);
String s3[]=s2.split(" ");
int a[]=new int[12];
for(int i=0;i<12;i++){
    a[i]=Integer.parseInt(s3[i]);
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
		
		int sum=0,k1=0;
		while(sum<k){
		    sum=sum+a[k1];
			k1++;
			if(k==12){break;}
			}
		if(k==12){System.out.print(-1);}
		else{System.out.print(k1);}
		}}
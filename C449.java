import java.util.Scanner;
public class C449{
 private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
  
}
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int count=0,k=0;
int n=Integer.parseInt(s1);
int a[]=new int[n];
int b[]=new int[n/2];
int c[]=new int[n/2];
for(int i=0;i<n;i++){
         if(a[i]==0){
                for(int j=i+2;j<=n;j++){
				    if(a[j-1]==0){
				      if(findGCD(i+1,j)>1){
					            count++;
								b[k]=i+1;
								c[k]=j;
								k++;
								break;
								}
					  }
					 }
			    }
	    }
System.out.println(count);
for(int i=0;i<k;i++){
    System.out.println(b[i]+" "+c[i]);
	}
	}
	}
#include <stdio.h>
 
int main(void) {
	// your code goes here
	int n,i,j,sum=0,k=0,l=0;
	scanf("%d",&n);
    for(i=0;i<n;i++){
    	scanf("%d",&j);
    	if(j==200) k++;
    	else       l++;
    	sum=sum+j;
    }
	if (((sum/100)%2)==0){
		i=sum/2;
		j=i/200;
		if(k>=j){ 
			k=k-j;
			i=i%200;
		}
		else{
			i=i-k*200;
			k=0;
		}
		int p=i/100;
		if(l>=p) printf("YES");
		else     printf("NO");
	}
	else          printf("NO");
	return 0;
}
#include <stdio.h>
int main()
{
    printf("Started \n");    
    int n; 
    scanf("%d",&n);      
    int a[5];
    int i,j;
    
    for(i=0;i<n;i++){    
    scanf("%d",&a[i]);    
    }
    
    for(i=0;i<n-1;i++){
     for(j=i+1;j<n;j++){
         if(a[j]>a[i]){
             int temp = a[i];
             a[i] = a[j];
             a[j] = temp;             
         }
     }   
    }
    
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }  
printf("Finished \n");    
}
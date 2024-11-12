#include<stdio.h>
void mindist(int arr[],int n,int a ,int b){
   int mindist=n;
   for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
     if(arr[i]==a&&arr[j]==b||arr[i]==b&&arr[j]==a){
        int dist=j-i;
        if(dist<mindist){
            mindist=dist;
        }
     }
    }
   }
   if(mindist!=n){
    printf("%d",mindist);
   }
   else{
    printf("not found");
   }
}
int main(){
    int n,a,b,t;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        int arr[n];
        for(int i=0;i<n;i++){
            scanf("%d",&arr[i]);
        }
        scanf("%d %d",&a,&b);
        mindist(arr,n,a,b);
    }
    return 0;
}
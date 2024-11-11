#include<stdio.h>
void leftrotatearr(int arr[],int n,int k){
int temp[k];
for(int i=0;i<k;i++){
  temp[i]=arr[i];
}
for(int i=0;i<n-k;i++){
  arr[i]=arr[i+k];
}
for(int i=0;i<k;i++){
  arr[n-k+i]=temp[i];
}
}
int main(){
  int k,t,n;
  scanf("%d",&t);
  while(t--){
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  scanf("%d",&k);
  leftrotatearr(arr,n,k);
  for(int i=0;i<n;i++){
    printf("%d",arr[i]);
  }
  }
  return 0;
}
#include<stdio.h>
void bubblesort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
void print(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);       
    }
    printf("\n");
}
int main(){
    int arr[]={15,16,45,2,3,55};
    int n=sizeof(arr)/sizeof(arr[0]);
    printf("original array:");
    print(arr,n);
    bubblesort(arr,n);
    printf("sorted araay:");
    print(arr,n);
    return 0;
}
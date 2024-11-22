#include<stdio.h>
void table(int num);
int main(){
    int n;
    printf("enter number:");
    scanf("%d",&n);
    table(n);
    return 0;
}
void table(int num){
    int res;
    for(int i=1;i<=10;i++)
    {
        res=num*i;
        // printf("%d\n",res);
        printf("%d*%d=%d\n",num,i,res);
    }
}


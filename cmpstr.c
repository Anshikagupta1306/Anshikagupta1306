#include<stdio.h>
int test(char *s1,char *s2);
int main(){
    char str1[100],str2[100];
    int flag=0;
    printf("enter string 1:");
    gets(str1);
    printf("enter string 2:");
    gets(str2);
    flag=test(str1,str2);
    if(flag==0){
        printf("strings are equal");
    }
    else{
        printf("strings are not equal");
    }
    return 0;
}
int test(char *s1,char *s2){
    int flag=0;
    while(*s1!='\0'||*s2!='\0'){
        if(*s1==*s2){
            s1++;
            s2++;
        }
        else if((*s1=='\0'&&*s2=='\0')||(*s1=='\0'&&*s2!='\0')||(*s1!=*s2)){
            flag=1;
            break;
        }
    }
    return flag;
}
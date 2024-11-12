#include<stdio.h>
#include<stdbool.h>
#define size 100
int stack[size];
int top=-1;
void push(char ch){
      if(top==(size-1)){
        printf("stack overflow\n");
        return;
    }
    else{
        top++;
        stack[top]=ch;
    }
}
void pop(){
    if(top==-1){
        printf("stack underflow\n");
    }
    else{
        top--;
    }
}
bool isEmpty(){
    return top==-1;
}
bool isFull(){
    return top==(size-1);
}
bool ismatchingpair(char left,char right){
    return(left=='('&& right==')'|| left=='[' && right==']'|| left=='{'&& right=='}');
}
void isvalidparan(char *s){
     for(int i=0;s[i]!='\0';i++){
        if(s[i]=='('|| s[i]=='{'|| s[i]=='['){
            push(s[i]);
        }
        else if(s[i]==')'||s[i]=='}'||s[i]==']'){
              if(isEmpty()||!ismatchingpair(s[top],s[i])){
                printf("not balanced\n");
                return;
              }
              else{
                pop();
              }
        }
     }
     if(isEmpty()){
        printf("balanced\n");
     }
     else{
        printf("not balanced\n");
     }
}
int main(){
    char expr[size];
    printf("enter expression:\n");
    scanf("%s",expr);
    isvalidparan(expr);
    return 0;
}
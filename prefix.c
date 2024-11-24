#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<stdbool.h>
#include<math.h>
#include<ctype.h>
#define MAX 100
struct stack{
    int top;
    int arr[MAX];
};
void ini(struct stack*s){
    s->top=-1;
}
bool isEmpty(struct stack*s){
    return (s->top==-1);
}
bool isFull(struct stack*s){
    return (s->top==(MAX-1));
}
void push(struct stack*s,int x){
   if(isFull(s)){
    printf("stack overflow:\n ");
   }
   else{
     s->arr[++(s->top)]=x;
   }
}
int pop(struct stack*s){
    if(isEmpty(s)){
        printf("stack underflow\n");
    }
    else{
        return s->arr[(s->top)--]; 
    }
}
int prefixevaluate(char *expr){
   struct stack*s=(struct stack*)malloc(sizeof(struct stack));
   ini(s);
   int len=strlen(expr);
   for(int i=len-1;i>=0;i--){
    if(expr[i]==' '){
        continue;
    }
    if(isdigit(expr[i])){
        push(s,expr[i]-'0');
    }
    else{
        int operand1=pop(s);
        int operand2=pop(s);
        switch(expr[i]){
            case'+':push(s,operand1+operand2);
                    break;
            case'-':push(s,operand1-operand2);
                    break;
            case'*':push(s,operand1*operand2);
                    break;
            case'/': if (operand2 == 0) { 
                      printf("Error: Division by zero\n"); 
                      free(s); 
                      return -1;
                     } 
                     push(s, operand1 / operand2); 
                     break;
        }
    }
   }
   return pop(s);
}
int main(){ 
    char expr[MAX];
    printf("enter prefix expression:\n");
    fgets(expr,MAX,stdin);
    expr[strcspn(expr,"\n")]='\0';
    int res=prefixevaluate(expr);
    printf("%d",res);
    return 0;
}
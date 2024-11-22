#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
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
    return (s->top==MAX-1);
}
void push(struct stack*s,int x){
    if(isFull(s)){
        printf("stack overflow\n");
    }
    s->arr[++(s->top)]=x;
}
int pop(struct stack*s){
     if(isEmpty(s)){
        printf("stack underflow\n");
     }
     return s->arr[(s->top)--];
}
int evaluatepostfix(char *expr){
    struct stack*s=(struct stack*)malloc(sizeof(struct stack));
    ini(s);
    for(int i=0;expr[i]!='\0';i++){
        char ch=expr[i];
    if(isdigit(ch)){
        push(s,ch-'0');
    }
    else if(ch==' '){
          continue;
    }
    else{
        int operand1=pop(s);
        int operand2=pop(s);
        switch (ch){
            case '+':push(s,operand1+operand2);
                     break;
            case '-':push(s,operand1-operand2);
                     break;
            case '*':push(s,operand1*operand2);
                    break;
            case '/':if(operand2==0){
                printf("error\n");
            }
            else{
                push(s,operand1/operand2);
            }
            break;
            default:printf("invalid input\n"); 
        }
    }
  }
  return pop(s);
}
int main() {
    char expr[MAX];
    printf("Enter a postfix expression: ");
    fgets(expr, MAX, stdin);
    expr[strcspn(expr, "\n")] = '\0';
    int result = evaluatepostfix(expr);
    printf("The result of the postfix evaluation is: %d\n", result);
    return 0;
}
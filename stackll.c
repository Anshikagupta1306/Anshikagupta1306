#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
};
struct node*top=0;
void push(int x){
    struct node*newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=x;
    newnode->next=top;
    top=newnode;
}
void display(){
    struct node*temp=top;
    if(top==0){
        printf("stack underflow\n");
    }
    else{
        while(temp!=0){
            printf("%d->",temp->data);
            temp=temp->next;
        }
    }
    printf("NULL\n");
}
void peek(){
    if(top==0){
      printf("stack underflow\n");
    }
    else{
        printf("top element is:%d",top->data);
    }
    printf("\n");
}
void pop(){
    struct node*temp=top;
    if(top==0){
        printf("stack underflow\n");
    }
    else{
        top=top->next;
        free(temp);
    }
}
int main(){
    int val;
    printf("enter the values of nodes:\n");
    while(1)
    {
        scanf("%d",&val);
        if(val==0){
            break;
        }
        else{
        push(val);
        }
    }
    display();
    peek();
    pop();
    display();
    return 0;
}
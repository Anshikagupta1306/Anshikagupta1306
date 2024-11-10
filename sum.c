#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
};
struct node*head;
//create new node:
struct node*newnode(int val){
   struct node*temp=(struct node*)malloc(sizeof(struct node));
   if(temp==NULL){
    printf("heap overflow\n");
    return temp;
   }
   temp->data=val;
   temp->next=NULL;
   return temp;
}
//print list:
void printlist(struct node*head){
    struct node*temp=head;
    while(temp!=NULL){
        printf("%d->",temp->data);
       temp=temp->next;
    }
    printf("NULL\n");
}
//multiply:
void multiply(struct node*head){
    struct node*temp=head;
    if(temp==NULL){
        printf("NULL\n");
    }
     while(temp->next!=NULL){
        int multiply=temp->data*temp->next->data;
        printf("%d ",multiply);
        temp=temp->next;
    }
}
int main(){
    struct node*head=NULL;
    struct node*last=NULL;
    int val;
    printf("enter the data of nodes:\n");
    while(1){
        scanf("%d",&val);
        if(val==0){
            break;
        }
        struct node*temp=newnode(val);
        if(head==NULL){
            head=temp;
            last=temp;
        }
        else{
            last->next=temp;
            last=temp;
        }
    }
    printlist(head);
    multiply(head);
    return 0;
}
#include<stdio.h>
#include<stdlib.h>
struct node{
   int data;
   struct node*next;
};
struct node*createnode(int data){
    struct node*newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->next=NULL;
    return newnode;
}
struct node*insert(struct node*head,int data){
    struct node*newnode=createnode(data);
    if(head==NULL||head->data>data){
      newnode->next=head;
      head=newnode;
      return head;   
    }
    struct node*curr=head;
    while(curr->next!=NULL&&curr->next->data<data){
        curr=curr->next;
    }
    newnode->next=curr->next;
    curr->next=newnode;
    return head;
}
void printlist(struct node*head){
    struct node*temp=head;
    while(temp!=NULL){
        printf("%d->",temp->data);
        temp=temp->next;
    }
    printf("NULL\n");
}
int main()
{
    struct node*head=NULL;
    int value;
    do{
        printf("enter a value to insert:");
        scanf("%d",&value);
        head=insert(head,value);
        printlist(head);
    }while(value!=0);
    return 0;
}
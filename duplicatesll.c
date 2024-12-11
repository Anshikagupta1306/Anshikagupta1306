#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
};
struct node*head=NULL;
struct node*create(int data){
    struct node*newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->next=NULL;
    return newnode;
}
struct node*insertatend(int data){
    struct node*temp=head;
    struct node*newnode=create(data);
    if(head==NULL){
       head=newnode;
       return head;
    }
    if(head->next==NULL){
        head->next=newnode;
        newnode->next=NULL;
    }
    while(temp->next){
        temp=temp->next;
    }
    temp->next=newnode;
    newnode->next=NULL;
    return head;
}
struct node*removeduplicates(struct node*head){
    struct node*temp=head;
    struct node*node;
    if(head==NULL){
        return head;
    }
    while(temp->next!=NULL){
        if(temp->data==temp->next->data){
            node=temp->next->next;
            free(temp->next);
            temp->next=node;
        }
        else{
            temp=temp->next;
        }
    }
    return head;
}
void printlist(struct node*head){
    struct node*temp=head;
    while(temp){
        printf("%d->",temp->data);
       temp=temp->next;
    }
    printf("NULL\n");
}
int main(){
    struct node*head=NULL;
    struct node*last=NULL;
    int val;
    while(1){
        struct node*temp=create(val);
        printf("enter data:\n");
        scanf("%d",&val);
        if(val==0){
            break;
        }
        else{
        head=insertatend(val);
        }
    }
    printlist(head);
   head=removeduplicates(head);
    printlist(head);
    return 0;
}
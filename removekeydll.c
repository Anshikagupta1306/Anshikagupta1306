#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
    struct node*prev;
};
struct node*head=NULL;
struct node*create(int data){
    struct node*newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->next=NULL;
    newnode->prev=NULL;
    return newnode;
}
struct node*insertatend(int data){
  struct node*temp=create(data);
  struct node*curr=head;
  if(head==NULL){
    head=temp;
    return head;
  }
  while(curr->next){
    curr=curr->next;
  }
  curr->next=temp;
  temp->prev=curr;
  temp->next=NULL;
  return head;
}
void removekey(){
    int key;
    printf("enter key to remove:\n");
    scanf("%d",&key);
    struct node*temp=head;
    if(head==NULL){
        return;
    }
    if(head->data==key){
        head=temp->next;
        free(temp);
        head->prev=NULL;
    }
    while(temp->next!=NULL&&temp->next->data!=key){
        temp=temp->next;
    }
    struct node*node=temp->next;
    temp->next=node->next;
    node->next->prev=temp;
    free(node);
}
void printlist(){
    struct node*temp=head;
    while(temp){
        printf("%d<->",temp->data);
     temp=temp->next;
    }
    printf("NULL\n");
}
int main(){
    struct node*head=NULL;
    int val;
    while(1){
        printf("enter data:\n");
        scanf("%d",&val);
        if(val==0){
            break;
        }
        else{
         head=insertatend(val);
        }
    }
    printlist();
    removekey();
    printlist();
    return 0;
}
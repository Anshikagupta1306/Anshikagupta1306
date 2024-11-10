#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
};
struct node*head;
struct node*newnode(int val){
    struct node*temp=(struct node*)malloc(sizeof(struct node));
    if(temp==NULL){
     printf("heap overflow");
     return temp;
    }
    temp->data=val;
    temp->next=NULL;
    return temp;
}
void printlist(struct node*head){
    while(head){
        printf("%d->",head->data);
        head=head->next;
    }
    printf("NULL\n");
}
//add before
struct node* addbeforek(struct node*head,int val,int k){
    struct node*temp=newnode(val);
    struct node*itr=head;
    if(temp==NULL){
        return head;
    }
    if(head!=NULL && head->data==k){
        temp->next=head;
        return temp;
    }
    while(itr!=NULL && itr->next!=NULL){
         if(itr->next->data==k){
            temp->next=itr->next;
            itr->next=temp;
            return head;
         }
         itr=itr->next;
    }
    free(temp);
    return head;
}
//add after
struct node*addafterk(struct node*head,int val,int k){
    struct node*temp=newnode(val);
    struct node*itr=head;
    if(itr==NULL){
        return head;
    }
    if(head!=NULL && head->data==k){
        temp->next=head->next;
        head->next=temp;
        return head;
    }
    while(itr!=NULL){
        if(itr->data==k){
          temp->next=itr->next;
          itr->next=temp;
          return head;
        }
        itr=itr->next;
    }
}
int main(){
   struct node*last=NULL;
    int val;
    printf("enter the value of node:\n");
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
   int p,k;
   printf("enter the value of new node:\n");
   scanf("%d",&p);
   printf("enter the value of k:\n");
   scanf("%d",&k);
   addafterk(head,p,k);
   printlist(head);
   return 0;
}

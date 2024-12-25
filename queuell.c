#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*next;
};
struct queue{
    struct node*front;
    struct node*rear;
};
struct node*createnew(int data){
    struct node*new=(struct node*)malloc(sizeof(struct node));
    if(new==NULL){
        printf("no value is given\n");
        return 0;
    }
    new->next=NULL;
    new->data=data;
    return new;
}
struct queue* createqueue(){
    struct queue*q=(struct queue*)malloc(sizeof(struct queue));
    q->front=NULL;
    q->rear=NULL;
    return q;
}
bool isEmpty(struct queue*q){
 return q->front==NULL;
}
int peek(struct queue*q){
    if(q->front==NULL)
      q->rear==NULL;
    return q->front->data;
}
struct queue*enqueue(struct queue*q,int data){
    struct node*new=createnew(data);
    if(isEmpty(q)){
        q->rear=q->front=new;
    }
    else{
    q->rear->next=new;
    q->rear=new;
    }
}
int dequeue(struct queue*q){
    if(q->front==NULL){
        printf("queue is empty\n");
        return 0;
    }
    struct node*temp=q->front;
    q->front=q->front->next;
    int data=temp->data;
    if(q->front==NULL){
        q->rear=NULL;
    }
    free(temp);
    return data;
}
void display(struct queue*q){
    struct node*curr=q->front;
    while(curr){
        printf("%d ",curr->data);
        curr=curr->next;
    }
    printf("NULL\n");
}
int main(){
    struct queue*q=createqueue();
    enqueue(q,10);
    enqueue(q,20);
    enqueue(q,30);
    enqueue(q,40);
    display(q);
   printf("element dequeued is:%d",dequeue(q)); 
    return 0;
}
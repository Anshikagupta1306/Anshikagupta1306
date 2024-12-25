#include<stdio.h>
#include<stdlib.h>
#define MAX 100
struct queue{
   int front,rear;
   int items[MAX];
};
void initialize(struct queue *q){
   q->front=-1;
   q->rear=-1;
}
int isFull(struct queue*q){
    return (q->rear==MAX-1);
}
int isEmpty(struct queue*q){
    return(q->front==-1||q->front>q->rear);
}
//enqueue
void enqueue(struct queue*q,int value){
    if(isFull(q)){
        printf("queue is full\n");
    }
    else{
        if(q->front==-1){
          q->front=0;
        }
        q->rear++;
        q->items[q->rear] = value;
        printf("Enqueued %d\n", value);
    }
}
//dequeue
void dequeue(struct queue*q){
    if(isEmpty(q)){
        printf("queue is empty\n");
    }
    else{
        printf("dequeued:%d",q->items[q->front]);
        q->front++;
        if(q->front>q->rear){
            q->front=-1;
            q->rear=-1;
        }
    }
}
void display(struct queue*q){
    if(isEmpty(q)){
        printf("queue is empty\n");
    }
    else{
        printf("elements of queue:");
        for(int i=q->front;i<=q->rear;i++){
            printf("%d\t",q->items[i]);
        }
    }
    printf("\n");
}
int main(){
  struct queue q;
  int n,value;
  initialize(&q);
  printf("enter the number of elements:\n");
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    printf("enter the %d element:",i+1);
    scanf("%d",&value);
    enqueue(&q,value);
  }
  display(&q);
  dequeue(&q);

  return 0;
}
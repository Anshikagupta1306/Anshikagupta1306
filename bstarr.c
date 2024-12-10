#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*left;
    struct node*right;
};
struct node*createnode(int data){
    struct node*newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->left=NULL;
    newnode->right=NULL;
    return newnode;
}
struct node*insert(struct node*root,int data){
    if(root==NULL){
        return createnode(data);
    }
    if(data>root->data){
        root->right=insert(root->right,data);
    }
    else{
        root->left=insert(root->left,data);
    }
    return root;
}
void leftandroot(struct node*root,int arr[],int *i){
  if(root==NULL){
    return;
  }
  arr[(*i)++]=root->data;
  leftandroot(root->left,arr,i);
}
void storeright(struct node*root,int arr[],int *i){
    if(root==NULL){
        return;
    }
    storeright(root->right,arr,i);
    arr[(*i)++]=root->data;
}
void display(int *arr,int size){
   for(int i=0;i<size;i++){
    printf("%d ",arr[i]);
   }
   printf("\n");
}
int main(){
    struct node*root=NULL;
    int choice,data;
    int left[100],right[100];
    int li=0,ri=0;
    printf("enter numbers to add in BST (-1 to stop):\n");
    while(1){
        scanf("%d",&data);
        if(data==-1){
            break;
        }
        root=insert(root,data);
    }
    leftandroot(root,left,&li);
    storeright(root,right,&ri);
    printf("left subtree and root:");
    display(left,li);
    printf("right subtree:");
    display(right,ri);
    return 0;
}
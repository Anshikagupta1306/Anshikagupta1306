#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*left;
    struct node*right;
};
struct node*root=NULL;
struct node*createnode(){
    int data;
    printf("enter data:\n");
    scanf("%d",&data);
    struct node*newnode=(struct node*)malloc(sizeof(struct node));
    if(data==-1){
        return 0;
    }
        newnode->data=data;
        printf("left child:\n");
        newnode->left=createnode();
        printf("right child:\n");
        newnode->right=createnode();
    return newnode;
}
void preorder(struct node*root){
    if(root==NULL){
        return;
    }
    printf("%d ",root->data);
    preorder(root->left);
    preorder(root->right);
}
void inorder(struct node*root){
    if(root==NULL){
        return;
    }
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);
}
void postorder(struct node*root){
    if(root==NULL){
        return;
    }
    postorder(root->left);
    postorder(root->right);
    printf("%d ",root->data);
}
int main(){
     struct node*root=NULL;
     root=createnode();
     preorder(root);
      printf("\n");
     inorder(root);
      printf("\n");
     postorder(root);
      printf("\n");
    return 0;
}
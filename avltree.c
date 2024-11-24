#include<stdio.h>
#include<stdlib.h>
struct node{
  int data;
  struct node*left;
  struct node*right;
  int height;
};
int height(struct node*n){
  if(n==NULL){
    return 0;
  }
  return n->height;
}
struct node*createnode(int data){
  struct node*node=(struct node*)malloc(sizeof(struct node));
  node->data=data;
  node->left=NULL;
  node->right=NULL;
  node->height=1;
  return node;
}
int getbalance(struct node*n){
  if(n==NULL){
    return 0;
  }
  return height(n->left)-height(n->right);
}
struct node*rightrotate(struct node*y){
  struct node*x=y->left; 
  struct node*t2=x->right;
  x->right=y;
  y->left=t2;
  y->height=1+(height(y->left)>height(y->right)?height(y->left):height(y->right));
  x->height=1+(height(x->left)>height(x->right)?height(x->left):height(x->right));
  return x;
}
struct node*leftrotate(struct node*x){
  struct node*y=x->right;
  struct node*t2=y->left;
  y->left=x;
  x->right=t2;
  x->height = 1 + (height(x->left) > height(x->right) ? height(x->left) : height(x->right));
  y->height = 1 + (height(y->left) > height(y->right) ? height(y->left) : height(y->right));
    return y;
}
struct node*insert(struct node*root,int key){
  if(root==NULL){
    return createnode(key);
  }
  else{
    if(key<root->data){
      root->left=insert(root->left,key);
    }
    else if(key>root->data){
      root->right=insert(root->right,key);
    }
    else{
      return root;
    }
  }
  root->height=1+(height(root->left)>height(root->right)?height(root->left):height(root->right));
  int balance=getbalance(root);
  //left left case
  if(balance>1&&key<root->left->data){
    return rightrotate(root);
  }
  //right right case
  if(balance<-1&&key>root->right->data){
    return leftrotate(root);
  }
  //left right case
  if(balance>1&&key>root->left->data){
    root->left=leftrotate(root->left);
    return rightrotate(root);
  }
  //right left case
  if(balance<-1&&key<root->right->data){
    root->right=rightrotate(root->right);
    return leftrotate(root);
  }
  return root;
}
struct node*minvalue(struct node*root){
  struct node*curr=root;
  while(curr->left!=NULL){
    curr=curr->left;
  }
  return curr;
}
struct node*deletenode(struct node*root,int key){
  if(root==NULL){
    return root;
  }
   if (key <root->data){
        root->left = deletenode(root->left, key);
   }
    else if (key >root->data){
        root->right = deletenode(root->right, key);
    }
    else{
      //with one or no child 
      if((root->left==NULL)||(root->right==NULL)){
        struct node*temp=root->left?root->left:root->right;
        //no child case
      if(temp==NULL){
           root=NULL;
      }     
      else{
        *root=*temp;
        free(temp);
      }
    }
    else{
      //inorder successor
      struct node*temp=minvalue(root->right);
      root->data=temp->data;
      root->right=deletenode(root->right,temp->data);
    }
    }
     root->height=1+(height(root->left)>height(root->right)?height(root->left):height(root->right));
  int balance=getbalance(root);
  //left left case
  if(balance>1&&getbalance(root->left)>=0){
    return rightrotate(root);
  }
  //right right case
  if(balance<-1&&getbalance(root->right)>=0){
    return leftrotate(root);
  }
  //left right case
  if(balance>1&&getbalance(root->left)<0){
    root->left=leftrotate(root->left);
    return rightrotate(root);
  }
  //right left case
  if(balance<-1&&getbalance(root->right)>0){
    root->right=rightrotate(root->right);
    return leftrotate(root);
  }
  return root;
}
void inorder(struct node*root){
  if(root!=NULL){
     inorder(root->left);
     printf("%d ",root->data);
     inorder(root->right);
  }
}
int main() {
    struct node* root = NULL;
    int keys[] = {10, 20, 30, 40, 50, 25};
    int n = sizeof(keys) / sizeof(keys[0]);
    for (int i = 0; i < n; i++) {
        root = insert(root, keys[i]);
    }
    printf("In-order traversal of the AVL tree:\n");
    inorder(root);
    printf("\n");
    int data;
    printf("enter node to delete:\n");
    scanf("%d",&data);
    root=deletenode(root,data);
    inorder(root);
    return 0;
}
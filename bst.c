#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*left;
    struct node*right;
};
//creating tree
struct node*createnode(int data){
    struct node*newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->left=NULL;
    newnode->right=NULL;
    return newnode;
}
//inserting a node
struct node*insertelement(struct node*root,int data){
    if(root==NULL){
        return createnode(data);
    }
    if(data<root->data){
       root->left=insertelement(root->left,data);
    }else if(data>root->data){
        root->right=insertelement(root->right,data);
    }
    return root;
}
struct node*minvalue(struct node*root,int key){
    struct node*current=root;
    while(current&&current->left!=NULL){
          current=current->left;
    }
    return current;
}
//finding the depth of a specific node
int depth(struct node*root,int key){
    int depth=0;
    struct node*curr=root;
    while(curr!=NULL){
        if(curr->data==key){
            return depth;
        }
        if(key<curr->data){
            curr=curr->left;
        }
        else{
            curr=curr->right;
        }
        depth++;
    }
    return -1;
}
// finding the height of binary search tree
int height(struct node*root){
    if(root==NULL){
        return -1;
    }
    int leftheight=height(root->left);
    int rightheight=height(root->right);
    return (leftheight>rightheight?leftheight:rightheight)+1;
}
void printlevel(struct node*root,int level){
    if(root==NULL){
        return;
    }
    if(level==1){
        printf("%d",root->data);
    }
    else if(level>1){
        printlevel(root->left,level-1);
        printlevel(root->right,level-1);
    }
}
void levelordertraversal(struct node*root){
    int h=height(root);
    for(int i=0;i<=h;i++){
       printlevel(root,i);
    }
}
//delete a node
struct node*delete(struct node*root,int key){
    if(root==NULL){
        return root;
    }
    if(key<root->data){
        root->left=delete(root->left,key);
    }
    else if(key>root->data){
        root->right=delete(root->right,key);
    }
    else{
        //no or only one child
        if(root->left==NULL){
            struct node*temp=root->right;
            free(root);
            return temp;
        }
        else if(root->right==NULL){
            struct node*temp=root->left;
            free(root);
            return temp;
        }
        struct node*temp=minvalue(root->right,temp->data);
        root->data=temp->data;
        root->right=delete(root->right,temp->data);
        return root;
    }
}
//inorder
void inorder(struct node*root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}
//postorder
void postorder(struct node*root){
    if(root!=NULL){
        postorder(root->left);
        postorder(root->right);
        printf("%d ",root->data);
    }
}
//preorder
void preorder(struct node*root){
    if(root!=NULL){
        printf("%d ",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}
//search 
bool search(struct node*root,int key){
    if(root==NULL){
        return 0;
    }
    else{
        if(key<root->data){
            return (root->left,key);
        }
        else{
            return (root->right,key);
        }
    }
}
int main(){
    struct node*root=NULL;
    int ch,data,h;
    do{
        printf("\npress:\n 1.insert element\n 2.inorder traversal\n 3.postorder traversal\n 4.preorder traversal\n 5.delete a node\n 6.search an element\n 7.find the height of the tree\n 8.find the depth of a node\n 9.level order traversal\n 10.exit\n");
        scanf("%d",&ch);
        switch(ch){
            case 1:printf("enter data:\n");
                   scanf("%d",&data);
                   root=insertelement(root,data);
                   break;
            case 2:inorder(root);
                   break;
            case 3:postorder(root);
                   break;
            case 4:preorder(root);
                   break;
            case 5:printf("enter data to delete:\n");
                   scanf("%d",&data);
                   delete(root,data);
                   inorder(root);
                   break;
            case 6:printf("enter data to search:\n");
                    scanf("%d",&data);
                    if(search(root,data)){
                    printf("key found");
                    }
                    break;
            case 7:h=height(root);
                   printf("%d",h);
                   break;
            case 8:printf("enter data to search:\n");
                    scanf("%d",&data);
                    h=depth(root,data);
                   printf("%d",h);
                   break;
            case 9:levelordertraversal(root);
                    break;
            case 10:break;

        }
    }while(ch!=10);
    return 0;
}
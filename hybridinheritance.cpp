#include<iostream>
using namespace std;
class A{
   public:
    void messageA(){
        cout<<"\n class A";
    }
};
class B:public A{
   public:
   void messageB(){
    cout<<"\n class B";
   }
};
class C:public A{
  public:
  void messageC(){
    cout<<"\n class C";
  }
};
class D:public B{
   public:
   void messageD(){
    cout<<"\n class D";
   }
};
int main(){
    A a;
    B b;
    C c;
    D d;
    a.messageA();
    b.messageB();
    b.messageA();
    c.messageC();
    c.messageA();
    d.messageD();
    d.messageB();
    d.messageA();
    return 0;
}
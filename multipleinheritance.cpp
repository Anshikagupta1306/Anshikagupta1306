#include<iostream>
using namespace std;
//base class 1
class A{
  protected:
   int a;
  public:
  void inputa(){
    cout<<"enter the value of a:\n";
    cin>>a;
  }
};
//base class 2
class B{
    protected:
    int b;
    public:
    void inputb(){
        cout<<"enter the value of b:\n";
        cin>>b;
    }
};
//derived class
class C:public A,public B{
 public:
  void addition(){
    cout<<"addition of a and b is:"<<a+b<<endl;
  }
};
int main(){
    C aa;
    aa.inputa();
    aa.inputb();
    aa.addition();
    return 0;
}
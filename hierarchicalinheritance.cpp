#include<iostream>
using namespace std;
//base class
class A{
   public:
    void message(){
        cout<<"\n welcome to inheritance"<<endl;
    }
};
//derived class
class B:public A{
    public:
     void display(){
        cout<<"\n in class B"<<endl;
     }
};
//second derived class
class C:public A{
   public:
    void putdata(){
        cout<<"\n in class C"<<endl;
    }
};
int main(){
    B aa;
    C ab;
    aa.display();
    aa.message();
    ab.putdata();
    ab.message();
    return 0;
}
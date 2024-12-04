#include<iostream>
using namespace std;
class complex{
   private:
   int img;
   int real;
   public:
   complex(){

   }
   complex(int real,int img){
    this->img=img;
    this->real=real;
   }
   friend complex operator +(complex,complex);
   friend complex operator -(complex,complex);
   friend bool operator ==(complex,complex);
   void show(){
    cout<<real<<"\t"<<img<<endl;
   }
   ~complex(){}
};
complex operator +(complex d1,complex d2){
    complex dd;
    dd.real=d1.real+d2.real;
    dd.img=d1.img+d2.img;
    return dd;
}
complex operator -(complex d1,complex d2){
    complex dd;
    dd.real=d1.real-d2.real;
    dd.img=d1.img-d2.img;
    return dd;
}
bool operator ==(complex d1,complex d2){
    return(d1.real==d2.real&&d1.img==d2.img);
}
int main(){
    complex c1(4,4),c2(4,4);
    complex c3;
    c3=c1+c2;
    c3.show();
    c3=c1-c2;
    c3.show();
    if(c1==c2){
        cout<<"equal"<<endl;
    }
    else{
        cout<<"not equal"<<endl;
    }
  return 0;

}
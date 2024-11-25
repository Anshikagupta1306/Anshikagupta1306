#include<iostream>
using namespace std;
class numbers{
 private:
 int x;
 public:
 numbers(){}
 numbers(int n){
    x=n;
 }
 void showdata(){
    cout<<"x="<<x<<endl;
 }
 friend numbers operator -(numbers);
 friend numbers operator ++(numbers&);//pre
 friend numbers operator ++(numbers&,int);//post
 friend numbers operator --(numbers&);//pre
 friend numbers operator --(numbers&,int);//post
};
numbers operator -(numbers d){
   d.x=-d.x;
   return d;
}
numbers operator ++(numbers &d){
    d.x++;
    return d;
}
numbers operator ++(numbers &d,int){
     return (d.x++);
}
numbers operator --(numbers &d){
    d.x--;
    return d;
}
numbers operator --(numbers &d,int){
    return (d.x--);
}

int main(){
    numbers n1(10),n2,n3(20),n4,n5(30),n6,n7(40),n8,n9(50),n10;
    n2=-n1;
    n2.showdata();
    n4=++n3;
    n4.showdata();
    n6=n5++;
    n6.showdata();
    n8=--n7;
    n8.showdata();
    n10=n9--;
    n10.showdata();
   return 0;
}
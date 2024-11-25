#include<iostream>
using namespace std;
class Numbers{
   private:
   int x;
   public:
   Numbers(){
   }
   Numbers(int n){
    x=n;
   }
   void showdata(){
    cout<<"x="<<x<<endl;
   }
   Numbers operator -(){
    return Numbers(-x);
   }
   Numbers operator ++(){ //pre increment 
    x++;
    return Numbers(x);
   } 
   Numbers operator --(){ //pre decrement
    x--;
    return Numbers(x);
   }
   Numbers operator --(int){ //post decrement
    return Numbers(x--);
   }
   Numbers operator ++(int){ //post increment
     return Numbers(x++);
   }
};
int main(){
    Numbers n1(10),n2,n3(20),n4,n5(30),n6,n7;
    n2= ++n1;
    n2.showdata();
    n4=--n3;
    n4.showdata();
    n6=n5++;
    n6.showdata();
    n7=n5--;
    n7.showdata();
     return 0;    
}
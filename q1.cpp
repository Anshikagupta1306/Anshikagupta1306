#include<iostream>
#include<string>
using namespace std;
class user{
   private:
   int units;
   string name;
   float charges;
   float calculatecharges(){
    float total=0;
    if(units<100){
        total=units*0.60;
    }
    else if(units>300){
        total=100*0.60+(units-100)*0.80;
    }
    else{
        total=100*0.60+200*0.80+(units-300)*0.90;
    }
    if(total<50){
        total=50;
    }
    if(total>300){
        total+=total*0.15;
    }
    return total;
   }
   public:
   void getdata(){
    cout<<"enter the name of the user:"<<endl;
    cin>>name;
    cout<<"enter the units:"<<endl;
    cin>>units;
    charges=calculatecharges();
   }
   void display(){
    cout<<"details:"<<endl;
    cout<<"name:"<<name<<endl;
    cout<<"units:"<<units<<endl;
    cout<<"total bill:"<<charges<<endl;
   }
};
int main(){
    int n;
    cout<<"enter the number of users:"<<endl;
    cin>>n;
    user*users=new user[n];
    for(int i=0;i<n;i++){
        users[i].getdata();
    }
    for(int i=0;i<n;i++){
        users[i].display();
    }
    return 0;
}
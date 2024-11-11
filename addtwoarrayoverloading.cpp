#include<iostream>
using namespace std;
class Array{
    private:
       int arr[10];
       int size;
    public:
       Array(){
        for(int i=0;i<10;i++){
            arr[i]=0;
        }
        size=0;
       };
       Array(int n){
           size=n;
           cout<<"enter the elements\n";
           for(int i=0;i<size;i++){
            cin>>arr[i];
           }
       }
       void showdata(){
        for(int i=0;i<size;i++){
            cout<<arr[i];
        }
       }
       Array operator+(Array &a1){
        Array temp;
        temp.size=size;
         for(int i=0;i<size;i++){
            temp.arr[i]=arr[i]+a1.arr[i];
         }
         return temp;
       }
};
int main(){
    int n;
    cout<<"enter the size of the array:\n";
    cin>>n;
    Array a1(n),a2(n),a3;
    a3=a1+a2;
    cout<<"the resultant array is:";
    a3.showdata();
    return 0;
}
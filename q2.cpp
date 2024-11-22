#include<iostream>
#include<string>
using namespace std;
class Remove{
    private:
    string s;
    char k;
    public:
    void getdata(){
        cout<<"enter string to remove a particular character:"<<endl;
        getline(cin,s);
        cout<<"enter character to remove:"<<endl;
        cin>>k;
    }
    void display(){
        cout<<"original string:"<<s<<endl;
        cout<<"new string:";
        for(int i=0;s[i]!='\0';i++){
            if(s[i]!=k){
                cout<<s[i];
            }
        }
    }
};
int main(){
    Remove d;
    d.getdata();
    d.display();
    return 0;
}
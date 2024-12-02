#include<iostream>
using namespace std;
class invoice{
   private:
   string partNumber,partDescription;
   int quantity;
   double price_per_item;
   public:
   invoice(){
    cout<<"enter part number:"<<endl;
    getline(cin,partNumber);
    cout<<"enter part description:"<<endl;
    getline(cin,partDescription);
    cout<<"enter quantity:"<<endl;
    cin>>quantity;
    cout<<"enter price:"<<endl;
    cin>>price_per_item;
   }
   void setnum(string n){
    partNumber=n;
   }
   string displaynum(){
    return partNumber;
   }
   void setqty(int qty){
    if(qty>0){
        quantity=qty;
    }
    else{
        quantity=0;
    }
   }
   int getqty(){
    return quantity;
   }
   void setpartDecript(string des){
       partDescription=des;
   }
   string getpartDescript(){
    return partDescription;
   }
   void getprice(double price){
       price_per_item=price;
   }
   double getprice(){
    return price_per_item;
   }
   double getamount(){
    return quantity*price_per_item;
   }
   ~invoice(){

   }
};
int main(){
    invoice d;
    cout<<"invoice:"<<endl;
    cout<<"Part Number : " <<d.displaynum()<<endl;
cout<<"Part Description : "<<d.getpartDescript()<<endl;
cout<<"Quantity : "<<d.getqty()<<endl;
cout<<"Price per item : "<<d.getprice()<<endl;
cout<<"Amount : "<<d.getamount();
return 0;

}
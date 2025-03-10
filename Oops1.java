import  java.util.*;
public class Oops1 {
    public static void main(String[] args) {

        Complex c1=new Complex(4, 5);
        Complex c2=new Complex(3, -2);
        Complex sum=c1.sum(c2);
        Complex diff=c1.difference(c2);
        Complex diviComplex=c1.divide(c2);
        Complex multiComplex=c1.multiply(c2);
        System.out.println("sum:");
        sum.display();
        System.out.println("difference:");
        diff.display();
        System.out.println("division:");
        diviComplex.display();
        System.out.println("multiplication:");
        multiComplex.display();
    }
}
class Complex{
  int r;
  int i;

  Complex(int r,int i){
    this.r=r;
    this.i=i;
  }

  public Complex sum(Complex c) {
    return new Complex(this.r + c.r, this.i + c.i);
}
  
  public Complex difference(Complex c){
    return new Complex(this.r-c.r,this.i-i);
  }

  public Complex divide(Complex c) {
    int denominator = c.r * c.r + c.i * c.i;
    int realPart = (this.r * c.r + this.i * c.i) / denominator;
    int imagPart = (this.i * c.r - this.r * c.i) / denominator;
    return new Complex(realPart, imagPart);
}
public Complex multiply(Complex c) {
    int realPart = (this.r * c.r) - (this.i * c.i);
    int imagPart = (this.r * c.i) + (this.i * c.r);
    return new Complex(realPart, imagPart);
}
  public void display(){
    System.out.println(r+" + "+i+"i");
  }
}

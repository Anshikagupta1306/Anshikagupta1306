import java.util.*;
interface Volume {
    void displayVolume();
} 
class Cone implements Volume{
    double r;
    double h;
    Cone(double r,double h){
     this.r=r;
     this.h=h;
    }
    public void displayVolume(){
        System.out.println("volume of cone is: "+(1.0/3)*Math.PI*Math.pow(r, 2)*h);
    }
}
class Hemisphere implements Volume {
    double r;
    Hemisphere(double r){
        this.r=r;
    }
    public void displayVolume(){
        System.out.println("volume of hemisphere is: "+2*Math.PI*Math.pow(r,3)/3);
    }
}
class cylinder implements Volume{
    double r;
    double h;
    cylinder(double r,double h){
        this.r=r;
        this.h=h;
    }
    public void displayVolume(){
        System.out.println("volume of cylinder is: "+Math.PI*Math.pow(r, 2)*h);
    }
}
public class volumemain {
 public static void main(String[] args) {
   Volume cone=new Cone(3,5);
   Volume cylinder=new cylinder(3, 5);
   Volume hemisphere=new Hemisphere(3);
   cone.displayVolume();
   cylinder.displayVolume();
   hemisphere.displayVolume();    
 }
    
}

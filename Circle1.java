package circle1;
public class Circle1 {
private double radius =1;
public double getArea(){
    return radius*radius*Math.PI;
    
}
    public static void main(String[] args) {
      Circle1 myCircle=new Circle1();
      System.out.println("Radius is"+myCircle.radius);
    }
    
}

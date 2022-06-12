public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle(3.75);
        Cylinder cylinder = new Cylinder(5.55, 7.5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getAreaOfCircle());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getVolume());
    }
}
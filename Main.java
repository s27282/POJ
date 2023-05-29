class Circle {
    private double radious;
    private String color;
    public Circle() {
        radious = 1.0;
        color = "green";
    }

    public Circle(double r) {
        radious = r;
        color = "blue";
    }

    public double getRadious() {
        return radious;
    }

    public double getArea() {
        return radious * radious * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setRadious(double r) {
        radious = r;
    }

    public void setColor(String c) {
        color = c;
    }

    public String toString() {
        return "Circle(radius= " + radious + ",color= " + color + ")";
    }


}
class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super();
        height = 4.0;
    }

    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public String toString() {
        return "Cylinder(height=" + height + "," + super.toString() + ")";
    }

}
class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadious() + " and area of " + c1.getArea()+ " and color of " + c1.getColor());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadious() + " and area of " + c2.getArea()+ " and color of " + c2.getColor());
        Cylinder cl1 = new Cylinder();
        System.out.println("The cylinder has radius of " + cl1.getRadious() + " and area of " + cl1.getArea() + " and height of " + cl1.getHeight()+ " and color of " + cl1.getColor());
        Cylinder cl2 = new Cylinder(2.0, 3.0);
        System.out.println("The cylinder has radius of " + cl2.getRadious() + " and area of " + cl2.getArea() + " and height of " + cl2.getHeight()+ " and color of " + cl2.getColor());

    }

}
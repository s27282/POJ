class Circle {

    public static final String ANSI_RED = "\u001B[31m";
    
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return ANSI_RED+"Circle: radius= " + this.radius + " color= " + this.color ;
    }
    
    
    public static void main(String[] args) {

        Circle circle1 = new Circle();

        System.out.println(ANSI_RED+"This circle c1 has radius of "+circle1.getRadius()+" and area of "+circle1.getArea()+" and color of "+circle1.getColor());
        System.out.println(circle1);

        Circle circle2 = new Circle(2.0);

        System.out.println(ANSI_RED+"This circle c2 has radius of "+circle2.getRadius()+" and area of "+circle2.getArea()+" and color of "+circle2.getColor());
        System.out.println(circle2);

        Circle circle3 = new Circle(5.0, "blue");
        
        System.out.println(ANSI_RED+"This circle c3 has radius of "+circle3.getRadius()+" and area of "+circle3.getArea()+" and color of "+circle3.getColor());
        System.out.println(circle3);

        Circle circle4 = new Circle();
        
        circle4.setRadius(8.0);
        circle4.setColor("purple");
        System.out.println(ANSI_RED+"This circle c4 has radius of "+circle4.getRadius()+" and area of "+circle4.getArea()+" and color of "+circle4.getColor());
        System.out.println(circle4);
    }
}

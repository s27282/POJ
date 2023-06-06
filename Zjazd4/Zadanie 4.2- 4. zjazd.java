class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(145, 10000, "red", 10);
        Ford ford1 = new Ford(150, 4999, "black", 2009, 10);
        Ford ford2 = new Ford(170, 5500, "pink", 2015, 5);
        Truck truck = new Truck(190, 850000, "silver", 7000);

        System.out.println(sedan.getPurchaseInfo() + sedan.getSalePrice());
        System.out.println(ford1.getPurchaseInfo() + ford1.getSalePrice());
        System.out.println(ford2.getPurchaseInfo() + ford2.getSalePrice());
        System.out.println(truck.getPurchaseInfo() + truck.getSalePrice());
    }
}
class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}
class Ford extends Car implements Purchase {
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }

    public String getPurchaseInfo() {
        return "FORD: ";
    }
}
interface Purchase {
    String getPurchaseInfo();
}
class Sedan extends Car implements Purchase {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95;
        } else {
            return super.getSalePrice() * 0.9;
        }
    }

    public String getPurchaseInfo() {
        return "SEDAN: ";
    }
}
class Truck extends Car implements Purchase {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice();
        }
    }
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }
}